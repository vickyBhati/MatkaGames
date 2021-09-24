package com.dev.goldengames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.R;
import com.dev.goldengames.databinding.LayoutBetHistoryBinding;
import com.dev.goldengames.model.ModelBetHistory;

import java.util.ArrayList;

public class Adapterbethistory extends RecyclerView.Adapter<Adapterbethistory.MyViewHolder>  {

    Context context;
    ArrayList<ModelBetHistory.DataBean> list= new ArrayList<ModelBetHistory.DataBean>();

//    private OnItemClickListener onItemClickListener;
//ArrayList<ModelBetHistory.DataBean> list= new ArrayList<ModelBetHistory.DataBean>();


    public Adapterbethistory(Context context,ArrayList<ModelBetHistory.DataBean> list) {
    this.context =context;
    this.list = list;
//    this.onItemClickListener = onItemClickListener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_bet_history, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        LayoutBetHistoryBinding binding=(LayoutBetHistoryBinding)holder.getBinding();
//        StringTokenizer tokens = new StringTokenizer(list.get(position).getCreated_at(), " ");
//        String first = tokens.nextToken();// this will contain "Fruit"
//        final String second = tokens.nextToken();
//
//        binding.date.setText(list.get(position).getCreated_at());
//        binding.type.setText(list.get(position).getPatti_type());
//        binding.name.setText(list.get(position).getMarket().getName());
//        binding.oc.setText(list.get(position).getBet_type());
//        binding.count.setText(""+list.get(position).getSelected_number());
//        binding.price.setText(""+list.get(position).getValue_on_number());
//        binding.txtPoint.setText(""+visitors.get(position).getAmount());
//        binding.txtAmount.setText(""+visitors.get(position).getValue());
//
        binding.date.setText(list.get(position).getCreated_at());
        binding.type.setText(list.get(position).getPatti_type());
        binding.name.setText(list.get(position).getMarket().getName());
//        binding.oc.setText(list.get(position).getBet_type());
        binding.count.setText(""+list.get(position).getSelected_number());
        binding.price.setText(""+list.get(position).getValue_on_number());
        if (!list.get(position).getBet_type().equals("Jodi")){
            binding.oc.setText(list.get(position).getBet_type());
        }
//        binding.txtRemove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onItemClickListener.RemoveList(view, holder.getAdapterPosition(), visitors.get(holder.getAdapterPosition()));
//            }
//        });
//        Glide.with(context).load(listdata)
//                .apply(new RequestOptions().placeholder(R.drawable.dummy))
//                .into(binding.ivLogo);
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
    public interface OnItemClickListener {
//        void RemoveList(View view, int index, Candy item);
//        void onClick(View v, int adapterPosition);

    }
}
