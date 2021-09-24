package com.dev.goldengames;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;


import com.dev.goldengames.View.IBhavListView;
import com.dev.goldengames.api_presnter.BhavListPresenter;
import com.dev.goldengames.databinding.ActivityKuberJackpoatBinding;
import com.dev.goldengames.model.BhavListModel;

import java.util.HashMap;
import java.util.Map;


public class ActivityKuberJackpot extends BaseActivity implements IBhavListView {

    ActivityKuberJackpoatBinding binding;
    BhavListPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_kuber_jackpoat);
        binding.mytool.title.setText("Game Rate");
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        presenter = new BhavListPresenter();
        presenter.setView(this);

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
                binding.single.setText("1- "+body.getData().getSingle().getFull_bhav());
                binding.jodi.setText("1- "+body.getData().getJodi().getFull_bhav());
                binding.singlePanna.setText("1- "+body.getData().getSinglepatti().getFull_bhav());
                binding.doublePanna.setText("1- "+body.getData().getDoublepatti().getFull_bhav());
                binding.tirpalPanna.setText("1- "+body.getData().getTriplepatti().getFull_bhav());
                binding.half.setText("1- "+body.getData().getHalfsangam().getFull_bhav());
                binding.full.setText("1- "+body.getData().getFullsangam().getFull_bhav());
//                single = String.valueOf(body.getData().getSingle().getFull_bhav());
//                jodi = String.valueOf(body.getData().getJodi().getFull_bhav());
//                single_patti = String.valueOf(body.getData().getSinglepatti().getFull_bhav());
//                double_patti = String.valueOf(body.getData().getDoublepatti().getFull_bhav());
//                triple_patti = String.valueOf(body.getData().getTriplepatti().getFull_bhav());
//                full_sagam = String.valueOf(body.getData().getFullsangam().getFull_bhav());
//                half_sangm = String.valueOf(body.getData().getHalfsangam().getFull_bhav());
//                Log.e("test",""+single);
            }
        }
    }

    @Override
    public Context getContext() {
        return this;
    }
}
