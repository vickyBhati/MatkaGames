package com.dev.goldengames.View;


import com.dev.goldengames.model.BasicModel;
import com.dev.goldengames.model.Modelgame;

public interface IGameView extends IView {

    void onSuccess(Modelgame body);
    void onAddBit(BasicModel body);

}
