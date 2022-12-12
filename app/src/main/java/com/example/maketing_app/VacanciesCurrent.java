package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class VacanciesCurrent extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    Context context;
    Resources resources;
    int lang_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies_current);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.vc_txt1);
        txt2=findViewById(R.id.vc_txt2);
        txt3=findViewById(R.id.vc_txt3);
        txt4=findViewById(R.id.vc_txt4);
        txt5=findViewById(R.id.vc_txt5);
        txt6=findViewById(R.id.vc_txt6);
        txt7=findViewById(R.id.vc_txt7);

        if (LocaleHelper.getLanguage(VacanciesCurrent.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(VacanciesCurrent.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text2));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(VacanciesCurrent.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(VacanciesCurrent.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text2));
            lang_selected=1;
            setString();

        }


        CardView specialcard=(CardView) findViewById(R.id.specialcard);
        specialcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });


        CardView loanoffcard=(CardView) findViewById(R.id.loanoffcard);
        loanoffcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });

        CardView chiefcard=(CardView) findViewById(R.id.chiefcard);
        chiefcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });


        CardView deputycard=(CardView) findViewById(R.id.deputycard);
        deputycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });
        CardView cashiercard=(CardView) findViewById(R.id.cashcard);
        cashiercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });

        CardView tellercard=(CardView) findViewById(R.id.tellercard);
        tellercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });
        CardView assistantcard=(CardView) findViewById(R.id.assistandcard);
        assistantcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(VacanciesCurrent.this);
            }
        });

    }

    private void setString() {
        txt1.setText(resources.getString(R.string.specialize_LO));
        txt2.setText(resources.getString(R.string.L_Office));
        txt3.setText(resources.getString(R.string.CLO));
        txt4.setText(resources.getString(R.string.DCLO));
        txt5.setText(resources.getString(R.string.cashier));
        txt6.setText(resources.getString(R.string.teller));
        txt7.setText(resources.getString(R.string.AA));
    }
}