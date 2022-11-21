package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

public class News extends AppCompatActivity {
    TabLayout tabLayout1;
    ViewPager viewPager1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().setTitle("News");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout1=findViewById(R.id.news_tablayout);
        viewPager1=findViewById(R.id.new_viewpager);
        tabLayout1.setupWithViewPager(viewPager1);
        VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new news_fragment(),"News");
        vpAdapter.addFragment(new video_fragment(),"Videos");
        viewPager1.setAdapter(vpAdapter);

//        tabLayout1.getTabAt(2).setIcon(R.drawable.social_welfare);



    }
}