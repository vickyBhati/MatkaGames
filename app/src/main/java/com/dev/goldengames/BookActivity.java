package com.dev.goldengames;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.View.IBhavListView;
import com.dev.goldengames.api_presnter.BhavListPresenter;
import com.dev.goldengames.databinding.FragmentAddCustomerBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BhavListModel;
import com.dev.goldengames.model.NewLoginModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookActivity extends BaseActivity implements IBhavListView {

    FragmentAddCustomerBinding binding;
    String gameid,type;
    String single,jodi,single_patti,double_patti,triple_patti,full_sagam,half_sangm;
    String open_end_time,close_end_time;
    BhavListPresenter presenter;
    String match_name;
    NewLoginModel userinfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.fragment_add_customer);
        binding.myTool.ll.setVisibility(View.VISIBLE);

//        binding.myTool.title.setText("Book");
        binding.myTool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        userinfo = AppPreference.getUserInfo(BookActivity.this);

        Intent intent = getIntent();
        if (intent!=null){
            binding.myTool.title.setText(intent.getStringExtra("name"));
            match_name=intent.getStringExtra("name");
            gameid = intent.getStringExtra("id");
            open_end_time= intent.getStringExtra("open_end_time");
            close_end_time= intent.getStringExtra("close_end_time");
        }

        presenter = new BhavListPresenter();
        presenter.setView(this);


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("tessttt",""+AppPreference.getString(getApplicationContext(),"wallet"));
        binding.myTool.txtWallet.setText(AppPreference.getString(getApplicationContext(),"wallet"));
        callApi();
    }

    private void callApi() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
//            map.put("userId", "" + userinfo.getData().getId());
            presenter.dashboard(this);
        } else {
            Utility.no_internet(this);
        }
    }


    @Override
    public void onSuccess(BhavListModel body) {

        if (body!=null){
            if(body.getStatus()==1){
                single = String.valueOf(body.getData().getSingle().getFull_bhav());
                jodi = String.valueOf(body.getData().getJodi().getFull_bhav());
                single_patti = String.valueOf(body.getData().getSinglepatti().getFull_bhav());
                double_patti = String.valueOf(body.getData().getDoublepatti().getFull_bhav());
                triple_patti = String.valueOf(body.getData().getTriplepatti().getFull_bhav());
                full_sagam = String.valueOf(body.getData().getFullsangam().getFull_bhav());
                half_sangm = String.valueOf(body.getData().getHalfsangam().getFull_bhav());
                Log.e("test",""+single);
            }
        }
    }

    @Override
    public Context getContext() {
        return this;
    }

    public void onClick(View view) {
        final Intent intent;
        switch (view.getId()){
        case R.id.llSingle:
            String currentTimeApi = "";
            String isopen = "0";
            String isclose = "0";
            Calendar calendar2 = Calendar.getInstance();
            SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
            String currentTime2 = formatter2.format(calendar2.getTime());
            try {
                Date dbDate = formatter2.parse(currentTime2);
                currentTimeApi = String.valueOf(dbDate);
                Log.e("currentTimeApi",currentTimeApi);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  format = new SimpleDateFormat("HH:mm:ss");
            Date open_end = new Date();
            Date close_end=new Date();
            try {
                open_end = format.parse(open_end_time);
                close_end = format.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentime = currentTimeApi.compareTo(String.valueOf(open_end));
            int closetime = currentTimeApi.compareTo(String.valueOf(close_end));
            if (closetime<0){
                isclose ="1";
            }
            if (opentime<0){
                isopen ="1";
            }
            Log.e("open",""+isopen);
            Log.e("close",""+isclose);

            if (isclose.equals("0") && isopen.equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else {
                final Dialog dialogBuilder = new Dialog(BookActivity.this);
                dialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                final View dialogView = LayoutInflater.from(BookActivity.this).inflate(R.layout.popup_open_close, null);
                dialogBuilder.setContentView(dialogView);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialogBuilder.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.CENTER;
                dialogBuilder.getWindow().setAttributes(lp);
                TextView open = (TextView) dialogView.findViewById(R.id.open);
                TextView close = (TextView) dialogView.findViewById(R.id.close);
                if (isopen.equals("0")){
                    open.setVisibility(View.GONE);
                }
                else {
                    open.setVisibility(View.VISIBLE);
                }
                if (isclose.equals("0")){
                    close.setVisibility(View.GONE);
                }
                else {
                    close.setVisibility(View.VISIBLE);
                }

                open.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, PlayGame.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+single);
                        intent.putExtra("type", ""+"single");
                        intent.putExtra("bettype", ""+"Open");
                        intent.putExtra("match_name", ""+match_name);
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        startActivity(intent);
                        dialogBuilder.dismiss();
                    }
                });
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, PlayGame.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+single);
                        intent.putExtra("type", ""+"single");
                        intent.putExtra("match_name", ""+match_name);
                        intent.putExtra("bettype", ""+"Close");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        startActivity(intent);
                        dialogBuilder.dismiss();

                    }
                });
                dialogBuilder.show();
            }
            break;
        case R.id.llJodi:

            String currentTimeApiJodi = "";
            String isopenJodi = "0";
            String iscloseJodi = "0";
            Calendar calendar2Jodi = Calendar.getInstance();
            SimpleDateFormat formatter2Jodi = new SimpleDateFormat("HH:mm:ss");
            String currentTime2Jodi = formatter2Jodi.format(calendar2Jodi.getTime());
            try {
                Date dbDate = formatter2Jodi.parse(currentTime2Jodi);
                currentTimeApiJodi = String.valueOf(dbDate);
                Log.e("currentTimeApi",currentTimeApiJodi);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formatJodi = new SimpleDateFormat("HH:mm:ss");
            Date open_endJodi = new Date();
            Date close_endJodi=new Date();
            try {
                open_endJodi = formatJodi.parse(open_end_time);
                close_endJodi = formatJodi.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimeJodi = currentTimeApiJodi.compareTo(String.valueOf(open_endJodi));
            int closetimeJodi = currentTimeApiJodi.compareTo(String.valueOf(close_endJodi));
            if (closetimeJodi<0){
                iscloseJodi ="1";
            }
            if (opentimeJodi<0){
                isopenJodi ="1";
            }
            Log.e("open",""+isopenJodi);
            Log.e("close",""+iscloseJodi);

            if (iscloseJodi.equals("0") && isopenJodi.equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else if (isopenJodi.equals("0")){
                Utility.showToast(binding.llMain,"Market Either close or not open");

            }
            else {
                intent= new Intent(BookActivity.this, DivJodiPlay.class);
                intent.putExtra("id", ""+gameid);
                intent.putExtra("bhav", ""+jodi);
                intent.putExtra("type", ""+"jodi");
                intent.putExtra("bettype", ""+"jodi");
                intent.putExtra("match_name", ""+match_name);
                intent.putExtra("open_end_time", ""+open_end_time);
                intent.putExtra("close_end_time", ""+close_end_time);
                startActivity(intent);
            }

            break;
        case R.id.llSinglePanna:
            String currentTimeApisinglePatti = "";
            String isopensinglePatti = "0";
            String isclosesinglePatti = "0";
            Calendar calendar2singlePatti = Calendar.getInstance();
            SimpleDateFormat formatter2singlePatti = new SimpleDateFormat("HH:mm:ss");
            String currentTime2singlePatti = formatter2singlePatti.format(calendar2singlePatti.getTime());
            try {
                Date dbDate = formatter2singlePatti.parse(currentTime2singlePatti);
                currentTimeApisinglePatti = String.valueOf(dbDate);
                Log.e("currentTimeApi",currentTimeApisinglePatti);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formatsinglePatti = new SimpleDateFormat("HH:mm:ss");
            Date open_endsinglePatti = new Date();
            Date close_endsinglePatti=new Date();
            try {
                open_endsinglePatti = formatsinglePatti.parse(open_end_time);
                close_endsinglePatti = formatsinglePatti.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimesinglePatti = currentTimeApisinglePatti.compareTo(String.valueOf(open_endsinglePatti));
            int closetimesinglePatti = currentTimeApisinglePatti.compareTo(String.valueOf(close_endsinglePatti));
            if (closetimesinglePatti<0){
                isclosesinglePatti ="1";
            }
            if (opentimesinglePatti<0){
                isopensinglePatti ="1";
            }
            Log.e("open",""+isopensinglePatti);
            Log.e("close",""+isclosesinglePatti);

            if (isclosesinglePatti.equals("0") && isopensinglePatti.equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else {
                final Dialog dialogBuilder = new Dialog(BookActivity.this);
                dialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                final View dialogView = LayoutInflater.from(BookActivity.this).inflate(R.layout.popup_open_close, null);
                dialogBuilder.setContentView(dialogView);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialogBuilder.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.CENTER;

                dialogBuilder.getWindow().setAttributes(lp);
                TextView open = (TextView) dialogView.findViewById(R.id.open);
                TextView close = (TextView) dialogView.findViewById(R.id.close);
                if (isopensinglePatti.equals("0")){
                    open.setVisibility(View.GONE);
                }
                else {
                    open.setVisibility(View.VISIBLE);
                }
                if (isclosesinglePatti.equals("0")){
                    close.setVisibility(View.GONE);
                }
                else {
                    close.setVisibility(View.VISIBLE);
                }

                open.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivSinglePati.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+single_patti);
                        intent.putExtra("type", ""+"single-patti");
                        intent.putExtra("bettype", ""+"Open");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);
                        startActivity(intent);
                        dialogBuilder.dismiss();
                    }
                });
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivSinglePati.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+single_patti);
                        intent.putExtra("type", ""+"single-patti");
                        intent.putExtra("bettype", ""+"Close");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);
                        startActivity(intent);
                        dialogBuilder.dismiss();
                    }
                });
                dialogBuilder.show();
            }
//                intent= new Intent(ActivityBook.this, DivSinglePati.class);
//                intent.putExtra("id", ""+gameid);
//                intent.putExtra("bhav", ""+single_patti);
//                intent.putExtra("type", ""+"single-patti");
//                intent.putExtra("open_end_time", ""+open_end_time);
//                intent.putExtra("close_end_time", ""+close_end_time);
//                startActivity(intent);

            break;
        case R.id.llDoublePana:
            String currentTimeApidoublePatti = "";
            String isopendoublePatti = "0";
            String isclosedoublePatti = "0";
            Calendar calendar2doublePatti = Calendar.getInstance();
            SimpleDateFormat formatter2doublePatti = new SimpleDateFormat("HH:mm:ss");
            String currentTime2doublePatti = formatter2doublePatti.format(calendar2doublePatti.getTime());
            try {
                Date dbDate = formatter2doublePatti.parse(currentTime2doublePatti);
                currentTimeApidoublePatti = String.valueOf(dbDate);
                Log.e("currentTimeApi",currentTimeApidoublePatti);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formatdoublePatti = new SimpleDateFormat("HH:mm:ss");
            Date open_enddoublePatti = new Date();
            Date close_enddoublePatti=new Date();
            try {
                open_enddoublePatti = formatdoublePatti.parse(open_end_time);
                close_enddoublePatti = formatdoublePatti.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimedoublePatti = currentTimeApidoublePatti.compareTo(String.valueOf(open_enddoublePatti));
            int closetimedoublePatti = currentTimeApidoublePatti.compareTo(String.valueOf(close_enddoublePatti));
            if (closetimedoublePatti<0){
                isclosedoublePatti ="1";
            }
            if (opentimedoublePatti<0){
                isopendoublePatti ="1";
            }
            Log.e("open",""+isopendoublePatti);
            Log.e("close",""+isclosedoublePatti);

            if (isclosedoublePatti.equals("0") && isopendoublePatti.equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else {
                final Dialog dialogBuilder = new Dialog(BookActivity.this);
                dialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                final View dialogView = LayoutInflater.from(BookActivity.this).inflate(R.layout.popup_open_close, null);
                dialogBuilder.setContentView(dialogView);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialogBuilder.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.CENTER;

                dialogBuilder.getWindow().setAttributes(lp);
                TextView open = (TextView) dialogView.findViewById(R.id.open);
                TextView close = (TextView) dialogView.findViewById(R.id.close);
                if (isopendoublePatti.equals("0")){
                    open.setVisibility(View.GONE);
                }
                else {
                    open.setVisibility(View.VISIBLE);
                }
                if (isclosedoublePatti.equals("0")){
                    close.setVisibility(View.GONE);
                }
                else {
                    close.setVisibility(View.VISIBLE);
                }

                open.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivSinglePati.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+double_patti);
                        intent.putExtra("type", ""+"double-patti");
                        intent.putExtra("bettype", ""+"Open");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);

                        startActivity(intent);
                        dialogBuilder.dismiss();
                    }
                });
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivSinglePati.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+double_patti);
                        intent.putExtra("type", ""+"double-patti");
                        intent.putExtra("bettype", ""+"Close");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);

                        startActivity(intent);
                        dialogBuilder.dismiss();                        }
                });
                dialogBuilder.show();
            }

            break;
        case R.id.llTriplePanna:
            String currentTimeApiTriple = "";
            String isopenTriple = "0";
            String iscloseTriple = "0";
            Calendar calendar2Triple = Calendar.getInstance();
            SimpleDateFormat formatter2Triple = new SimpleDateFormat("HH:mm:ss");
            String currentTime2Triple = formatter2Triple.format(calendar2Triple.getTime());
            try {
                Date dbDate = formatter2Triple.parse(currentTime2Triple);
                currentTimeApiTriple = String.valueOf(dbDate);
                Log.e("currentTimeApi",currentTimeApiTriple);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formatTriple = new SimpleDateFormat("HH:mm:ss");
            Date open_endTriple = new Date();
            Date close_endTriple=new Date();
            try {
                open_endTriple = formatTriple.parse(open_end_time);
                close_endTriple = formatTriple.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimeTriple = currentTimeApiTriple.compareTo(String.valueOf(open_endTriple));
            int closetimeTriple = currentTimeApiTriple.compareTo(String.valueOf(close_endTriple));
            if (closetimeTriple<0){
                iscloseTriple ="1";
            }
            if (opentimeTriple<0){
                isopenTriple ="1";
            }
            Log.e("open",""+isopenTriple);
            Log.e("close",""+iscloseTriple);

            if (iscloseTriple.equals("0") && isopenTriple.equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else {
                final Dialog dialogBuilder = new Dialog(BookActivity.this);
                dialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                final View dialogView = LayoutInflater.from(BookActivity.this).inflate(R.layout.popup_open_close, null);
                dialogBuilder.setContentView(dialogView);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialogBuilder.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.CENTER;

                dialogBuilder.getWindow().setAttributes(lp);
                TextView open = (TextView) dialogView.findViewById(R.id.open);
                TextView close = (TextView) dialogView.findViewById(R.id.close);
                if (isopenTriple.equals("0")){
                    open.setVisibility(View.GONE);
                }
                else {
                    open.setVisibility(View.VISIBLE);
                }
                if (iscloseTriple.equals("0")){
                    close.setVisibility(View.GONE);
                }
                else {
                    close.setVisibility(View.VISIBLE);
                }

                open.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivTriplePatti.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+triple_patti);
                        intent.putExtra("type", ""+"triple-patti");
                        intent.putExtra("bettype", ""+"Open");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);

                        startActivity(intent);
                        dialogBuilder.dismiss();
                    }
                });
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(BookActivity.this, DivTriplePatti.class);
                        intent.putExtra("id", ""+gameid);
                        intent.putExtra("bhav", ""+triple_patti);
                        intent.putExtra("type", ""+"triple-patti");
                        intent.putExtra("bettype", ""+"Close");
                        intent.putExtra("open_end_time", ""+open_end_time);
                        intent.putExtra("close_end_time", ""+close_end_time);
                        intent.putExtra("match_name", ""+match_name);

                        startActivity(intent);
                        dialogBuilder.dismiss();                        }
                });
                dialogBuilder.show();
            }
//                intent= new Intent(ActivityBook.this, DivSinglePati.class);
//                intent.putExtra("id", ""+gameid);
//                intent.putExtra("bhav", ""+triple_patti);
//                intent.putExtra("type", ""+"triple-patti");
//                intent.putExtra("open_end_time", ""+open_end_time);
//                intent.putExtra("close_end_time", ""+close_end_time);
//                startActivity(intent);

            break;
        case R.id.llHalfSagman:
            String currentTimeApihalf = "";
            String isopenhalf = "0";
            String isclosehalf  = "0";
            Calendar calendar2half  = Calendar.getInstance();
            SimpleDateFormat formatter2half = new SimpleDateFormat("HH:mm:ss");
            String currentTime2half  = formatter2half .format(calendar2half .getTime());
            try {
                Date dbDatehalf  = formatter2half .parse(currentTime2half );
                currentTimeApihalf = String.valueOf(dbDatehalf );
                Log.e("currentTimeApi",currentTimeApihalf );
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formathalf= new SimpleDateFormat("HH:mm:ss");
            Date open_endhalf = new Date();
            Date close_endhalf =new Date();
            try {
                open_endhalf  = formathalf .parse(open_end_time);
                close_endhalf  = formathalf .parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimehalf = currentTimeApihalf .compareTo(String.valueOf(open_endhalf ));
            int closetimehalf = currentTimeApihalf .compareTo(String.valueOf(close_endhalf));
            if (closetimehalf <0){
                isclosehalf  ="1";
            }
            if (opentimehalf <0){
                isopenhalf  ="1";
            }
            Log.e("open",""+isopenhalf );
            Log.e("close",""+isclosehalf );

            if (isclosehalf.equals("0") && isopenhalf .equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }
            else if (isopenhalf.equals("0")){
                Utility.showToast(binding.llMain,"Market Either close or not open");

            }
            else {
                intent= new Intent(BookActivity.this, HalfPanna.class);
                intent.putExtra("bhav", ""+half_sangm);
                intent.putExtra("id", ""+gameid);
                intent.putExtra("open_end_time", ""+open_end_time);
                intent.putExtra("close_end_time", ""+close_end_time);
                intent.putExtra("match_name", ""+match_name);

                startActivity(intent);
            }

            break;
        case R.id.llFullSam:
            String currentTimeApisangam = "";
            String isopensangam  = "0";
            String isclosesangam  = "0";
            Calendar calendar2sangam  = Calendar.getInstance();
            SimpleDateFormat formatter2sangam  = new SimpleDateFormat("HH:mm:ss");
            String currentTime2sangam  = formatter2sangam .format(calendar2sangam .getTime());
            try {
                Date dbDatesangam  = formatter2sangam .parse(currentTime2sangam );
                currentTimeApisangam = String.valueOf(dbDatesangam );
                Log.e("currentTimeApi",currentTimeApisangam );
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat  formatsangam = new SimpleDateFormat("HH:mm:ss");
            Date open_endsangam  = new Date();
            Date close_endsangam =new Date();
            try {
                open_endsangam  = formatsangam .parse(open_end_time);
                close_endsangam  = formatsangam .parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int opentimesangam = currentTimeApisangam .compareTo(String.valueOf(open_endsangam ));
            int closetimesangam = currentTimeApisangam .compareTo(String.valueOf(close_endsangam));
            if (closetimesangam <0){
                isclosesangam  ="1";
            }
            if (opentimesangam <0){
                isopensangam  ="1";
            }
            Log.e("open",""+isopensangam );
            Log.e("close",""+isclosesangam );

            if (isclosesangam .equals("0") && isopensangam .equals("0")){
                Utility.showToast(binding.llMain,"Market Close");
            }else if (isopensangam.equals("0")){
                Utility.showToast(binding.llMain,"Market Either close or not open");

            }
            else {
                intent= new Intent(BookActivity.this, FullSagam.class);
                intent.putExtra("bhav", ""+full_sagam);
                intent.putExtra("id", ""+gameid);
                intent.putExtra("open_end_time", ""+open_end_time);
                intent.putExtra("match_name", ""+match_name);
                intent.putExtra("close_end_time", ""+close_end_time);
                startActivity(intent);
            }

            break;

    }

    }
}
