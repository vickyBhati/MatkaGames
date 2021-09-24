package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.View.IAddContactView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.api.RestService;
import com.dev.goldengames.model.ModelAddContact;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddCustomerPresenter extends BasePresenter<IAddContactView> {

    public void addCustomer(final Context context,  JsonObject jsonObject, String token ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().addCustomer(RestService.requestBodyJsonObject("" + jsonObject),"Bearer " +token).enqueue(new Callback<ModelAddContact>() {
            @Override
            public void onResponse(@NonNull Call<ModelAddContact> call, @NonNull Response<ModelAddContact> response) {
                getView().enableLoadingBar(context, false, "");
                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 201) {
                        getView().onSuccess(response.body());
                    }
                }else{
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ModelAddContact> call, @NonNull Throwable t) {
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
