package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

public class News extends AppCompatActivity {
    TabLayout tabLayout1;
    ViewPager viewPager1;
    Context context;
    Resources resources;
    int lang_selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().setTitle("News");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout1=findViewById(R.id.news_tablayout);
        viewPager1=findViewById(R.id.new_viewpager);
        tabLayout1.setupWithViewPager(viewPager1);

        if (LocaleHelper.getLanguage(News.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(News.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=0;

            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new en_news_fragment(),"News");
            vpAdapter.addFragment(new video_fragment(),"Videos");
            viewPager1.setAdapter(vpAdapter);

        } else if (LocaleHelper.getLanguage(News.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(News.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=1;
            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new news_fragment(),"သတင်းများ");
            vpAdapter.addFragment(new video_fragment(),"ဗီဒီယိုများ");
            viewPager1.setAdapter(vpAdapter);

        }



    }
}