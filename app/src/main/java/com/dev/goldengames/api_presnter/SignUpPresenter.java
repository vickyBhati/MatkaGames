package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.View.ISignUpView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.SignupModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpPresenter extends BasePresenter<ISignUpView> {

    public void sign_up(final Context context,  Map<String, Object> map ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().sign_up(map).enqueue(new Callback<SignupModel>() {
            @Override
            public void onResponse(@NonNull Call<SignupModel> call, @NonNull Response<SignupModel> response) {
                getView().enableLoadingBar(context, false, "");

                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onSuccess(response.body());
                    }
                }else{
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<SignupModel> call, @NonNull Throwable t) {
                getView().enableLoadingBar(context, false, "");
                try {
                    t.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                getView().onError(t.getMessage());
            }
        });
    }

}
