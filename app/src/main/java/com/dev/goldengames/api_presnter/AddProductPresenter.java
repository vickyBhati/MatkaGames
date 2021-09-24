package com.dev.goldengames.api_presnter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.Utility;
import com.dev.goldengames.View.IAddProductView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.api.RestService;
import com.dev.goldengames.model.ModelAllPhone;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddProductPresenter extends BasePresenter<IAddProductView> {

    public void addProduct(final Context context, JsonObject jsonObject, String token) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().addProduct(RestService.requestBodyJsonObject("" + jsonObject),token).enqueue(new Callback<String>() {
            @Override
            public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
                getView().enableLoadingBar(context, false, "");
                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onSuccess(response.body());
                    }
                }else{
                    Log.e("vikcy2",""+response);
                    Utility.showErrorToast(context,"Number already added");
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

    public void phone(final Context context, String auth, String s ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().phone(auth,s).enqueue(new Callback<ModelAllPhone>() {
            @Override
            public void onResponse(@NonNull Call<ModelAllPhone> call, @NonNull Response<ModelAllPhone> response) {
                getView().enableLoadingBar(context, false, "");
                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onSuccessTwo(response.body());
                    }
                }else{
                    Log.e("vikcy2",""+response);
                    Utility.showErrorToast(context,"No user found with this username");
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ModelAllPhone> call, @NonNull Throwable t) {
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
