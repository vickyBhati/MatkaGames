package com.dev.goldengames.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dev.goldengames.R;


public class BaseFragment extends Fragment {

    private static Toast toast;

    private ProgressDialog pDialog;

    public BaseFragment() {
        // Required empty radio_uncheck constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getAccountStatus();
    }





    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public String tag() {
        return getClass().getSimpleName();
    }

    public void log(String message) {
        Log.d(tag(), message);
    }

    public void loadProgressBar(Context context, String message, boolean cancellable) {

//        if (mProgressDialog == null)
//            mProgressDialog = new SpotsDialog(this, message, R.style.SpotCustomDialog);
//        if ((context != null && !((Activity) context).isFinishing()) && !mProgressDialog.isShowing())
//            mProgressDialog.show();

        if (pDialog == null) {
            pDialog = new ProgressDialog(context);
            pDialog.setMessage(message);
            pDialog.setCancelable(false);
//            pDialog.setIndeterminate(true);
        }
        if ((context != null && !((Activity) context).isFinishing()) && !pDialog.isShowing())
            pDialog.show();

    }

    public void dismissProgressBar(Context context) {
        /*if (mProgressDialog != null) {
            if ((context != null && !((Activity) context).isFinishing()) && mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
            mProgressDialog = null;
        } */

        if (pDialog != null) {
            if ((context != null && !((Activity) context).isFinishing()) && pDialog.isShowing()) {
                pDialog.dismiss();
            }
            pDialog = null;
        }
    }

    public AlertDialog.Builder getAlertDialogBuilder(String title, String message, boolean cancellable) {
        return new AlertDialog.Builder(getActivity(), R.style.AppTheme_AlertDialog)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(cancellable);
    }

    public void enableLoadingBar(Context context, boolean enable, String s) {
        if(isAdded()) {
            if (enable) {
                loadProgressBar(context,  s, false);
            } else {
                dismissProgressBar(context);
            }
        }

    }

    public void onError(String reason) {
        if(getActivity()!=null && isAdded())
            onError(reason, false);
    }

    public void onError(String reason, final boolean finishOnOk) {
        if (reason != null && !reason.isEmpty()) {
            getAlertDialogBuilder(null, reason, false)
                    .setPositiveButton(getString(R.string.btn_ok), finishOnOk ? new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            getActivity().finish();
                        }
                    } : null).show();
        } else {
            getAlertDialogBuilder(null, getString(R.string.default_error), false)
                    .setPositiveButton(getString(R.string.btn_ok), finishOnOk ? new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            getActivity().finish();
                        }
                    } : null).show();
        }
    }


//    public void UserLogout(AppCompatActivity activity) {
//        SessionManager.clearAll(getActivity());
//
//        Intent intent = new Intent(activity, LoginActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);
//        getActivity().finishAffinity();
//    }

}
