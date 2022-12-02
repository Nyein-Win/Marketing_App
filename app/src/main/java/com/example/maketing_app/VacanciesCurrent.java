package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class VacanciesCurrent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies_current);
        getSupportActionBar().setTitle("Current Vacancies");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


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

//      @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick1=findViewById(R.id.specialcard);
//      arrowclick1.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//              startActivity(intent);
//          }
//      });
//
//
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick2=findViewById(R.id.loanoffcard);
//        arrowclick2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick3=findViewById(R.id.chiefcard);
//        arrowclick3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick4=findViewById(R.id.deputycard);
//        arrowclick4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick5=findViewById(R.id.cashcard);
//        arrowclick5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick6=findViewById(R.id.tellercard);
//        arrowclick6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick7=findViewById(R.id.assistandcard);
//        arrowclick7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
//                startActivity(intent);
//            }
//        });
    }
}