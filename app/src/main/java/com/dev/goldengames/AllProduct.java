package com.dev.goldengames;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.dev.goldengames.View.IPhoneView;
import com.dev.goldengames.adapter.AdapterProductList;
import com.dev.goldengames.api.ApiInterface;
import com.dev.goldengames.api_presnter.ProductPresenter;
import com.dev.goldengames.databinding.AllCustomerBinding;
import com.dev.goldengames.databinding.ProductPageBinding;
import com.dev.goldengames.extra.AppPreference;
import com.dev.goldengames.model.ProductModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AllProduct extends  BaseActivity implements IPhoneView {


    ProductPageBinding binding;
    ProductPresenter phonePresenter;
    ModelLogin modelLogin;
    String demo="";
    ArrayList<ProductModel.DataBean.ItemsBean> list = new ArrayList<ProductModel.DataBean.ItemsBean>();
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.product_page);
        binding.mytool.title.setText("Product");
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        modelLogin = AppPreference.getUser(AllProduct.this);
        Intent  intent =getIntent();
        if (intent!=null){
            demo  = intent.getStringExtra("id");
            Log.e("demoooo",""+demo);
        }

        phonePresenter = new ProductPresenter();
        phonePresenter.setView(this);

        callApi();

    }

    private void callApi() {
        progressDoalog = new ProgressDialog(AllProduct.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://173.212.228.37/Api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface client = retrofit.create(ApiInterface.class);
        Call<ProductModel> calltargetResponse = client.getproduct("Bearer " + modelLogin.getAccess_token(),demo);
        calltargetResponse.enqueue(new Callback<ProductModel>() {
            @Override
            public void onResponse(@NotNull Call<ProductModel> call, @NotNull Response<ProductModel> response) {
                if (response.code() == 200){
                    if (response.body() != null) {
                        progressDoalog.dismiss();
                        binding.datee.setText(response.body().getData().getInvoice_date());
                        binding.name.setText(response.body().getData().getName());
                        Log.e("sucess=",""+response.body().getData().getInvoice_date());
                        list.addAll(response.body().getData().getItems());
                        Log.e("size", String.valueOf(list.size()));
                        AdapterProductList adapter = new AdapterProductList(AllProduct.this,list);
                        binding.recyclerView.setLayoutManager(new LinearLayoutManager(AllProduct.this));
                        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
                        binding.recyclerView.setAdapter(adapter);
                        adapter.notifyDataSetChanged();

                    }
                }
                if (response.code() == 404){
                    progressDoalog.dismiss();
                    Log.e("error",""+response);
                }
            }

            @Override
            public void onFailure(Call<ProductModel> call, Throwable t) {
                progressDoalog.dismiss();
                Log.e("onFailure",""+call.toString());

            }
        });


    }

    @Override
    public void onSuccess(ProductModel body) {

    }

    @Override
    public Context getContext() {
        return this;
    }
    //
//    @Override
//    public void onSingle(View view, int index) {
////        File outputFile = new File(Environment.getExternalStoragePublicDirectory
////                (Environment.DIRECTORY_DOWNLOADS), "http://www.africau.edu/images/default/sample.pdf");
////        Uri uri = Uri.fromFile(outputFile);
////
////        Intent share = new Intent();
////        share.setAction(Intent.ACTION_SEND);
////        share.setType("application/pdf");
////        share.putExtra(Intent.EXTRA_STREAM, uri);
////        share.setPackage("com.whatsapp");
////        startActivity(share);
//        Intent waIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
//        if (waIntent != null) {
//            waIntent.putExtra(
//                    Intent.EXTRA_TEXT,
//                    "http://www.africau.edu/images/default/sample.pdf");
//            startActivity(Intent.createChooser(waIntent, "Share with"));
//        } else
//            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
//                    .show();
//
//    }
}
