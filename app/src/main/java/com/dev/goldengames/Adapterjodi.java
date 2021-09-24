package com.dev.goldengames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;


import com.dev.goldengames.databinding.LayoutJodiBinding;

import java.util.ArrayList;

public class Adapterjodi extends RecyclerView.Adapter<Adapterjodi.MyViewHolder>  {

    private ArrayList<String> visitors;
    Context context;
    private OnItemClickListener onItemClickListener;


    public Adapterjodi(Context applicationContext,OnItemClickListener onItemClickListener) {
    this.context =applicationContext;
//    this.visitors = visitors;
    this.onItemClickListener = onItemClickListener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_jodi, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        LayoutJodiBinding binding=(LayoutJodiBinding)holder.getBinding();
        binding.ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onSingle(view, holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
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

        void onSingle(View view, int adapterPosition);
//        void onClick(View v, int adapterPosition);

    }
}
