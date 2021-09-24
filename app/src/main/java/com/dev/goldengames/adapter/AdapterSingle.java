package com.dev.goldengames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.R;
import com.dev.goldengames.databinding.LayoutSingleBinding;
import com.dev.goldengames.model.Modelgame;

import java.util.ArrayList;

public class AdapterSingle extends RecyclerView.Adapter<AdapterSingle.MyViewHolder>  {

    private ArrayList<Modelgame.ValueBean.SingleBean> visitors;
    Context context;
    private OnItemClickListener onItemClickListener;


    public AdapterSingle(Context applicationContext, ArrayList<Modelgame.ValueBean.SingleBean> modelVisitors, OnItemClickListener onItemClickListener) {
    this.context =applicationContext;
    this.visitors = modelVisitors;
    this.onItemClickListener = onItemClickListener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_single, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        LayoutSingleBinding binding=(LayoutSingleBinding)holder.getBinding();
        binding.txtVisitorName.setText(""+visitors.get(position).getName());
        binding.txtVisitorName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onSingle(view, holder.getAdapterPosition(), visitors.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return visitors.size();
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
    public interface OnItemClickListener {
        void onSingle(View view, int index, Modelgame.ValueBean.SingleBean item);
//        void onClick(View v, int adapterPosition);

    }
}
