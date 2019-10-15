package com.example.viewpagerwithtextimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    String[] rank;
    String[] country;
    int[] flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.view1);
        rank=new String[] {"1", "2", "3", "4", "5"};
        country=new String[] {"India", "Canada", "United States","Indonesia", "Japan"};
        flag =new int  [] {R.drawable.ee, R.drawable.qq, R.drawable.rr, R.drawable.tt, R.drawable.ww};
        Adapter adapter=new Adapter(MainActivity.this,rank,country,flag);
        viewPager.setAdapter(adapter);

    }
}
