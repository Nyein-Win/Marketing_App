package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VacanciesCurrent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies_current);
        getSupportActionBar().setTitle("Current Vacancies");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick1=findViewById(R.id.arrowclick1);
      arrowclick1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
              startActivity(intent);
          }
      });



        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick2=findViewById(R.id.arrowclick2);
        arrowclick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick3=findViewById(R.id.arrowclick3);
        arrowclick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick4=findViewById(R.id.arrowclick4);
        arrowclick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick5=findViewById(R.id.arrowclick5);
        arrowclick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick6=findViewById(R.id.arrowclick6);
        arrowclick6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView arrowclick7=findViewById(R.id.arrowclick7);
        arrowclick7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VacanciesCurrent.this,Loan_Officer.class);
                startActivity(intent);
            }
        });
    }
}