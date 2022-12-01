package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

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
                Animatoo.animateSwipeRight(Resource_Human.this);


            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,VacanciesCurrent.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);


            }
        });
        CardView selection=findViewById(R.id.selection);
        selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Selection_Process.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });
        CardView learning=findViewById(R.id.learning);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Learning_Development.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });

        CardView benifit=findViewById(R.id.benifit);
        benifit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Compensate_Benefits.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });
    }
}