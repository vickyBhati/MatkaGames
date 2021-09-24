package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;


import com.dev.goldengames.View.IForgotView;
import com.dev.goldengames.api_presnter.ForgotPresenter;
import com.dev.goldengames.databinding.ForgotBinding;
import com.dev.goldengames.model.ForgotModel;

import java.util.HashMap;
import java.util.Map;

public class ForgotPage extends BaseActivity implements IForgotView {


    ForgotBinding binding;
    ForgotPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.forgot);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Forgot Password");
        presenter = new ForgotPresenter();
        presenter.setView(this);



    }

    @Override
    public void onSuccess(ForgotModel body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ForgotPage.this, Otp.class);
            i.putExtra("from","forgot");
            i.putExtra("id",""+body.getData().getUser_id());
            startActivity(i);

        }
        else  if (status1==0){
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public Context getContext() {
        return this;
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOtp:
                if (TextUtils.isEmpty(binding.etPhone.getText().toString())){
                    Utility.showErrorToast(ForgotPage.this,"Please enter phone no");
                }
                else {
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("mobile",  binding.etPhone.getText().toString());
                        presenter.forgot_password(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
                }
                break;
        }
    }
}
