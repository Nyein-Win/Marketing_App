package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class About_Sathapana extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_sathapana);
        getSupportActionBar().setTitle("About Sathapana");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout=findViewById(R.id.about_tablayout);
        viewPager=findViewById(R.id.about_viewpager);
        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new about_sathapan_fragment(),"About Sathapana");
        vpAdapter.addFragment(new award_fragment(),"Awards");
        viewPager.setAdapter(vpAdapter);
    }
}