package com.dev.goldengames.View;


import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.ModelGetData;

public interface IProfileView extends IView {

    void onSuccess(ModelGetData body);
    void onUpdate(BasicModel body);

}
