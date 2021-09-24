package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.View.IGameView;
import com.dev.goldengames.adapter.AdapterAddSingleListTwp;
import com.dev.goldengames.api_presnter.GamePresenter;
import com.dev.goldengames.databinding.ActivityPalygameBinding;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PlayGame extends BaseActivity implements AdapterAddSingleListTwp.OnItemClickListener, IGameView {

    ActivityPalygameBinding binding;
    String amount,value;
    ArrayList<Candy> myArrList= new ArrayList<Candy>();
    AdapterAddSingleListTwp adapter;
    JSONArray jsonArray =new JSONArray();
    String game_type,bhav,name;
    String open_end_time,close_end_time;
    String bettype="";
    Date open_end,close_end;
    private long mLastClickTime = 0;
    String gameid;
    NewLoginModel userinfo;
    GamePresenter presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_palygame);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Single");
        binding.mytool.ll.setVisibility(View.VISIBLE);


        Intent intent = getIntent();
        if (intent!=null){
            gameid = intent.getStringExtra("id");
            bhav = intent.getStringExtra("bhav");
            game_type = intent.getStringExtra("type");
            name = intent.getStringExtra("match_name");
            bettype = intent.getStringExtra("bettype");
//            if (game_type.equals("single-patti")){
//                int maxLength = 1;
//                binding.txtService.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
//            }

            binding.mytool.title.setText(name+"("+bettype+")");
//            binding.name.setText(game_type);

            open_end_time = intent.getStringExtra("open_end_time");
            close_end_time = intent.getStringExtra("close_end_time");

            SimpleDateFormat  format = new SimpleDateFormat("HH:mm:ss");
            open_end = new Date();
            close_end=new Date();
            try {
                open_end = format.parse(open_end_time);
                close_end = format.parse(close_end_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }


        }
        userinfo= AppPreference.getUserInfo(PlayGame.this);
        presenter = new GamePresenter();
        presenter.setView(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("resssdf",""+AppPreference.getString(PlayGame.this,"wallet"));
        binding.mytool.txtWallet.setText(AppPreference.getString(PlayGame.this,"wallet"));
//        binding.shimmerViewContainer.startShimmerAnimation();
//            if (wallet.equals("1")){
//                binding.shimmerViewContainer.startShimmerAnimation();
//                //callProfiel();
//            wallet="0";

    }
    public void onClick(View view) {
        switch (view.getId()){
              case R.id.rbOpen:
                  break;
            case R.id.btnEnglish:
                if(myArrList.size()==0){
                    Utility.showErrorToast(PlayGame.this,"Please add bet");

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
                            Log.e("total",""+jsonArray);
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
        }
    }

    private void addView() {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(binding.mainLayout.getWindowToken(), 0);
        }
        adapter = new AdapterAddSingleListTwp(PlayGame.this,this,myArrList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(PlayGame.this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(PlayGame.this));
        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        binding.txtService.setText("");
        binding.etaAmount.setText("");
    }


    @Override
    public void RemoveList(View view, int index, Candy item) {
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
                Log.e("myArrList", "" + jsonArray);

            } catch (JSONException e) {
                e.printStackTrace();
            }
            // Do your removals
            // etc.

        }
        }

    @Override
    public void onSuccess(Modelgame body) {

    }

    @Override
    public void onAddBit(BasicModel body) {
        int status1 = body.getStatus();
        if (status1 == 1) {
            binding.btnEnglish.setFocusable(false);
            binding.btnEnglish.setClickable(false);
//            MainActivity.wallet="1";
            AppPreference.wallet(getApplicationContext(), String.valueOf(body.getWallet()));
            Utility.showSuccesToast(PlayGame.this,body.getMessage());
            finish();
        }
        else  if (status1==0){
            binding.btnEnglish.setFocusable(true);
            binding.btnEnglish.setClickable(true);
            Toast.makeText(PlayGame.this,body.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public Context getContext() {
        return this;
    }
}
