package com.dev.goldengames;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.dev.goldengames.View.IBetHistoryView;
import com.dev.goldengames.adapter.Adapterbethistory;
import com.dev.goldengames.api_presnter.BetHistoryPresenter;
import com.dev.goldengames.databinding.ActivityBetHistoryBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.ModelBetHistory;
import com.dev.goldengames.model.NewLoginModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActivityBetHistory extends BaseActivity implements IBetHistoryView {

    ActivityBetHistoryBinding binding;
    BetHistoryPresenter presenter;
    NewLoginModel userinfo;
    ArrayList<ModelBetHistory.DataBean> list= new ArrayList<ModelBetHistory.DataBean>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_bet_history);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Bet History");

        userinfo= AppPreference.getUserInfo(ActivityBetHistory.this);

        presenter = new BetHistoryPresenter();
        presenter.setView(this);


        callApi();


//        Adapterbethistory adapter = new Adapterbethistory(ActivityBetHistory.this);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(ActivityBetHistory.this);
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(ActivityBetHistory.this));
//        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
//        binding.recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
    }
    private void callApi() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",""+userinfo.getData().getId());
            presenter.bet_history(this, map);
        }
        else {
            Utility.no_internet(this);
        }
    }


    @Override
    public void onSuccess(ModelBetHistory body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            list.addAll(body.getData());
            binding.recyclerView.setVisibility(View.VISIBLE);
            Adapterbethistory adapter = new Adapterbethistory(ActivityBetHistory.this,list);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(ActivityBetHistory.this));
            binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
            binding.recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        }
        else  if (status1==0){
            binding.recyclerView.setVisibility(View.GONE);
        }

    }

    @Override
    public Context getContext() {
        return this;
    }
}
