package com.dev.goldengames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dev.goldengames.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import org.json.JSONArray;
import org.json.JSONException;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {

    // list for storing urls of images.
    private JSONArray listdata;
    private Context context;

    // Constructor
    public SliderAdapter(Context context, JSONArray sliderDataArrayList) {
        this.listdata = sliderDataArrayList;
        this.context=context;
    }

    // We are inflating the slider_layout
    // inside on Create View Holder method.
    @Override
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_two_pro, null);
        return new SliderAdapterViewHolder(inflate);
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    @Override
    public void onBindViewHolder(SliderAdapterViewHolder viewHolder, final int position) {

        // Glide is use to load image
        // from url in your imageview.

        try {
            Glide.with(context).load(listdata.get(position))
                    .apply(new RequestOptions().placeholder(R.drawable.logo))
                    .into(viewHolder.imageViewBackground);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    // this method will return
    // the count of our list.
    @Override
    public int getCount() {
        return listdata.length();
    }

    static class SliderAdapterViewHolder extends SliderViewAdapter.ViewHolder {
        // Adapter class for initializing
        // the views of our slider view.
        View itemView;
        ImageView imageViewBackground;

        public SliderAdapterViewHolder(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.ivLogo);
            this.itemView = itemView;
        }
    }
}
