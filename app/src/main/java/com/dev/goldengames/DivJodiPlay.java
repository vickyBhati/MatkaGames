package com.dev.goldengames;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
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
import com.dev.goldengames.databinding.JodiNewBinding;
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
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DivJodiPlay extends BaseActivity implements AdapterSingle.OnItemClickListener, IGameView, AdapterAddSingleList.OnItemClickListener {

    JodiNewBinding binding;
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
    String amount,value;
    JSONArray jsonArray =new JSONArray();
    String game_type,bhav;
    String currentTimeApi="";
    String bettype="";
    String open_end_time,close_end_time;
    Date open_end,close_end;
    String currentDate,name;
    private long mLastClickTime = 0;


    String[] digit ={"00","01","02","03","04","05","06","07","08","09","10","10","11","12","13","14","15","16","17","18","19","20","22","21","23","24"
            ,"24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"
    ,"51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77"
    ,"78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99"};

    String [] redbrect= {"55","50","05","00","33","38","83","88","11","16","61","66","22","27","72","77","44","49","94","99"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.jodi_new);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.ll.setVisibility(View.VISIBLE);

        Intent intent = getIntent();
        if (intent!=null){
            gameid = intent.getStringExtra("id");
            bhav = intent.getStringExtra("bhav");
            game_type = intent.getStringExtra("type");
            bettype = intent.getStringExtra("bettype");
            name = intent.getStringExtra("match_name");

            binding.mytool.title.setText(name);
            binding.name.setText(game_type);


            open_end_time = intent.getStringExtra("open_end_time");
            close_end_time = intent.getStringExtra("close_end_time");

            SimpleDateFormat  format = new SimpleDateFormat("HH:mm:ss");
            open_end = new Date();
            close_end=new Date();
            try {
                open_end = format.parse(open_end_time);
                close_end = format.parse(close_end_time);
                Log.e("open",""+open_end);
                Log.e("close",""+close_end);
            } catch (ParseException e) {
                e.printStackTrace();
            }



        }
        userinfo= AppPreference.getUserInfo(DivJodiPlay.this);
        presenter = new GamePresenter();
        presenter.setView(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,digit);
        binding.txtService.setThreshold(2);//will start working from first character
        binding.txtService.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        binding.txtService.setTextColor(Color.BLACK);
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
//                dialogBuilder = new Dialog(DivJodiPlay.this);
//                dialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                final View dialogView = LayoutInflater.from(DivJodiPlay.this).inflate(R.layout.popup_calender, null);
//                dialogBuilder.setContentView(dialogView);
//                calendar = (CalendarView)dialogView.findViewById(R.id.calendarView);
//                Button btn= (Button) dialogView.findViewById(R.id.btn);
//                long currentTime = System.currentTimeMillis();
//                long maxTime = currentTime + 1000 * 60 * 60 * 24 * 4;
////                calendar.setMinDate(currentTime);
//                calendar.setMaxDate(maxTime);
//
//                calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//                    @Override
//                    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//                        date = dayOfMonth + "-" + (month + 1) + "-" + year;
//
//                    }
//                });
//                btn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        hidePop(date);
//                    }
//                });
//                dialogBuilder.show();
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
                else if ((binding.txtService.getText().length()<2)){
                    Utility.showToast(binding.mainLayout,"Please enter valid point");
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
                    Utility.showErrorToast(DivJodiPlay.this,"Please add bet");
                }

                else {
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
                        Utility.showErrorToast(DivJodiPlay.this,"Market either close or not open ");
                    }
                    else {
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("user_id",""+userinfo.getData().getId());
                        map.put("market_id",""+gameid);
                        map.put("bet_type","Jodi");
                        map.put("bet_no",""+jsonArray);
                        map.put("game_type","jodi");
                        map.put("bhav",""+bhav);
                        Log.e("tttt",""+map);
                        presenter.game_add(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
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
        adapter = new AdapterAddSingleList(DivJodiPlay.this,this,myArrList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DivJodiPlay.this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(DivJodiPlay.this));
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
//        binding.tvTime.setText(date);
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
//            MainActivity.wallet="1";
            AppPreference.wallet(getApplicationContext(), String.valueOf(body.getWallet()));
            Utility.showSuccesToast(DivJodiPlay.this,body.getMessage());
//            Intent intent = new Intent(DivJodiPlay.this,MainActivity.class);
//            startActivity(intent);
//            finishAffinity();
            finish();
        }
        else  if (status1==0){
            binding.btnEnglish.setFocusable(true);
            binding.btnEnglish.setClickable(true);
            Toast.makeText(DivJodiPlay.this,body.getMessage(),Toast.LENGTH_SHORT).show();

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

        }

    }
}
