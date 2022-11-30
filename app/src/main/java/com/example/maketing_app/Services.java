package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.material.tabs.TabLayout;

public class Services extends AppCompatActivity {
  private TabLayout tabLayout;
  private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_services);
        getSupportActionBar().setTitle("Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager1);
        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new loan_type(),"ချေးငွေ");
        vpAdapter.addFragment(new saving(),"စုဆောင်းငွေ");
        vpAdapter.addFragment(new socialwelfare(),"လှုမှုဖူလုံရေး");
        viewPager.setAdapter(vpAdapter);
//        tabLayout.getTabAt(0).setIcon(R.drawable.financial);
//        tabLayout.getTabAt(1).setIcon(R.drawable.saving);
//        tabLayout.getTabAt(2).setIcon(R.drawable.social_welfare);

    }
    }
