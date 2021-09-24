package com.dev.goldengames.View;


import com.dev.goldengames.model.BasicModel;

public interface IOtpView extends IView {

    void onSuccess(BasicModel body);
    void onForgot(BasicModel body);

}
