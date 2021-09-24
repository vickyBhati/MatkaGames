package com.dev.goldengames.View;


import com.dev.goldengames.model.ModelPgone;
import com.dev.goldengames.model.NewLoginModel;

public interface INewLoginView extends IView {

    void onSuccess(NewLoginModel body);
    void onPhone(ModelPgone body);

}
