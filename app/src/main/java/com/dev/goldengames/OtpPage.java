package com.dev.goldengames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.databinding.OtpBinding;

public class OtpPage extends AppCompatActivity {


    OtpBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.otp);
    }

    public void onClick(View view) {
    switch (view.getId()){
       case  R.id.btnOtp:
           Intent intent = new Intent(OtpPage.this, Home.class);
           startActivity(intent);
        break;
    }
    }
}
