package com.dev.goldengames;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.databinding.DataBindingUtil;


import com.dev.goldengames.View.IPlayView;
import com.dev.goldengames.api_presnter.HowToPlayPresenter;
import com.dev.goldengames.databinding.ActivityHowPlayBinding;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ActivityPlay extends BaseActivity implements IPlayView {

    ActivityHowPlayBinding binding;
    HowToPlayPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_how_play);
        binding.mytool.title.setText("How To Play");
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        presenter = new HowToPlayPresenter();
        presenter.setView(this);

        calApi();
//        AdapterKuberJackpot adapter = new AdapterKuberJackpot(ActivityKuberJackpot.this);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(ActivityKuberJackpot.this);
//        binding.recyclerView.setLayoutManager(new GridLayoutManager(ActivityKuberJackpot.this,2));
//        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
//        binding.recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
    }

    private void calApi() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
//            map.put("userId", "" + userinfo.getData().getId());
            presenter.plsy(this);
        } else {
            Utility.no_internet(this);
        }
    }

    @Override
    public void onSuccess(String body) {
        try {
            JSONObject myObject = new JSONObject(body);
            int status = myObject.getInt("status");
            if (status==1){
                binding.message.setText(HtmlCompat.fromHtml(myObject.getString("data"), 0));

//                binding.message.setText(Html.fromHtml(Html.fromHtml(myObject.getString("data")).toString()));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Context getContext() {
        return this;
    }
}
