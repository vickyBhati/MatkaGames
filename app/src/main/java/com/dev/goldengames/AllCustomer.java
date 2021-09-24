package com.dev.goldengames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.databinding.AllCustomerBinding;

public class AllCustomer extends  BaseActivity implements Adapterjodi.OnItemClickListener {


    AllCustomerBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.all_customer);
        binding.mytool.title.setText("Bet History");
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onSingle(View view, int index) {
//        File outputFile = new File(Environment.getExternalStoragePublicDirectory
//                (Environment.DIRECTORY_DOWNLOADS), "http://www.africau.edu/images/default/sample.pdf");
//        Uri uri = Uri.fromFile(outputFile);
//
//        Intent share = new Intent();
//        share.setAction(Intent.ACTION_SEND);
//        share.setType("application/pdf");
//        share.putExtra(Intent.EXTRA_STREAM, uri);
//        share.setPackage("com.whatsapp");
//        startActivity(share);
        Intent waIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (waIntent != null) {
            waIntent.putExtra(
                    Intent.EXTRA_TEXT,
                    "http://www.africau.edu/images/default/sample.pdf");
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } else
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();

    }
}
