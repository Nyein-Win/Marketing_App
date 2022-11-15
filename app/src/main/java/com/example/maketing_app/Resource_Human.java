package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resource_Human extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_human);
        getSupportActionBar().setTitle("Human Resources");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView currency=findViewById(R.id.currency);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView recrupolicy=findViewById(R.id.recrupolicy);

        recrupolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,RecruitmentPolicity.class);
                startActivity(intent);
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,VacanciesCurrent.class);
                startActivity(intent);
            }
        });
        CardView selection=findViewById(R.id.selection);
        selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Selection_Process.class);
                startActivity(intent);
            }
        });
        CardView learning=findViewById(R.id.learning);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Learning_Development.class);
                startActivity(intent);
            }
        });

        CardView benifit=findViewById(R.id.benifit);
        benifit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Compensate_Benefits.class);
                startActivity(intent);
            }
        });
    }
}