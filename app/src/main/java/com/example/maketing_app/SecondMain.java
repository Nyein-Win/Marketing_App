package com.example.maketing_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class SecondMain extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    Timer timer;
    Handler handler;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
       getSupportActionBar().setTitle("Sathapana Limited");
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigation);
        viewPager=findViewById(R.id.viewpager);
        circleIndicator=findViewById(R.id.circleIndicato);


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

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.menu_Open,R.string.close_menu);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){


                    case R.id.nav_about:
                        startActivity(new Intent(SecondMain.this,About_Sathapana.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_services:
                        startActivity(new Intent(SecondMain.this,Services.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_branch:
                        startActivity(new Intent(SecondMain.this,Branches.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_news:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_loan_calculator:
                        startActivity(new Intent(SecondMain.this,CalculatorLoan.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_human_resources:
                        startActivity(new Intent(SecondMain.this,Resource_Human.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_finance:
                        startActivity(new Intent(SecondMain.this,Financial.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_repayment:
                        startActivity(new Intent(SecondMain.this,Repayment_Method.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_register:
                        startActivity(new Intent(SecondMain.this,Register.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(SecondMain.this,Login.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
        findViewById(R.id.imageViewbtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,About_Sathapana.class));
            }
        });

        findViewById(R.id.imageViewbtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Services.class));
            }
        });
        findViewById(R.id.imageViewbtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Branches.class));
            }
        });
        findViewById(R.id.imageViewbtn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,News.class));
            }
        });
        findViewById(R.id.imageViewbtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Branches.class));

            }
        });
        findViewById(R.id.imageViewbtn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Financial.class));

            }
        });
        findViewById(R.id.imageViewbtn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,CalculatorLoan.class));

            }
        });
        findViewById(R.id.imageViewbtn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Resource_Human.class));

            }
        });
        findViewById(R.id.imageViewbtn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this,Repayment_Method.class));

            }
        });
    }

}