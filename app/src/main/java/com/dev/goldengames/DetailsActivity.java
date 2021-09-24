package com.dev.goldengames;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dev.goldengames.databinding.ActivityDetailsBinding;
import com.dev.goldengames.databinding.ActivityLoginBinding;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity implements Adapterjodi.OnItemClickListener {

    ActivityDetailsBinding binding;
    Dialog dialogBuilder,dilogSingle;
    private ArrayList<String> visitors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_details);
        binding.mytool.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.mytool.title.setText("Details");


//        Adapterjodi adapter = new Adapterjodi(DetailsActivity.this, this,visitors);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DetailsActivity.this);
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(DetailsActivity.this));
//        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
//        binding.recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();

    }

    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.rrService:
//                dilogSingle= new Dialog(DetailsActivity.this);
//                dilogSingle.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                final View single = LayoutInflater.from(DetailsActivity.this).inflate(R.layout.popup_single, null);
//                dilogSingle.setContentView(single);
//                RecyclerView ok = (RecyclerView) single.findViewById(R.id.recyclerView);
//                Adapterjodi adapter = new Adapterjodi(DetailsActivity.this, this,visitors);
//                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DetailsActivity.this);
//                ok.setLayoutManager(new LinearLayoutManager(DetailsActivity.this));
//                ok.setItemAnimator(new DefaultItemAnimator());
//                ok.setAdapter(adapter);
//                adapter.notifyDataSetChanged();
//                dilogSingle.show();
//                break;
        }
    }

    @Override
    public void onSingle(View view, int index) {
//        binding.txtService.setText(""+item);
//        dilogSingle.dismiss();
    }
}
