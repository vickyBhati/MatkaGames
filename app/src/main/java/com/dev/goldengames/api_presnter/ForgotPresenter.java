package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;


import com.dev.goldengames.R;
import com.dev.goldengames.View.IForgotView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.ForgotModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForgotPresenter extends BasePresenter<IForgotView> {

    public void forgot_password(final Context context,  Map<String, Object> map ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().forgot_password(map).enqueue(new Callback<ForgotModel>() {
            @Override
            public void onResponse(@NonNull Call<ForgotModel> call, @NonNull Response<ForgotModel> response) {
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
            public void onFailure(@NonNull Call<ForgotModel> call, @NonNull Throwable t) {
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
