package com.dev.goldengames.View;

import android.content.Context;

public interface IView {

    Context getContext();

    void enableLoadingBar(Context context, boolean enable, String s);

    void onError(String reason);
}
