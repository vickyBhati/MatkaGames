package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;


import com.dev.goldengames.View.IOtpView;
import com.dev.goldengames.api_presnter.OtpPresenter;
import com.dev.goldengames.databinding.OtpBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.NewLoginModel;

import java.util.HashMap;
import java.util.Map;

public class Otp extends BaseActivity implements IOtpView {

    OtpBinding binding;
    OtpPresenter presenter;
    NewLoginModel userinfo;
    String otp,from;
    String id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.otp);
        binding.mytool.title.setText("OTP");
        userinfo= AppPreference.getUserInfo(Otp.this);

        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        if (intent!=null){
            from  = intent.getStringExtra("from");
            otp = intent.getStringExtra("otp");
            id = intent.getStringExtra("id");
            Log.e("otp",""+otp);
            binding.otp.setText(otp);
        }
        presenter = new OtpPresenter();
        presenter.setView(this);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOtp:
                if (from.equals("forgot")){
                    if (TextUtils.isEmpty(binding.otp.getText().toString().trim())){
                        Utility.showErrorToast(Otp.this,"Please enter otp");
                    }
                    else {
                        if (Utility.hasConnection(this)) {
                            Map<String, Object> map = new HashMap<>();
                            map.put("user_id",id);
                            map.put("otp",binding.otp.getText().toString().trim());
                            presenter.forgot_otp(this, map);
                        }
                        else {
                            Utility.no_internet(this);
                        }
                    }
                }
                else {

                    if (TextUtils.isEmpty(binding.otp.getText().toString().trim())){
                        Utility.showErrorToast(Otp.this,"Please enter otp");
                    }
                    else {
                        if (Utility.hasConnection(this)) {
                            Map<String, Object> map = new HashMap<>();
                            map.put("user_id",id);
                            map.put("otp",binding.otp.getText().toString().trim());
                            presenter.login(this, map);
                        }
                        else {
                            Utility.no_internet(this);
                        }
                    }
                }
                break;
            }
        }

    @Override
    public void onSuccess(BasicModel body) {
        if(body!=null){
            if(body.getStatus()==1){
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Otp.this,LoginActivity.class);
                startActivity(intent);
                finishAffinity();
            }
            else if (body.getStatus()==0){
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

            }

        }
    }

    @Override
    public void onForgot(BasicModel body) {
        if (body!=null){
            if (body.getStatus()==1){
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Otp.this, ResetActivity.class);
                intent.putExtra("id",""+id);
                startActivity(intent);
                finishAffinity();
            }
            else if (body.getStatus()==0){
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

            }
        }
    }

    @Override
    public Context getContext() {
        return this;
    }
}
