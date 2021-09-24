package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;


import com.dev.goldengames.R;
import com.dev.goldengames.View.INewLoginView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.ModelPgone;
import com.dev.goldengames.model.NewLoginModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter extends BasePresenter<INewLoginView> {

    public void login(final Context context,  Map<String, Object> map ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().user_login(map).enqueue(new Callback<NewLoginModel>() {
            @Override
            public void onResponse(@NonNull Call<NewLoginModel> call, @NonNull Response<NewLoginModel> response) {
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
            public void onFailure(@NonNull Call<NewLoginModel> call, @NonNull Throwable t) {
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

    public void getSetting(final Context context) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().getSetting().enqueue(new Callback<ModelPgone>() {
            @Override
            public void onResponse(@NonNull Call<ModelPgone> call, @NonNull Response<ModelPgone> response) {
                getView().enableLoadingBar(context, false, "");

                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onPhone(response.body());
                    }
                }else{
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ModelPgone> call, @NonNull Throwable t) {
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
