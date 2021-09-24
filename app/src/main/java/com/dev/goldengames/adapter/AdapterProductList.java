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
import com.dev.goldengames.databinding.LayoutItemBinding;
import com.dev.goldengames.databinding.LayoutProductBinding;
import com.dev.goldengames.model.ModelAdd;
import com.dev.goldengames.model.ProductModel;

import java.util.ArrayList;

public class AdapterProductList extends RecyclerView.Adapter<AdapterProductList.MyViewHolder>  {

    Context context;
    ArrayList<ProductModel.DataBean.ItemsBean> arrayList;

    public AdapterProductList(Context applicationContext, ArrayList<ProductModel.DataBean.ItemsBean> list) {
    this.context =applicationContext;
    this.arrayList=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_product, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final LayoutProductBinding binding=(LayoutProductBinding)holder.getBinding();
        binding.txtPoint.setText(arrayList.get(position).getName());
        binding.txtUnit.setText(""+arrayList.get(position).getProduct_list_price());
        binding.type.setText(""+arrayList.get(position).getProduct_total_price());
        binding.txtAmount.setText(""+arrayList.get(position).getProduct_qty());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
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
