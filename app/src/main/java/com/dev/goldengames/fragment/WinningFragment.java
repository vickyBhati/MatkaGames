package com.dev.goldengames.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.dev.goldengames.R;
import com.dev.goldengames.Utility;
import com.dev.goldengames.View.IBetHistoryView;
import com.dev.goldengames.adapter.Adapterbethistory;
import com.dev.goldengames.api_presnter.BetHistoryPresenter;
import com.dev.goldengames.databinding.FragmentWinnningBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.ModelBetHistory;
import com.dev.goldengames.model.NewLoginModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WinningFragment extends BaseFragment implements IBetHistoryView {

    FragmentWinnningBinding binding;
    BetHistoryPresenter presenter;
    NewLoginModel userinfo;
    ArrayList<ModelBetHistory.DataBean> list= new ArrayList<ModelBetHistory.DataBean>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_winnning, container, false);
        View view = binding.getRoot();
        userinfo= AppPreference.getUserInfo(getActivity());

        presenter = new BetHistoryPresenter();
        presenter.setView(this);


        callApi();


       return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        binding.shimmerViewContainer.startShimmerAnimation();
    }

    private void callApi() {
        if (Utility.hasConnection(getActivity())) {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",""+userinfo.getData().getId());
            presenter.bet_history(getActivity(), map);
        }
        else {
            Utility.no_internet(getActivity());
        }
    }

    @Override
    public void onSuccess(ModelBetHistory body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        if (status1 == 1) {
            list.addAll(body.getData());
            binding.shimmerViewContainer.stopShimmerAnimation();
            binding.shimmerViewContainer.setVisibility(View.GONE);

            binding.recyclerView.setVisibility(View.VISIBLE);
            Adapterbethistory adapter = new Adapterbethistory(getActivity(),list);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
            binding.recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        }
        else  if (status1==0){
            binding.shimmerViewContainer.stopShimmerAnimation();
            binding.shimmerViewContainer.setVisibility(View.GONE);
//            Utility.showErrorToast(getActivity(),body.getMessage());
            binding.recyclerView.setVisibility(View.GONE);
        }

    }
}