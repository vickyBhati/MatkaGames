package com.dev.goldengames.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.R;
import com.dev.goldengames.databinding.LayoutStatmentBinding;
import com.dev.goldengames.model.ModelAdd;
import com.dev.goldengames.model.TrasnscationModel;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WingStatment extends RecyclerView.Adapter<WingStatment.MyViewHolder>  {

    Context context;
    ArrayList<TrasnscationModel.DataBean> list= new ArrayList<TrasnscationModel.DataBean>();
    ArrayList<TrasnscationModel.DataBean> two= new ArrayList<TrasnscationModel.DataBean>();

    public WingStatment(Context applicationContext, ArrayList<TrasnscationModel.DataBean> list1) {
    this.context =applicationContext;
        this.list = list1;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_statment, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final LayoutStatmentBinding binding=(LayoutStatmentBinding)holder.getBinding();

        if (list.get(position).getTransaction_type().equalsIgnoreCase("Winning")){
            for (int i=0;  i<list.size(); i++){

            }
        }
        if (list.get(position).getTransaction_type().equalsIgnoreCase("Winning")){
            Log.e("if","if");
            Log.e("else","else");
            StringTokenizer tokens = new StringTokenizer(list.get(position).getCreated_at(), " ");
            String first = tokens.nextToken();// this will contain "Fruit"
            final String second = tokens.nextToken();
            binding.date.setText(first);
            binding.message.setText(""+list.get(position).getMessage());
            binding.type.setText(""+list.get(position).getTransaction_type());
            binding.price.setText("₹"+list.get(position).getAmount());
            binding.date.setText(""+list.get(position).getCreated_at());
        }
        else {


        }
    }

    @Override
    public int getItemCount() {
        return list.size();
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
