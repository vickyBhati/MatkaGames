package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.View.IBhavListView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.BhavListModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BhavListPresenter extends BasePresenter<IBhavListView> {

    public void dashboard(final Context context) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().bhavlist().enqueue(new Callback<BhavListModel>() {
            @Override
            public void onResponse(@NonNull Call<BhavListModel> call, @NonNull Response<BhavListModel> response) {
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
            public void onFailure(@NonNull Call<BhavListModel> call, @NonNull Throwable t) {
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
