package com.dev.goldengames.api_presnter;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dev.goldengames.R;
import com.dev.goldengames.View.IProfileView;
import com.dev.goldengames.api.AppController;
import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.ModelGetData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Map;

public class ProfilePresenter extends BasePresenter<IProfileView> {

    public void user_profile(final Context context,  Map<String, Object> map ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().user_profile(map).enqueue(new Callback<ModelGetData>() {
            @Override
            public void onResponse(@NonNull Call<ModelGetData> call, @NonNull Response<ModelGetData> response) {
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
            public void onFailure(@NonNull Call<ModelGetData> call, @NonNull Throwable t) {
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
    public void saveProfile(final Context context,  Map<String, Object> map ) {

        getView().enableLoadingBar(context, true, context.getString(R.string.msg_please_wait));

        AppController.getInstance().getApiInterface().saveProfile(map).enqueue(new Callback<BasicModel>() {
            @Override
            public void onResponse(@NonNull Call<BasicModel> call, @NonNull Response<BasicModel> response) {
                getView().enableLoadingBar(context, false, "");

                if (!handleError(response)) {
                    if (response.isSuccessful() && response.code() == 200) {
                        getView().onUpdate(response.body());
                    }
                }else{
                    getView().onError(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<BasicModel> call, @NonNull Throwable t) {
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
