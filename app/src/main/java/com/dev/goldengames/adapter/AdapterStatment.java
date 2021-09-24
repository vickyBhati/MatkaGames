package com.dev.goldengames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.R;
import com.dev.goldengames.databinding.LayoutHomeBinding;
import com.dev.goldengames.databinding.LayoutStatmentBinding;
import com.dev.goldengames.model.ModelAdd;
import com.dev.goldengames.model.TrasnscationModel;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class AdapterStatment extends RecyclerView.Adapter<AdapterStatment.MyViewHolder>  {

    Context context;
    ArrayList<TrasnscationModel.DataBean> list= new ArrayList<TrasnscationModel.DataBean>();

    public AdapterStatment(Context applicationContext,ArrayList<TrasnscationModel.DataBean> list1) {
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
        StringTokenizer tokens = new StringTokenizer(list.get(position).getCreated_at(), " ");
        String first = tokens.nextToken();// this will contain "Fruit"
        final String second = tokens.nextToken();

        binding.date.setText(first);
        binding.message.setText(""+list.get(position).getMessage());
        binding.type.setText(""+list.get(position).getTransaction_type());
        binding.price.setText("₹"+list.get(position).getAmount());
        binding.date.setText(""+list.get(position).getCreated_at());
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
