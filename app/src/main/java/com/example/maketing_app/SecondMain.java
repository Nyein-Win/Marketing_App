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

//    TextView helloworld,dialog_language;
//    int lang_selected;
//    RelativeLayout show_lan_dialog;
//
//    Context context;
//    Resources resources;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main_menu,menu);
//        MenuItem item= menu.findItem(R.id.hey);
//        item.setActionView(R.layout.language);
//        final RelativeLayout click=(RelativeLayout)menu.findItem(R.id.hey).getActionView().findViewById(R.id.)
//
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu, menu);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) item.getActionView();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        return true;
    }



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
       getSupportActionBar().setTitle("Sathapana Limited");
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigation);
        viewPager=findViewById(R.id.viewpager);

//        dialog_language=(TextView) findViewById(R.id.dialog_langu);
//        show_lan_dialog=(RelativeLayout) findViewById(R.id.showlangdialog);
//
//        if(LocaleHelper.getLanguage(SecondMain.this).equalsIgnoreCase("en")){
//            context=LocaleHelper.setLocale(SecondMain.this,"en");
//            resources=context.getResources();
//            lang_selected=0;
//            dialog_language.setText("English");
//            //helloworld.setText(resources.getString(R.string.hello_world));
//            setTitle(resources.getString(R.string.app_name));
//
//
//
//        }else if(LocaleHelper.getLanguage(SecondMain.this).equalsIgnoreCase("my")){
//            context=LocaleHelper.setLocale(SecondMain.this,"my");
//            resources=context.getResources();
//            lang_selected=1;
//            dialog_language.setText("မြန်မာ");
//            //helloworld.setText(resources.getString(R.string.hello_world));
//            setTitle(resources.getString(R.string.app_name));
//        }
//        show_lan_dialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String[] Language={"English","မြန်မာ"};
//                final AlertDialog.Builder builder=new AlertDialog.Builder(SecondMain.this);
//                builder.setTitle("Select a Language").setSingleChoiceItems(Language, lang_selected, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                                dialog_language.setText(Language[i]);
//                                if(Language[i].equals("English")){
//                                    context=LocaleHelper.setLocale(SecondMain.this,"en");
//                                    resources=context.getResources();
//                                    lang_selected=0;
//                                    //helloworld.setText(resources.getString(R.string.hello_world));
//                                    setTitle(resources.getString(R.string.app_name));
//                                    //setString();
//
//                                }
//                                if(Language[i].equals("မြန်မာ")){
//                                    context=LocaleHelper.setLocale(SecondMain.this,"my");
//                                    resources=context.getResources();
//                                    lang_selected=1;
//                                    //helloworld.setText(resources.getString(R.string.hello_world));
//                                    setTitle(resources.getString(R.string.app_name));
//                                    //setString();
//
//                                }
//
//                            }
//                        })
//                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                dialogInterface.dismiss();
//                            }
//                        });
//                builder.create().show();
//            }
//        });


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

//            public boolean onCreateOptionsMenu(Menu menu) {
//                getMenuInflater().inflate(R.menu.main_menu, menu);
//
//                MenuItem item = menu.findItem(R.id.lan);
//                Spinner spinner = (Spinner) item.getActionView();
//
//                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                        R.array.Language, android.R.layout.simple_spinner_item);
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//                spinner.setAdapter(adapter);
//                return true;
//            }

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