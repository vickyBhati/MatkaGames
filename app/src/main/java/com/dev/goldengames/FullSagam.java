package com.dev.goldengames;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.dev.goldengames.View.IGameView;
import com.dev.goldengames.adapter.AdapterFullSagam;
import com.dev.goldengames.api_presnter.GamePresenter;
import com.dev.goldengames.databinding.FullSagamBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.ModelFullSang;
import com.dev.goldengames.model.Modelgame;
import com.dev.goldengames.model.NewLoginModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FullSagam extends BaseActivity implements AdapterFullSagam.OnItemClickListener, IGameView {

    FullSagamBinding binding;
    String openFirst,closeFirst,amountFirst,gameid,bhav;
    ArrayList<ModelFullSang> myArrList= new ArrayList<ModelFullSang>();
    AdapterFullSagam adapter;
    JSONArray jsonArray =new JSONArray();
    GamePresenter presenter;
    NewLoginModel userinfo;

    String open_end_time,close_end_time;
    Date open_end,close_end;
    String currentDate,check,check2;
    private long mLastClickTime = 0;


    String[] digit ={"128","137","146","236","245","290","380","470","489","560","678","579",
            "129","138","147","156","237","246","345","390","480","570","679","589","120"
            ,"139","148","157","238","247","256","346","490","580","670","689",
            "130","149","158","167","239","248","257","347","356","590","680","789",
            "140","159","230","249"
            ,"258","267","348","357","456","690","780",
            "123","150","169","178","240","259","268","349","358","457","367","790",
            "124","160","179","250","269","278","340","359"
            ,"368","458","467","890",
            "125","134","170","189","260","279","350","369","378","459","567","468",
            "126","135","180","234","270","289","360","379","450","469","478","568"
            ,"127","136","145","190","235","280","370","479","460","569","389","578",
            "100","119","155","227","335","344","399","588","669","200","110","228",
            "255","336","499","660","688","778","300","166","229","337","355",
            "445","599","779","788","400","112","220","266","338","446","455","699","770",
            "500","113","122","177","339","366","447","799","889","600","114","277","330","448","466",
            "556","880",
            "899","700","115","133","188","223","377","449","557","566","800","116",
            "224","233","288","440","477","558","990","900","117","144","199",
            "225","388","559","577","667","550","668","244","299","226","488","677","118","334","000","111","222","333","444","555","666","777","888","999"};



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = DataBindingUtil.setContentView(this,R.layout.full_sagam);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        userinfo= AppPreference.getUserInfo(FullSagam.this);
        binding.name.setText("Full Sangam");
        binding.mytool.ll.setVisibility(View.VISIBLE);
        Intent intent = getIntent();
        if (intent!=null) {
            gameid = intent.getStringExtra("id");
            binding.mytool.title.setText(intent.getStringExtra("match_name"));
            bhav = intent.getStringExtra("bhav");
            open_end_time = intent.getStringExtra("open_end_time");
            close_end_time = intent.getStringExtra("close_end_time");

            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            open_end = new Date();
            close_end=new Date();
            try {
                open_end = format.parse(open_end_time);
                close_end = format.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,digit);
        binding.etOpenOne.setThreshold(3);//will start working from first character
        binding.etOpenOne.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        binding.etOpenOne.setTextColor(Color.BLACK);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,digit);
        binding.etCloseOne.setThreshold(3);//will start working from first character
        binding.etCloseOne.setAdapter(adapter2);//setting the adapter data into the AutoCompleteTextView
        binding.etCloseOne.setTextColor(Color.BLACK);


        presenter = new GamePresenter();
        presenter.setView(this);
        binding.etOpenOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("WrongConstant")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("start",""+start);
                Log.e("stbefotart",""+before);
                if (start==2){
                    if(Arrays.asList(digit).contains(s.toString())){
                        check="1";
                        Toast.makeText(FullSagam.this,"valid",1000).show();
                    }
                    else {
                        check="2";
                        Toast.makeText(FullSagam.this," Not valid",1000).show();

                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        binding.etCloseOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("WrongConstant")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("start",""+start);
                Log.e("stbefotart",""+before);
                if (start==2){
                    if(Arrays.asList(digit).contains(s.toString())){
                        check2="1";
                        Toast.makeText(FullSagam.this,"valid",1000).show();
                    }
                    else {
                        check2="2";
                        Toast.makeText(FullSagam.this," Not valid",1000).show();

                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.mytool.txtWallet.setText(AppPreference.getString(getApplicationContext(),"wallet"));
//        binding.shimmerViewContainer.startShimmerAnimation();
//            if (wallet.equals("1")){
//                binding.shimmerViewContainer.startShimmerAnimation();
//                //callProfiel();
//            wallet="0";

    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOne:
                if (TextUtils.isEmpty(binding.etOpenOne.getText().toString())){
                    Utility.showErrorToast(FullSagam.this,"Please enter  Open value ");

                }
                else if (binding.etOpenOne.getText().toString().length()<3){
                    Utility.showErrorToast(FullSagam.this,"Please enter valid Open value ");
                }
                else if (!check.equals("1")){
                    Utility.showErrorToast(FullSagam.this,"Not a valid open  value");
                }


                else if (TextUtils.isEmpty(binding.etCloseOne.getText().toString())){
                    Utility.showErrorToast(FullSagam.this,"Please enter  Close value ");
                }
                else if (binding.etCloseOne.getText().toString().length()<3){
                    Utility.showErrorToast(FullSagam.this,"Please enter valid Close value ");
                }
                else if (!check2.equals("1")){
                    Utility.showErrorToast(FullSagam.this,"Not a valid close  value");
                }
                else if (TextUtils.isEmpty(binding.etAmoutOne.getText().toString())){
                    Utility.showErrorToast(FullSagam.this,"Please enter  Amount ");
                }
                else if (Integer.parseInt(binding.etAmoutOne.getText().toString()) < 10 ){
                    Utility.showErrorToast(FullSagam.this,"Amount Must be greater 10");
                }


                else {
                    String number = binding.etOpenOne.getText().toString()+"-"+binding.etCloseOne.getText().toString();
                    amountFirst = binding.etAmoutOne.getText().toString();
                    myArrList.add(new ModelFullSang(binding.etOpenOne.getText().toString()+"-"+binding.etCloseOne.getText().toString(),amountFirst));
                    addView();
                }
                break;
            case R.id.btnEnglish:
            if(myArrList.size()==0){
                Utility.showErrorToast(FullSagam.this,"Please add bet");
            }
            else {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                for (int i = 0; i < myArrList.size(); i++) {
                    try {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("number", myArrList.get(i).getNumber());
                        jsonObject.put("amount", myArrList.get(i).getAmount());
                        jsonArray.put(jsonObject);
                        //total = total+Integer.parseInt(myArrList.get(i).getValue());
                        // int total = +aa;
                        Log.e("total",""+jsonArray);
                        // ab agr is list m s mai
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                String isopen = "0";
                String isclose = "0";
                Calendar calendar3 = Calendar.getInstance();
                SimpleDateFormat formatter3 = new SimpleDateFormat("HH:mm:ss");
                String currentTime3 = formatter3.format(calendar3.getTime());
                try {
                    Date dbDate = formatter3.parse(currentTime3);
                    currentDate = String.valueOf(dbDate);
                    Log.e("currentTimeApi",currentDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int opentime = currentDate.compareTo(String.valueOf(open_end));
//                    int closetime = currentDate.compareTo(String.valueOf(close_end));
//                    if (closetime<0){
//                        isclose ="1";
//                    }
                if (opentime<0){
                    isopen ="1";
                }
                if (isopen.equals("0")){
                    Utility.showErrorToast(FullSagam.this,"Market either close or not open ");
                }
                else {
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("user_id",""+userinfo.getData().getId());
                        map.put("market_id",""+gameid);
                        map.put("game_type",""+"full-sangam");
                        map.put("bet_no",""+jsonArray);
                        map.put("bhav",""+bhav);
                        map.put("bet_type",""+"Open-Close");
                        presenter.game_add(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
                }
                break;
            }
        }
    }
    private void addView() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(binding.mainLayout.getWindowToken(), 0);
        }
        adapter = new AdapterFullSagam(FullSagam.this,this,myArrList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(FullSagam.this));
        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void RemoveList(View view, int index, ModelFullSang item) {
        myArrList.remove(index);
        Log.e("myArrList",""+myArrList);

        adapter.notifyDataSetChanged();
        for (int i = 0, len = jsonArray.length(); i < len; i++) {
            JSONObject obj = null;
            try {
                obj = jsonArray.getJSONObject(i);
                obj.remove("number");
                obj.remove("amount");
                jsonArray.remove(index);
                jsonArray = new JSONArray(myArrList);
                Log.e("myArrList",""+jsonArray);

            } catch (JSONException e) {
                e.printStackTrace();
            }
            // Do your removals
            // etc.

        }
    }



    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onSuccess(Modelgame body) {

    }

    @Override
    public void onAddBit(BasicModel body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            binding.btnEnglish.setFocusable(false);
            binding.btnEnglish.setClickable(false);
            Utility.showSuccesToast(FullSagam.this,body.getMessage());
//            MainActivity.wallet="1";
            AppPreference.wallet(getApplicationContext(), String.valueOf(body.getWallet()));

//            Intent intent = new Intent(FullSagam.this,MainActivity.class);
//            startActivity(intent);
//            finishAffinity();
            finish();
        }
        else  if (status1==0){
            binding.btnEnglish.setFocusable(true);
            binding.btnEnglish.setClickable(true);
            Toast.makeText(FullSagam.this,body.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }
}
