package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class Services extends AppCompatActivity {
  private TabLayout tabLayout;
  private ViewPager viewPager;
    Context context;
    Resources resources;
    int lang_selected;
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_services);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager1);
        tabLayout.setupWithViewPager(viewPager);


        if (LocaleHelper.getLanguage(Services.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Services.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=0;

            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new en_loan_type(),"Loan Type");
            vpAdapter.addFragment(new en_saving_fragment(),"Saving");
            vpAdapter.addFragment(new en_socail_fragment(),"Social_Welfare");
            viewPager.setAdapter(vpAdapter);

        } else if (LocaleHelper.getLanguage(Services.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Services.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.services));
            lang_selected=1;
            VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new loan_type(),"ချေးငွေ");
            vpAdapter.addFragment(new saving(),"စုဆောင်းငွေ");
            vpAdapter.addFragment(new socialwelfare(),"လှုမှုဖူလုံရေး");
            viewPager.setAdapter(vpAdapter);

        }
//        tabLayout.getTabAt(0).setIcon(R.drawable.financial);
//        tabLayout.getTabAt(1).setIcon(R.drawable.saving);
//        tabLayout.getTabAt(2).setIcon(R.drawable.social_welfare);

    }

}
