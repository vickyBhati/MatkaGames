package com.dev.goldengames.api_presnter;


import android.util.Log;

import com.dev.goldengames.View.IView;


public abstract class BasePresenter<I extends IView> {

    I iView;

    public BasePresenter() {
    }

    public I getView() {
        return iView;
    }

    public void setView(I iView) {
        this.iView = iView;
    }


    public boolean handleError(retrofit2.Response response) {
        /*if (response.code() == 203) {
           // return handleError(((BaseResponse) response.body()), false);
        }
        else if (response.code() == 440) {
            getView().onTokenExpired();
            return true;
        }
        else */
        if (response.errorBody() != null) {
            try {
                String error = response.errorBody().string();
                Log.d("tessssssss",""+error);

//                Converter<ResponseBody, ErrorResponse> converter = retrofit2.responseBodyConverter(ErrorResponse.class, new Annotation[0]);

//                JSONObject jObjError = new JSONObject(error);
//                String jerror=  jObjError.getString("error");

                getView().onError(!error.isEmpty() ? error : null);
            } catch (Exception e) {
                e.printStackTrace();
                getView().onError(null);
                return true;
            }
            return true;
        }
        return false;
    }

  /*  public boolean handleError(BaseResponse response, boolean success) {
        if (response != null && response.meta != null) {

            if (response.meta.getHasUpdate()) {
                if (response.meta.getForceUpdate())
                    getView().onForceUpdate();
                else
                    getView().onSoftUpdate();
                return true;
            }
        }
        if (success) {
            return false;
        } else {
            getView().onError(response != null ? response.replyMsg : null);
            return true;
        }

    }*/
}
