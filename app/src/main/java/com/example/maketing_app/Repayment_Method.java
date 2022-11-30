package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Repayment_Method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repayment_method);
        getSupportActionBar().setTitle("Repayment Methods");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button branches=(Button)findViewById(R.id.branches);
        branches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,Second_Branches.class);
                startActivity(intent);
            }
        });

        TextView ongo=(TextView)findViewById(R.id.ongo);

        ongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,OnGoMethod.class);
                startActivity(intent);
            }
        });
        TextView wavemoney=(TextView) findViewById(R.id.wavemoney);

        wavemoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,WaveMoneyMethod.class);
                startActivity(intent);
            }
        });
    }
}