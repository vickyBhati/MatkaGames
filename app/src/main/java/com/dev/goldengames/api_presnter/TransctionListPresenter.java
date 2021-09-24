package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dev.goldengames.View.ITransctionView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.TrasnscationModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TransctionListPresenter extends BasePresenter<ITransctionView> {

    public void transction(final Context context,  Map<String, Object> map ) {

//        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().transction(map).enqueue(new Callback<TrasnscationModel>() {
            @Override
            public void onResponse(@NonNull Call<TrasnscationModel> call, @NonNull Response<TrasnscationModel> response) {
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
            public void onFailure(@NonNull Call<TrasnscationModel> call, @NonNull Throwable t) {
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
