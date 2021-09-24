package com.dev.goldengames.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.ModelLogin;
import com.dev.goldengames.PlayGame;
import com.dev.goldengames.R;
import com.dev.goldengames.api_presnter.AddCustomerPresenter;
import com.dev.goldengames.databinding.FragmentAddCustomerBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.ModelUser;
import com.google.gson.JsonObject;

public class AddCusFragment extends BaseFragment{

    FragmentAddCustomerBinding binding;
    AddCustomerPresenter presenter;
    JsonObject gsonObject;
    ModelLogin modelLogin;
    ModelUser modelUser;
    ProgressDialog progressDoalog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_customer, container, false);

        modelLogin = AppPreference.getUser(getActivity());
//        modelUser = AppPreference.getUserInfo(getActivity());
//        presenter = new AddCustomerPresenter();
//        presenter.setView(this);

        binding.llSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getActivity(), PlayGame.class);
                startActivity(intent);
            }
        });
        View view = binding.getRoot();
        return view;

    }


}