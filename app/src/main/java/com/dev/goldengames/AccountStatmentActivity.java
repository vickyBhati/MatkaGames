package com.dev.goldengames;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.dev.goldengames.View.ITransctionView;
import com.dev.goldengames.adapter.AdapterStatment;
import com.dev.goldengames.api_presnter.TransctionListPresenter;
import com.dev.goldengames.databinding.ActivityAccountStatmentBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.NewLoginModel;
import com.dev.goldengames.model.TrasnscationModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class AccountStatmentActivity extends BaseActivity implements ITransctionView {

    ActivityAccountStatmentBinding binding;
    TransctionListPresenter presenter;
    NewLoginModel userinfo;
    ArrayList<TrasnscationModel.DataBean> list= new ArrayList<TrasnscationModel.DataBean>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_account_statment);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Account Statment");
        userinfo= AppPreference.getUserInfo(AccountStatmentActivity.this);

        presenter = new TransctionListPresenter();
        presenter.setView(this);



        callApi();


//        AdapterStatment adapter = new AdapterStatment(AccountStatmentActivity.this);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(AccountStatmentActivity.this);
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(AccountStatmentActivity.this));
//        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
//        binding.recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
    }



    private void callApi() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",""+userinfo.getData().getId());
            presenter.transction(this, map);
        }
        else {
            Utility.no_internet(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        binding.shimmerViewContainer.startShimmerAnimation();

    }



    public void onClick(View view) {


    }

//    @Override
//    public void onSuccess(ModelPaymentList body) {
//        int status1 = body.getStatus();
//        String message = body.getMessage();
//        if (status1 == 1) {
//            binding.shimmerViewContainer.stopShimmerAnimation();
//            binding.shimmerViewContainer.setVisibility(View.GONE);
//            list.addAll(body.getValue().getTxnDat());
////          AdapterStatment adapter = new AdapterStatment(AccountStatmentActivity.this,list);
////        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(AccountStatmentActivity.this);
////        binding.recyclerView.setLayoutManager(new LinearLayoutManager(AccountStatmentActivity.this));
////        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
////        binding.recyclerView.setAdapter(adapter);
////        adapter.notifyDataSetChanged();
//        }
//        else  if (status1==0){
//            binding.shimmerViewContainer.stopShimmerAnimation();
//            binding.shimmerViewContainer.setVisibility(View.GONE);
//        }
//    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onSuccess(TrasnscationModel body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            list.addAll(body.getData());
            AdapterStatment adapter = new AdapterStatment(AccountStatmentActivity.this,list);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(AccountStatmentActivity.this));
            binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
            binding.recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        }
        else  if (status1==0){
        }
    }

    }

