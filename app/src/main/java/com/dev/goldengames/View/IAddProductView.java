package com.dev.goldengames.View;


import com.dev.goldengames.model.ModelAllPhone;

public interface IAddProductView extends IView {

    void onSuccess(String body);
    void onSuccessTwo(ModelAllPhone body);

}
