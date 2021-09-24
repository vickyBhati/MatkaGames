package com.dev.goldengames;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.View.ISignUpView;
import com.dev.goldengames.api_presnter.SignUpPresenter;
import com.dev.goldengames.databinding.ActivityRegisterBinding;
import com.dev.goldengames.model.SignupModel;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends BaseActivity implements ISignUpView {

    ActivityRegisterBinding binding;
    SignUpPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register);
        presenter =new SignUpPresenter();
        presenter.setView(this);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.txtLogin:
                finish();
                break;
            case  R.id.btnLogin:
                if (TextUtils.isEmpty(binding.etPhone.getText().toString().trim())){
                    Toast.makeText(getApplicationContext(),"Please enter contact number",Toast.LENGTH_SHORT).show();
                }
                else if(binding.etPhone.getText().toString().length()<7){
                    Toast.makeText(getApplicationContext(),"Mobile no must be 7 to 15 digit",Toast.LENGTH_SHORT).show();
                }

                else  if (TextUtils.isEmpty(binding.etName.getText().toString().trim())){
                    Toast.makeText(getApplicationContext(),"Please enter user name",Toast.LENGTH_SHORT).show();
                }

                else  if (TextUtils.isEmpty(binding.etUserPassword.getText().toString().trim())){
                    Toast.makeText(getApplicationContext(),"Please enter user password",Toast.LENGTH_SHORT).show();
                }
                else  if (binding.etUserPassword.getText().toString().length()<8){
                    Toast.makeText(getApplicationContext(),"Password must be 8 characters  ",Toast.LENGTH_SHORT).show();
                }
                else {
//                    Intent intent1 = new Intent(SignupActivity.this,MainActivity.class);
//                    startActivity(intent1);
//                    finishAffinity();

                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("name",binding.etName.getText().toString().trim());
                        map.put("mobile",binding.etPhone.getText().toString().trim());
//                        map.put("username",binding.etUserName.getText().toString().trim());
                        map.put("password",binding.etUserPassword.getText().toString().trim());
                        presenter.sign_up(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }
                }
                break;
        }
    }

    @Override
    public void onSuccess(SignupModel body) {
        String status1 = body.getStatus();
        if (status1.equals("1")) {
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUp.this,Otp.class);
            intent.putExtra("otp",""+body.getOtp());
            intent.putExtra("from","signup");
            intent.putExtra("id",""+body.getData().getUser_id());
            startActivity(intent);
            finishAffinity();
        }
        else  if (status1.equals("0")){
            Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public Context getContext() {
        return this;
    }
}
