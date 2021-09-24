package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.View.IProfileView;
import com.dev.goldengames.api_presnter.ProfilePresenter;
import com.dev.goldengames.databinding.ActivityProfileBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.ModelGetData;
import com.dev.goldengames.model.NewLoginModel;

import java.util.HashMap;
import java.util.Map;

public class Profile extends BaseActivity implements IProfileView {

    ActivityProfileBinding binding;
    ProfilePresenter profilePresenter;
    NewLoginModel userinfo;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_profile);
        binding.myTool.title.setText("Profile");
        binding.myTool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        profilePresenter = new ProfilePresenter();
        profilePresenter.setView(this);

        userinfo= AppPreference.getUserInfo(Profile.this);
        callThis();

    }

    public void onClick(View view) {
        switch (view.getId()){
           case  R.id.btnPassword:
               Intent intent = new Intent(this,ChangePass.class);
               startActivity(intent);
               break;
        }
    }

    private void callThis() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",""+userinfo.getData().getId());
            profilePresenter.user_profile(this, map);
        }
        else {
            Utility.no_internet(this);
        }

    }


    @Override
    public void onSuccess(ModelGetData body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            binding.etName.setText(body.getData().getName());
//            binding.usserNaa.setText(body.getData().getUsername());
            binding.etphone.setText(""+body.getData().getMobile());
//            binding.etContactNo.setText(""+body.getValue().getMob_phone());

        }
        else  if (status1==0){
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onUpdate(BasicModel body) {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
