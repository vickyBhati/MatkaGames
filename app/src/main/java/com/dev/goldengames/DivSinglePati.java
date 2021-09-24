package com.dev.goldengames;

import android.annotation.SuppressLint;
import android.app.Dialog;
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
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.dev.goldengames.View.IGameView;
import com.dev.goldengames.adapter.AdapterAddSingleList;
import com.dev.goldengames.adapter.AdapterSingle;
import com.dev.goldengames.api_presnter.GamePresenter;
import com.dev.goldengames.databinding.SinglePatiBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.Candy;
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

public class DivSinglePati extends BaseActivity implements AdapterSingle.OnItemClickListener, IGameView, AdapterAddSingleList.OnItemClickListener {

    SinglePatiBinding binding;
    String from;
    ArrayList<String> singleList;
    CalendarView calendar;
    String date;
    Dialog dialogBuilder,dilogSingle;
    GamePresenter presenter;
    String gameid;
    NewLoginModel userinfo;
    ArrayList<Candy> myArrList= new ArrayList<Candy>();
    ArrayList<String> addList= new ArrayList<>();
    ArrayList<Modelgame.ValueBean.SingleBean> singlelist= new ArrayList<Modelgame.ValueBean.SingleBean>();
    AdapterAddSingleList adapter;
    String amount,value,name;
    JSONArray jsonArray =new JSONArray();
    String game_type,bhav;
    String open_end_time,close_end_time;
    String currentTimeApi="";
    String bettype="",check="0";
    private long mLastClickTime = 0;
    String[] digit ={"128","137","146","236","245","290","380","470","489","560","678","579",
            "129","138","147","156","237","246","345","390","480","570","679","589"
            ,"120"
            ,"139","148","157","238","247","256","346","490","580","670","689",

            "130","149","158","167","239","248","257","347","356","590","680","789",
            "140","159","230","249","168"
            ,"258","267","348","357","456","690","780",
            "123","150","169","178","240","259","268","349","358","457","367","790",
            "124","160","179","250","269","278","340","359"
            ,"368","458","467","890",
            "125","134","170","189","260","279","350","369","378","459","567","468",
            "126","135","180","234","270","289","360","379","450","469","478","568"
            ,"127","136","145","190","235","280","370","479","460","569","389","578"};

    String[] doubledist = {"100","119","155","227","335","344","399","588","669","200","110","228",
            "255","336","499","660","688","778","300","166","229","337","355",
            "445","599","779","788","400","112","220","266","338","446","455","699","770",
            "500","113","122","177","339","366","447","799","889","600","114","277","330","448","466",
            "556","880",
            "899","700","115","133","188","223","377","449","557","566","800","116",
            "224","233","288","440","477","558","990","900","117","144","199",
            "225","388","559","577","667","550","668","244","299","226","488","677","118","334"};





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.single_pati);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent = getIntent();
        if (intent!=null){
            gameid = intent.getStringExtra("id");
            bhav = intent.getStringExtra("bhav");
            game_type = intent.getStringExtra("type");
            bettype = intent.getStringExtra("bettype");
            binding.name.setText(game_type);
            binding.mytool.ll.setVisibility(View.VISIBLE);

            binding.mytool.title.setText(intent.getStringExtra("match_name")+"("+bettype+")");

            String open_end_time1 = intent.getStringExtra("open_end_time");
            String close_end_time1 = intent.getStringExtra("close_end_time");

            SimpleDateFormat  format = new SimpleDateFormat("HH:mm:ss");
            try {
                Date open_end = format.parse(open_end_time1);  // database date in date format
                Date close_end = format.parse(close_end_time1);  // database date in date format
                open_end_time = String.valueOf(open_end);
                close_end_time = String.valueOf(close_end);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }

        userinfo= AppPreference.getUserInfo(DivSinglePati.this);
        presenter = new GamePresenter();
        presenter.setView(this);

        if (game_type.equals("single-patti")){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,digit);
            binding.txtService.setThreshold(3);
            binding.txtService.setAdapter(adapter);
            binding.txtService.setTextColor(Color.BLACK);

            binding.txtService.addTextChangedListener(new TextWatcher() {
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
                            Toast.makeText(DivSinglePati.this,"valid",1000).show();
                        }
                        else {
                            check="2";
                            Toast.makeText(DivSinglePati.this," Not valid",1000).show();

                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable s) {

                }

            });
        }
        else {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,doubledist);
            binding.txtService.setThreshold(3);
            binding.txtService.setAdapter(adapter);
            binding.txtService.setTextColor(Color.BLACK);

            binding.txtService.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @SuppressLint("WrongConstant")
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Log.e("start",""+start);
                    Log.e("stbefotart",""+before);
                    if (start==2){
                        if(Arrays.asList(doubledist).contains(s.toString())){
                            check="1";
                            Toast.makeText(DivSinglePati.this,"valid",1000).show();
                        }
                        else {
                            check="2";
                            Toast.makeText(DivSinglePati.this," Not valid",1000).show();

                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable s) {

                }

            });
        }


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
            case R.id.rrCalender:
                break;
//            case R.id.rbOpen:
//                bettype ="Open";
//                binding.rbClose.setChecked(false);
//                binding.rbOpen.setChecked(true);
//                break;
//            case R.id.rbClose:
//                bettype ="Close";
//                binding.rbClose.setChecked(true);
//                binding.rbOpen.setChecked(false);
//                break;
            case  R.id.btnAddList:
                if (TextUtils.isEmpty(binding.txtService.getText().toString())){
                    Utility.showToast(binding.mainLayout,"Please enter  Game Point ");
                }
                else if ((binding.txtService.getText().length()<3)){
                    Utility.showToast(binding.mainLayout,"Please enter valid digit");
                }
                else if (!check.equals("1")){
                    Utility.showToast(binding.mainLayout,"Not a valid Digit");
                }

                else if (TextUtils.isEmpty(binding.etaAmount.getText().toString())){
                    Utility.showToast(binding.mainLayout,"Please Enter Amount");
                }
                else if (binding.etaAmount.getText().toString().equals("0")||binding.etaAmount.getText().toString().equals("00")||binding.etaAmount.getText().toString().equals("000")||binding.etaAmount.getText().toString().equals("0000")||binding.etaAmount.getText().toString().equals("00000")||binding.etaAmount.getText().toString().equals("000000")){
                    Utility.showToast(binding.mainLayout,"Please Enter Valid Amount");
                }
                else if (Integer.parseInt(binding.etaAmount.getText().toString()) < 10 ){
                    Utility.showToast(binding.mainLayout,"Amount Must be greater 10");
                }

                else {
                    amount = binding.etaAmount.getText().toString().trim();
                    value = binding.txtService.getText().toString().trim();
                    myArrList.add(new Candy(amount,value));
                    addView();
                }
                break;
            case R.id.btnEnglish:

                if(myArrList.size()==0){
                    Utility.showErrorToast(DivSinglePati.this,"Please add bet");

                }
                else {
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
                    if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                        return;
                    }
                    mLastClickTime = SystemClock.elapsedRealtime();
                    for (int i = 0; i < myArrList.size(); i++) {
                        try {
                            JSONObject jsonObject = new JSONObject();
                            jsonObject.put("number", myArrList.get(i).getAmount());
                            jsonObject.put("amount", myArrList.get(i).getValue());
                            jsonArray.put(jsonObject);
                            //total = total+Integer.parseInt(myArrList.get(i).getValue());
                            // int total = +aa;
                            Log.e("total",""+jsonArray);
                            // ab agr is list m s mai
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("user_id",""+userinfo.getData().getId());
                        map.put("market_id",""+gameid);
                        map.put("bet_type",""+bettype);
                        map.put("bet_no",""+jsonArray);
                        map.put("game_type",""+game_type);
                        map.put("bhav",""+bhav);
                        Log.e("tttt",""+map);
//                        map.put("totalAmount",""+total);
                        presenter.game_add(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
                }

                break;
        }
    }

    private void addView() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(binding.mainLayout.getWindowToken(), 0);
        }
        adapter = new AdapterAddSingleList(DivSinglePati.this,this,myArrList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DivSinglePati.this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(DivSinglePati.this));
        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        binding.txtService.setText("");
        binding.etaAmount.setText("");
    }

    private void callthis() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
           // map.put("userId",""+userinfo.getValue().getUserId());
            map.put("gameId",""+gameid);
            presenter.game(this, map);
        }
        else {
            Utility.no_internet(this);
        }

    }

    private void hidePop(String date) {
        binding.tvTime.setText(date);
        dialogBuilder.dismiss();

    }


    @Override
    public void onSingle(View view, int index, Modelgame.ValueBean.SingleBean item) {
        binding.txtService.setText(""+item.getName());
        dilogSingle.dismiss();
    }

    @Override
    public void onSuccess(Modelgame body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            singlelist.addAll(body.getValue().getSingle());
            Log.e("singlelist",""+singlelist);
        }
        else  if (status1==0){

        }
    }

    @Override
    public void onAddBit(BasicModel body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            binding.btnEnglish.setFocusable(false);
            binding.btnEnglish.setClickable(false);
            Utility.showSuccesToast(DivSinglePati.this,body.getMessage());
//            MainActivity.wallet="1";
            AppPreference.wallet(getApplicationContext(), String.valueOf(body.getWallet()));



//            Intent intent = new Intent(DivSinglePati.this,MainActivity.class);
//            startActivity(intent);
//            finishAffinity();
            finish();
        }
        else  if (status1==0){
            binding.btnEnglish.setFocusable(true);
            binding.btnEnglish.setClickable(true);
            Toast.makeText(DivSinglePati.this,body.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public Context getContext() {
        return this;
    }

    //
    //yha pr remove ho rha h?ha
    // wo jb list remove krega to wo object bi remove ho jayega yha pr
    //tu kai pr total dikhana h kya?ha wo total amount jayega api m
    //postion aa rhi h to us time pr uss position se value nikal kr minus ker/ /d aap dek lo na ek bar yha kse kr skte hai please
    @Override
    public void RemoveList(View view, int index, Candy item) {
//        total= total- Integer.parseInt(myArrList.get(index).getValue());
        myArrList.remove(index);
        Log.e("myArrList",""+myArrList);

       //yha pr minus ho jayega jo delete hoga ok ok dekta hu run krake
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
}
