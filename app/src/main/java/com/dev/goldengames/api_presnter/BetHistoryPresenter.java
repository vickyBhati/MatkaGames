package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;


import com.dev.goldengames.View.IBetHistoryView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.ModelBetHistory;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BetHistoryPresenter extends BasePresenter<IBetHistoryView> {

    public void bet_history(final Context context,  Map<String, Object> map ) {

//        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().bet_history(map).enqueue(new Callback<ModelBetHistory>() {
            @Override
            public void onResponse(@NonNull Call<ModelBetHistory> call, @NonNull Response<ModelBetHistory> response) {
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
            public void onFailure(@NonNull Call<ModelBetHistory> call, @NonNull Throwable t) {
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
