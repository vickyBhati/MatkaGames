package com.dev.goldengames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dev.goldengames.View.IDashboardView;
import com.dev.goldengames.api_presnter.DashboardPresenter;
import com.dev.goldengames.databinding.ActivityMainBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.fragment.HomeFragment;
import com.dev.goldengames.fragment.ProfileFragment;
import com.dev.goldengames.fragment.SelesFragment;
import com.dev.goldengames.fragment.WingFragment;
import com.dev.goldengames.fragment.WinningFragment;
import com.dev.goldengames.model.ModelDashboard;
import com.dev.goldengames.model.ModelGetData;
import com.dev.goldengames.model.NewLoginModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener, IDashboardView {

   public static ActivityMainBinding binding;
    DashboardPresenter presenter;
    NewLoginModel userinfo;
    public static TextView username;
    public static TextView phone;
    public static String  wallet="0";
    ArrayList<ModelDashboard.DataBean> list = new ArrayList<ModelDashboard.DataBean>();
    ArrayList<String> bannersBeans =  new  ArrayList<String>();
    String contactNo,amount;
    JSONArray jsonArray;
    private long mLastClickTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawer, binding.toolbar, R.string.open, R.string.close);
        toggle.setDrawerIndicatorEnabled(false);
        toggle.setHomeAsUpIndicator(R.drawable.ic_menu);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        binding.title.setText("Dashboard");
        binding.refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.shimmerViewContainer.setVisibility(View.VISIBLE);
                binding.shimmerViewContainer.startShimmerAnimation();
                callApi("refresh");
            }
        });
        binding.mainLayout1.admindashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        binding.mainLayout1.transList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AccountStatmentActivity.class);
                startActivity(intent);
            }
        });
        binding.mainLayout1.prfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBetHistory.class);
                startActivity(intent);
            }
        });

        binding.mainLayout1.logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utility.logout(MainActivity.this);

            }
        });

        binding.mainLayout1.llgateRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityKuberJackpot.class);
                startActivity(intent);
            }
        });
        binding.mainLayout1.fdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityPlay.class);
                startActivity(intent);
            }
        });

        userinfo = AppPreference.getUserInfo(MainActivity.this);
        presenter = new DashboardPresenter();
        presenter.setView(this);
        binding.mainLayout1.userName.setText(userinfo.getData().getName());
        binding.mainLayout1.phone.setText(""+userinfo.getData().getMobile());
        caSilder();
       // callProfiel();
    }
    private void callApi(String refresh) {
        enableLoadingBar(this,true,"please wait...");
        if (refresh.equalsIgnoreCase("refresh")){
            if (Utility.hasConnection(this)) {
                Map<String, Object> map = new HashMap<>();
                presenter.dashboard(this);
            } else {
                Utility.no_internet(this);
            }
        }
        else {
            if (Utility.hasConnection(this)) {
                Map<String, Object> map = new HashMap<>();
                presenter.dashboard(this);
            } else {
                Utility.no_internet(this);
            }
        }


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.naviHome:
                fragment = new HomeFragment(list, contactNo, jsonArray,amount);
                binding.title.setText("Dashboard");
                binding.refresh.setVisibility(View.VISIBLE);
                break;
            case R.id.navigationAddCus:
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return true;
                }
                mLastClickTime = SystemClock.elapsedRealtime();

                fragment = new WinningFragment();
                binding.title.setText("BIDS");
                binding.refresh.setVisibility(View.GONE);
                break;
            case R.id.navigationSales:
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return true;
                }
                mLastClickTime = SystemClock.elapsedRealtime();


                fragment = new SelesFragment();
                binding.title.setText("TRANSACTION");
                binding.refresh.setVisibility(View.GONE);
                break;
            case R.id.winning:
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return true;
                }
                mLastClickTime = SystemClock.elapsedRealtime();


                fragment = new WingFragment();
                binding.title.setText("WINNING");
                binding.refresh.setVisibility(View.GONE);
                break;
            case R.id.profile:
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return true;
                }
                mLastClickTime = SystemClock.elapsedRealtime();


                fragment = new ProfileFragment();
                binding.title.setText("PROFILE");
                binding.refresh.setVisibility(View.GONE);
                break;
        }
        return loadFragment(fragment);
    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llOffer:
                Intent intent = new Intent(this,DetailsActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onSuccess(ModelDashboard body) {
        int status1 = body.getStatus();
        String message = body.getMessage();
        contactNo = body.getContact_no();
//        binding.number.setText(""+body.getContact_no());
        //caSilder();
        callProfiel();
        if (status1 == 1) {
            list.clear();
            binding.refresh.setVisibility(View.VISIBLE);
            binding.navigation.setVisibility(View.VISIBLE);
            binding.shimmerViewContainer.stopShimmerAnimation();
            binding.shimmerViewContainer.setVisibility(View.GONE);

//            binding.txtWallet.setText("Wallet -:"+body.getValue().getBalance());
            list.addAll(body.getData());
                loadFragment(new HomeFragment(list,contactNo,jsonArray, amount));
                BottomNavigationView navigation = findViewById(R.id.navigation);
                navigation.setOnNavigationItemSelectedListener(this);

        }
        else  if (status1==0){
            binding.shimmerViewContainer.stopShimmerAnimation();
            binding.shimmerViewContainer.setVisibility(View.GONE);
        }
    }

    private void caSilder() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
            presenter.silder(this);
        } else {
            Utility.no_internet(this);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        binding.txtWallet.setText(AppPreference.getString(getApplicationContext(),"wallet"));
        binding.shimmerViewContainer.startShimmerAnimation();
//            if (wallet.equals("1")){
//                binding.shimmerViewContainer.startShimmerAnimation();
//                //callProfiel();
//            wallet="0";

    }

    @Override
    public void onProfile(ModelGetData body) {
        int status1 = body.getStatus();
        if (status1 == 1) {
            binding.txtWallet.setText(""+body.getData().getWallet());
        }
    }

    @Override
    public void onDeflu(String body) {

    }

    private void callProfiel() {
        if (Utility.hasConnection(this)) {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id", "" + userinfo.getData().getId());
            presenter.user_profile(this,map);
        } else {
            Utility.no_internet(this);
        }


    }
    @Override
    public void onSilder(String body) {
        callApi("tik");
        try {
            JSONObject myObject = new JSONObject(body);
            int status = myObject.getInt("status");
            if (status==1){
                jsonArray = new JSONArray();
                jsonArray = myObject.getJSONArray("data");
//                SliderAdapter adapter = new SliderAdapter(this, jsonArray);
//                binding.slider.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
//                binding.slider.setSliderAdapter(adapter);
//                binding.slider.setScrollTimeInSec(3);
//                binding.slider.setAutoCycle(true);
//
//                // to start autocycle below method is used.
//                binding.slider.startAutoCycle();

//                AdapterPromotionTwo adapter = new AdapterPromotionTwo(jsonArray,getApplicationContext());
//                binding.promotionOne.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
//                binding.promotionOne.setItemAnimator(new DefaultItemAnimator());
//                binding.promotionOne.setAdapter(adapter);
//                adapter.notifyDataSetChanged();



            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Context getContext() {
        return this;
    }
}
