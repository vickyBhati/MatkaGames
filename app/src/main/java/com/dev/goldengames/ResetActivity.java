package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;


import com.dev.goldengames.View.IBasicView;
import com.dev.goldengames.api_presnter.ResetPassPresenter;
import com.dev.goldengames.databinding.ResetPasswordBinding;
import com.dev.goldengames.model.BasicModel;

import java.util.HashMap;
import java.util.Map;

public class ResetActivity extends BaseActivity implements IBasicView {

    ResetPasswordBinding binding;
    ResetPassPresenter presenter;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.reset_password);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Reset Password");

        presenter =new ResetPassPresenter();
        presenter.setView(this);

        Intent intent  = getIntent();
        if (intent!=null){
            id = intent.getStringExtra("id");
        }

//        Log.e("eeeeeee",""+userinfo.getValue().getUserId());
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnEnglish:
                 if (TextUtils.isEmpty(binding.etNewPassword.getText().toString())){
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
                        map.put("user_id",""+id);
                        map.put("password",binding.etRepeatPassword.getText().toString().trim());
                        presenter.reset_password(this, map);
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
            Intent intent = new Intent(ResetActivity.this, LoginActivity.class);
            startActivity(intent);
            finishAffinity();
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
