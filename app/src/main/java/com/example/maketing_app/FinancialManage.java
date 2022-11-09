package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinancialManage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_manage);

        Button incomebtn=findViewById(R.id.income_btn);
        Button loaningbtn=findViewById(R.id.loaning_btn);
        Button debtbtn=findViewById(R.id.Debt_btn);
        Button financial=findViewById(R.id.Financial_btn);
        Button walletbtn=findViewById(R.id.wallet_btn);

        incomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinancialManage.this,Income.class);
                startActivity(intent);
                finish();
            }
        });
        loaningbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinancialManage.this,LoanSavingService.class);
                startActivity(intent);
                finish();
            }
        });
        debtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinancialManage.this,DebtManagement.class);
                startActivity(intent);
                finish();
            }
        });
        financial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinancialManage.this,FinancialManagement.class);
                startActivity(intent);
                finish();
            }
        });
        walletbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinancialManage.this,DigitalWallet.class);
                startActivity(intent);
                finish();
            }
        });
    }
}