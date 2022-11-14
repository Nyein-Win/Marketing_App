package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Financial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);
        getSupportActionBar().setTitle("Financial Literacy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView incomcard=findViewById(R.id.income);
        CardView loancard=findViewById(R.id.loancard);
        CardView debtcard=findViewById(R.id.dept);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView financialcard=findViewById(R.id.financialcard);
        CardView walletcard=findViewById(R.id.wallet);


        incomcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,Income.class);
                startActivity(intent);
            }
        });

        loancard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,LoanSavingService.class);
                startActivity(intent);
            }
        });

        debtcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,DebtManagement.class);
                startActivity(intent);
            }
        });

        financialcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,FinancialManagement.class);
                startActivity(intent);
            }
        });

        walletcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,DigitalWallet.class);
                startActivity(intent);
            }
        });
    }
}