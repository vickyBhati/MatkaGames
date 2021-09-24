package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;


import com.dev.goldengames.R;
import com.dev.goldengames.View.IPlayView;
import com.dev.goldengames.api.AppController;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HowToPlayPresenter extends BasePresenter<IPlayView> {

    public void plsy(final Context context) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().plsy().enqueue(new Callback<String>() {
            @Override
            public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
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
            public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {
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
