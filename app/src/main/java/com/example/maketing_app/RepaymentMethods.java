package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RepaymentMethods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repayment_methods);
        getSupportActionBar().setTitle("Repayment Methods");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView ongo=(TextView) findViewById(R.id.ongo);
        ongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RepaymentMethods.this,On_Go.class);
                startActivity(intent);
            }
        });
        TextView wavemoney=(TextView) findViewById(R.id.wavemoney);
        wavemoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RepaymentMethods.this,Wave_Money.class);
                startActivity(intent);
            }
        });
    }
}