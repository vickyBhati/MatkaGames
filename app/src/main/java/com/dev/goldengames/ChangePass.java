package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.View.IBasicView;
import com.dev.goldengames.api_presnter.ChangePassPresenter;
import com.dev.goldengames.databinding.ActivityPasswordBinding;
import com.dev.goldengames.databinding.ActivityProfileBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.NewLoginModel;

import java.util.HashMap;
import java.util.Map;

public class ChangePass extends BaseActivity implements IBasicView {

    ActivityPasswordBinding binding;
    ChangePassPresenter presenter;
    NewLoginModel userinfo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_password);
        binding.mytool.title.setText("Change Password");
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        presenter =new ChangePassPresenter();
        presenter.setView(this);

        userinfo= AppPreference.getUserInfo(ChangePass.this);


    }
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnEnglish:
                if (TextUtils.isEmpty(binding.etUserPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please enter current password",Toast.LENGTH_SHORT).show();
                }
                else  if (TextUtils.isEmpty(binding.etNewPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please enter new password",Toast.LENGTH_SHORT).show();
                }
                else  if (binding.etNewPassword.getText().toString().length()<8){
                    Toast.makeText(getApplicationContext(),"password must be 8 characters",Toast.LENGTH_SHORT).show();
                }
                else  if (TextUtils.isEmpty(binding.etRepeatPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please enter confirm password",Toast.LENGTH_SHORT).show();
                }
                else if (!Utility.isequal(binding.etNewPassword.getText().toString(),binding.etRepeatPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"New Password & Confirm password not match ",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("user_id",""+userinfo.getData().getId());
                        map.put("old_password",binding.etUserPassword.getText().toString().trim());
                        map.put("password",binding.etRepeatPassword.getText().toString().trim());
                        presenter.chnage_password(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
                }
                break;
        }
    }


    @Override
    public void onSuccess(BasicModel body) {
        int status1 = body.getStatus();
        if (status1 == 1) {
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
            finish();
        }
        else  if (status1==0){
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public Context getContext() {
        return this;
    }
}
