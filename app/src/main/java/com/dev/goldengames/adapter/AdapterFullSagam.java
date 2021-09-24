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
import com.dev.goldengames.databinding.LayoutAddFullSagamBinding;
import com.dev.goldengames.model.ModelFullSang;

import java.util.ArrayList;

public class AdapterFullSagam extends RecyclerView.Adapter<AdapterFullSagam.MyViewHolder>  {

    private ArrayList<ModelFullSang> visitors;
    Context context;
    private OnItemClickListener onItemClickListener;


    public AdapterFullSagam(Context applicationContext, OnItemClickListener onItemClickListener, ArrayList<ModelFullSang> myArrList) {
    this.context =applicationContext;
    this.onItemClickListener = onItemClickListener;
    this.visitors =myArrList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_add_full_sagam, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        LayoutAddFullSagamBinding binding=(LayoutAddFullSagamBinding)holder.getBinding();
        binding.txtPoint.setText(""+visitors.get(position).getNumber());
        binding.txtAmount.setText(""+visitors.get(position).getAmount());

        binding.txtRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.RemoveList(view, holder.getAdapterPosition(), visitors.get(holder.getAdapterPosition()));
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
        void RemoveList(View view, int index, ModelFullSang item);
//        void onClick(View v, int adapterPosition);

    }
}
