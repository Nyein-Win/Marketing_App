package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,VacanciesCurrent.class);
                startActivity(intent);
            }
        });
    }
}