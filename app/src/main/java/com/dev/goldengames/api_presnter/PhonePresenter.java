package com.dev.goldengames.api_presnter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.Utility;
import com.dev.goldengames.View.IPhoneView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.ProductModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PhonePresenter extends BasePresenter<IPhoneView> {

    public void phone(final Context context,   String s,String invoice ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().getproduct(invoice,"").enqueue(new Callback<ProductModel>() {
            @Override
            public void onResponse(@NonNull Call<ProductModel> call, @NonNull Response<ProductModel> response) {
                getView().enableLoadingBar(context, false, "");
                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onSuccess(response.body());
                    }
                }else{
                    Log.e("vikcy2",""+response);
                    Utility.showErrorToast(context,"No user found with this username");
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ProductModel> call, @NonNull Throwable t) {
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
