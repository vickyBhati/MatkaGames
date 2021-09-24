package com.dev.goldengames.View;


import com.dev.goldengames.model.ModelDashboard;
import com.dev.goldengames.model.ModelGetData;

public interface IDashboardView extends IView {

    void onSuccess(ModelDashboard body);
    void onProfile(ModelGetData body);
    void onDeflu(String body);
    void onSilder(String body);

}
