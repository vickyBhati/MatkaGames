package com.dev.goldengames;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.View.INewLoginView;
import com.dev.goldengames.api_presnter.LoginPresenter;
import com.dev.goldengames.databinding.ActivityLoginBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.ModelPgone;
import com.dev.goldengames.model.NewLoginModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginActivity extends BaseActivity implements INewLoginView {

    ActivityLoginBinding activityLoginBinding;
    LoginPresenter presenter;
    String token;
    ProgressDialog progressDoalog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        presenter = new LoginPresenter();
        presenter.setView(this);
        callfire();
        callLogin();
    }

    private void callLogin() {
        if (Utility.hasConnection(this)) {
            presenter.getSetting(this);
        }
        else {
            Utility.no_internet(this);
        }

    }

    private void callfire() {
        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (!task.isSuccessful()) {
                            Log.e("firebase", "getInstanceId failed", task.getException());
                            return;
                        }

                        // Get new Instance ID token
                        token = Objects.requireNonNull(task.getResult()).getToken();

                        Log.e("token",""+token);
                    }
                });

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                if (TextUtils.isEmpty(activityLoginBinding.etUserName.getText().toString())){
                    Utility.showToast(activityLoginBinding.mainLayout,"Please enter phone number ");
                }
                else  if (TextUtils.isEmpty(activityLoginBinding.etUserPassword.getText().toString())){
                    Utility.showToast(activityLoginBinding.mainLayout,"Please enter user password");
                }
                else {
                    if (Utility.hasConnection(this)) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("mobile",  activityLoginBinding.etUserName.getText().toString());
                        map.put("password",  activityLoginBinding.etUserPassword.getText().toString());
                        map.put("DeviceToken",  ""+token);
                        presenter.login(this, map);
                    }
                    else {
                        Utility.no_internet(this);
                    }

                }
                break;
            case  R.id.txtSign:
                Intent intent2 = new Intent(LoginActivity.this, SignUp.class);
                startActivity(intent2);

                break;
        }

    }

    @Override
    public void onSuccess(NewLoginModel body) {
        if (body!=null){
            int status1 = body.getStatus();
            String message = body.getMessage();
            if (status1 == 1) {
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();
                AppPreference.saveUserInfoo(LoginActivity.this, body);
                AppPreference.wallet(LoginActivity.this, String.valueOf(body.getData().getWallet()));
                Intent i = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
                finishAffinity();

            }
            else  if (status1==0){
                Toast.makeText(getApplicationContext(),body.getMessage(),Toast.LENGTH_SHORT).show();

            }
        }
        else {
            Utility.showErrorToast(LoginActivity.this,"Server error");
        }

    }

    @Override
    public void onPhone(ModelPgone body) {
    if (body!=null){
        if (body.getStatus()==1){
            activityLoginBinding.nymber.setText("Contact Number: "+body.getData().getContact_no());
        }
    }
    }

    @Override
    public Context getContext() {
        return this;
    }

}
