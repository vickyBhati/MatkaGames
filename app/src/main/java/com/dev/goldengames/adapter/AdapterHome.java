package com.dev.goldengames.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.BookActivity;
import com.dev.goldengames.R;
import com.dev.goldengames.databinding.LayoutHomeBinding;
import com.dev.goldengames.databinding.LayoutProductBinding;
import com.dev.goldengames.model.ModelAdd;
import com.dev.goldengames.model.ModelDashboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.MyViewHolder>  {

    Context context;
    ArrayList<ModelDashboard.DataBean> list2;
    private int lastPosition = -1;

    public AdapterHome(Context applicationContext, ArrayList<ModelDashboard.DataBean> list_all) {
    this.context =applicationContext;
    this.list2=list_all;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_home, parent, false);
        return new MyViewHolder(binding);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final LayoutHomeBinding binding=(LayoutHomeBinding)holder.getBinding();
//        Animation shake = AnimationUtils.loadAnimation(context, R.anim.shake);
//        binding.ll.setAnimation(shake);

        String nickname = list2.get(position).getOpen_end_time().substring(0, list2.get(position).getOpen_end_time().indexOf(' '));
        String content = list2.get(position).getOpen_end_time().substring(list2.get(position).getOpen_end_time().indexOf(' ') + 1);
        Log.e("first",nickname);
        Log.e("second",content);
//        binding.openTime.setText("Open :"+content);

        binding.openPanna.setText(list2.get(position).getOpen_panna()+"-");
        binding.closePanna.setText(list2.get(position).getClose_panna());
        binding.resultOne.setText(list2.get(position).getOpen_result_value());
        binding.resultTwo.setText(list2.get(position).getClose_result_value()+"-");

        StringTokenizer tokens2 = new StringTokenizer(list2.get(position).getClose_end_time(), " ");
        String first2 = tokens2.nextToken();// this will contain "Fruit"
        final String second2 = tokens2.nextToken();
        String nickname1 = list2.get(position).getClose_end_time().substring(0, list2.get(position).getClose_end_time().indexOf(' '));
        String content1 = list2.get(position).getClose_end_time().substring(list2.get(position).getClose_end_time().indexOf(' ') + 1);
//        binding.closeTime.setText("Close :"+content1);
        binding.betNma.setText(list2.get(position).getMarket_name());

        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss", Locale.US);
        Date new_date;
        long t = 0L;
        SimpleDateFormat f = new SimpleDateFormat("hh:mm aa", Locale.US);
        Calendar calendar = Calendar.getInstance();
        try {
            new_date = df.parse(content1);
            t = new_date.getTime();
            calendar.setTimeInMillis(t);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String s = f.format(calendar.getTime());
        binding.closeTime.setText("Close :"+s);
        openTim(binding.openTime,content);
//
        try {
            if (list2.get(position).getStatus().equalsIgnoreCase("A")) {
                binding.status.setText("Market is Open for today");
                binding.status.setTextColor(context.getColor(R.color.green_));
            } else {
                binding.status.setText("Market is Close for today");
                binding.status.setTextColor(context.getColor(R.color.text_color_red));
            }
        }catch (NullPointerException e){
            e.printStackTrace();
            binding.status.setText("Market is Open for today");
            binding.status.setTextColor(context.getColor(R.color.green_));
        }

//        binding.openPanna.setText(list2.get(position).getOpen_panna()+"-");
//        binding.closePanna.setText(list2.get(position).getClose_panna());
//        binding.resultOne.setText(list2.get(position).getOpen_result_value());
//        binding.resultTwo.setText(list2.get(position).getClose_result_value()+"-");


        binding.ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, BookActivity.class);
                i.putExtra("id",""+list2.get(position).getMarket_id());
                i.putExtra("name",""+list2.get(position).getMarket_name());
                i.putExtra("open_end_time",""+list2.get(position).getO_end_time());
                i.putExtra("close_end_time",""+list2.get(position).getC_end_time());
//                i.putExtra("type",""+list.get(position).getType());
                context.startActivity(i);
            }
        });
    }

    private void openTim(TextView openTime, String content) {
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss", Locale.US);
        Date new_date;
        long t = 0L;
        SimpleDateFormat f = new SimpleDateFormat("hh:mm aa", Locale.US);
        Calendar calendar = Calendar.getInstance();
        try {
            new_date = df.parse(content);
            t = new_date.getTime();
            calendar.setTimeInMillis(t);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String s = f.format(calendar.getTime());
        Log.e("ttt",""+s);
        openTime.setText("Open :"+s);

    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.shake);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
        else {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.shake);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;

        }
    }
    @Override
    public int getItemCount() {
        return list2.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ViewDataBinding binding;

        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.binding.executePendingBindings();
        }
        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    public  interface  DeleteInter{
        void  del(ImageView delete, int position, ModelAdd modelAdd);
    }
}
