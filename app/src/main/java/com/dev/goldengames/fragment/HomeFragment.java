package com.dev.goldengames.fragment;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.goldengames.MainActivity;
import com.dev.goldengames.R;
import com.dev.goldengames.adapter.AdapterHome;
import com.dev.goldengames.adapter.SliderAdapter;
import com.dev.goldengames.databinding.FragmentHomeBinding;
import com.dev.goldengames.model.ModelDashboard;
import com.smarteist.autoimageslider.SliderView;

import org.json.JSONArray;

import java.net.URLEncoder;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    ArrayList<ModelDashboard.DataBean> list_all;
    String num,paisa;
    JSONArray jsonArray1;

    public HomeFragment(ArrayList<ModelDashboard.DataBean> list, String contactNo, JSONArray jsonArray, String amount) {
        this.list_all=list;
        this.num= contactNo;
        this.jsonArray1= jsonArray;
        this.paisa= amount;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();

        binding.num.setText(num);

        binding.txtWidthdrw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (MainActivity.binding.txtWallet.getText().toString().equalsIgnoreCase("0")){
                    Toast.makeText(getActivity(), "minimum withdraw amount is 500 rs", Toast.LENGTH_SHORT).show();
                }
                else {
                    int number = Integer.parseInt(MainActivity.binding.txtWallet.getText().toString());
                    if (number < 500) {
                        Toast.makeText(getActivity(), "minimum withdraw amount is 500 rs", Toast.LENGTH_SHORT).show();
                    } else {
                        try {
                            PackageManager packageManager = getActivity().getPackageManager();
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            String url = "https://api.whatsapp.com/send?phone="+ "+91 "+binding.num.getText().toString() +"&text=" + URLEncoder.encode("I want to Withdraw", "UTF-8");
                            i.setPackage("com.whatsapp");
                            i.setData(Uri.parse(url));
                            if (i.resolveActivity(packageManager) != null) {
                                startActivity(i);
                            }
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        binding.txtAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    PackageManager packageManager = getActivity().getPackageManager();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    String url = "https://api.whatsapp.com/send?phone="+ "+91 "+binding.num.getText().toString() +"&text=" + URLEncoder.encode("I want to deposit", "UTF-8");
                    i.setPackage("com.whatsapp");
                    i.setData(Uri.parse(url));
                    if (i.resolveActivity(packageManager) != null) {
                        startActivity(i);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        binding.num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    PackageManager packageManager = getActivity().getPackageManager();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    String url = "https://api.whatsapp.com/send?phone="+ "+91 "+num +"&text=" + URLEncoder.encode("", "UTF-8");
                    i.setPackage("com.whatsapp");
                    i.setData(Uri.parse(url));
                    if (i.resolveActivity(packageManager) != null) {
                        startActivity(i);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        AdapterHome adapter = new AdapterHome(getActivity(),list_all);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        binding.recyclerView.setLayoutManager(mLayoutManager);
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
//
//        binding.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
//                int lastPosition = layoutManager.findLastCompletelyVisibleItemPosition();
//                int firstPosition = layoutManager.findFirstCompletelyVisibleItemPosition();
//                for (int i = firstPosition; i <= lastPosition; i++) {
//                    if (dy < 0) {
//                        AnimationUtils.animate(recyclerView.findViewHolderForAdapterPosition(i), true);
//                    } else {
//                        AnimationUtils.animate(recyclerView.findViewHolderForAdapterPosition(i), true);
//                    }
//                }
//            }
//        });
//        binding.recyclerView.setNestedScrollingEnabled(false);
//        binding.recyclerView.scheduleLayoutAnimation();


        SliderAdapter adapter1 = new SliderAdapter(getActivity(), jsonArray1);
        binding.slider.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        binding.slider.setSliderAdapter(adapter1);
        binding.slider.setScrollTimeInSec(3);
        binding.slider.setAutoCycle(true);

        // to start autocycle below method is used.
        binding.slider.startAutoCycle();

        return view;
    }

    public static class AnimationUtils {
        public static void animate(RecyclerView.ViewHolder viewHolder, boolean isGoDown){
            ObjectAnimator translateY = ObjectAnimator.ofFloat(viewHolder.itemView, "translationY", isGoDown == true ? 300 : -300, 0);
            translateY.setDuration(300);
            translateY.setInterpolator(new DecelerateInterpolator(2f));
            translateY.start();
        }
    }
}