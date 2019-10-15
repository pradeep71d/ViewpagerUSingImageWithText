package com.example.viewpagerwithtextimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {
    Context context;
    String[] rank;
    String[] country;
    int[] flag;
    public Adapter(Context context, String[] rank, String[] country, int[] flag) {
        this.context = context;
        this.rank = rank;
        this.country = country;
        this.flag = flag;
    }
    @Override
    public int getCount() {
        return rank.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView txtrank;
        TextView txtcountry;
        ImageView imgflag;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.viewpager_item, container, false);
        txtrank = view.findViewById(R.id.t1);
        txtcountry = view.findViewById(R.id.t2);
        txtrank.setText(rank[position]);
        txtcountry.setText(country[position]);
        imgflag = view.findViewById(R.id.im);
        imgflag.setImageResource(flag[position]);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
