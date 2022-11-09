package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class SliderImage extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    Timer timer;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_image);

        viewPager=findViewById(R.id.viewpage);
        circleIndicator=findViewById(R.id.circleIndicator);

        List<Integer> imagelist=new ArrayList<>();
        imagelist.add(R.drawable.a22);
        imagelist.add(R.drawable.con22);
        imagelist.add(R.drawable.social22);
        imagelist.add(R.drawable.small22);
        imagelist.add(R.drawable.sav22);

        MyAdapter myAdapter=new MyAdapter(imagelist);
        viewPager.setAdapter(myAdapter);
        circleIndicator.setViewPager(viewPager);

        handler=new Handler();
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        int i=viewPager.getCurrentItem();

                        if(i==imagelist.size()-1){
                            i=0;
                            viewPager.setCurrentItem(i,true);
                        }else {
                            i++;
                            viewPager.setCurrentItem(i,true);
                        }
                    }
                });
            }
        },4000,4000);


    }
}