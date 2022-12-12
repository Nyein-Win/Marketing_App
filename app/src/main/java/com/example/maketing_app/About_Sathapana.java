package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class About_Sathapana extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    Context context;
    Resources resources;
    int lang_selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_sathapana);
        getSupportActionBar().setTitle("About Sathapana");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout=findViewById(R.id.about_tablayout);
        viewPager=findViewById(R.id.about_viewpager);
        tabLayout.setupWithViewPager(viewPager);



        if (LocaleHelper.getLanguage(About_Sathapana.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(About_Sathapana.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=0;

            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new en_about_sathapana_fragment(),"About Sathapana");
            vpAdapter.addFragment(new award_fragment(),"Awards");
            viewPager.setAdapter(vpAdapter);

        } else if (LocaleHelper.getLanguage(About_Sathapana.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(About_Sathapana.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=1;
            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new about_sathapan_fragment(),"စထာပါနာ အကြောင်း");
            vpAdapter.addFragment(new my_award_fragment(),"ဆုများ");
            viewPager.setAdapter(vpAdapter);

        }
    }
}