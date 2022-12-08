package com.example.maketing_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
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
    Spinner spinner;
    Context context;
    Resources resources;
    TextView about;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu, menu);
        MenuItem item = menu.findItem(R.id.spinner);
        spinner = (Spinner) item.getActionView();
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

             if(spinner.getSelectedItem().toString().equals("English")){
                    LocaleHelper.getLanguage(SecondMain.this).equalsIgnoreCase("en");
                    context = LocaleHelper.setLocale(SecondMain.this, "en");
                    resources = context.getResources();
                    setTitle(resources.getString(R.string.app_name));
                    setString();
                 Toast.makeText(SecondMain.this,"Nyein Win",Toast.LENGTH_SHORT).show();
        }else  if(spinner.getSelectedItem().toString().equals("မြန်မာ")){
                 LocaleHelper.getLanguage(SecondMain.this).equalsIgnoreCase("my");
                 context = LocaleHelper.setLocale(SecondMain.this, "my");
                 resources = context.getResources();
                 setTitle(resources.getString(R.string.app_name));
            setTitle(resources.getString(R.string.app_name));
            setString();
        }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return true;
    }

    private void setString() {
        Toast.makeText(SecondMain.this,"ငြိမ်းဝင်း",Toast.LENGTH_SHORT).show();
        about.setText(resources.getString(R.string.about_sathapana));
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigation);
        viewPager=findViewById(R.id.viewpager);
        about=findViewById(R.id.about);


        List<Integer> imagelist = new ArrayList<>();
        imagelist.add(R.drawable.a22);
        imagelist.add(R.drawable.con22);
        imagelist.add(R.drawable.social22);
        imagelist.add(R.drawable.small22);
        imagelist.add(R.drawable.sav22);


        MyAdapter myAdapter = new MyAdapter(imagelist);
        viewPager.setAdapter(myAdapter);
//        circleIndicator.setViewPager(viewPager);

        handler = new Handler();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        int i = viewPager.getCurrentItem();

                        if (i == imagelist.size() - 1) {
                            i = 0;
                            viewPager.setCurrentItem(i, true);
                        } else {
                            i++;
                            viewPager.setCurrentItem(i, true);
                        }
                    }
                });
            }
        }, 4000, 4000);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_Open, R.string.close_menu);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.nav_about:
                        startActivity(new Intent(SecondMain.this, About_Sathapana.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_services:
                        startActivity(new Intent(SecondMain.this, Services.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_branch:
                        startActivity(new Intent(SecondMain.this, Branches.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_news:
                        startActivity(new Intent(SecondMain.this, News.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_loan_calculator:
                        startActivity(new Intent(SecondMain.this, CalculatorLoan.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_human_resources:
                        startActivity(new Intent(SecondMain.this, Resource_Human.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_finance:
                        startActivity(new Intent(SecondMain.this, Financial.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_repayment:
                        startActivity(new Intent(SecondMain.this, Repayment_Method.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_register:
                        startActivity(new Intent(SecondMain.this, Register.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(SecondMain.this, Login.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                }
                return true;
            }

        });
        findViewById(R.id.imageViewbtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, About_Sathapana.class));
                Animatoo.animateSwipeRight(SecondMain.this);
            }
        });

        findViewById(R.id.imageViewbtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Services.class));
                Animatoo.animateSwipeRight(SecondMain.this);
            }
        });
        findViewById(R.id.imageViewbtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Branches.class));
                Animatoo.animateSwipeRight(SecondMain.this);
            }
        });
        findViewById(R.id.imageViewbtn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, News.class));
                Animatoo.animateSwipeRight(SecondMain.this);
            }
        });
        findViewById(R.id.imageViewbtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Branches.class));
                Animatoo.animateSwipeRight(SecondMain.this);

            }
        });
        findViewById(R.id.imageViewbtn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Financial.class));
                Animatoo.animateSwipeRight(SecondMain.this);

            }
        });
        findViewById(R.id.imageViewbtn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, CalculatorLoan.class));
                Animatoo.animateSwipeRight(SecondMain.this);

            }
        });
        findViewById(R.id.imageViewbtn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Resource_Human.class));
                Animatoo.animateSwipeRight(SecondMain.this);

            }
        });
        findViewById(R.id.imageViewbtn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondMain.this, Repayment_Method.class));
                Animatoo.animateSwipeRight(SecondMain.this);

            }
        });

    }

}