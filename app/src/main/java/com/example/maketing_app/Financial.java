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

public class Financial extends AppCompatActivity {
    Context context;
    Resources resources;
    int lang_selected;
    TextView txt1,txt2,txt3,txt4,txt5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.ftxt1);
        txt2=findViewById(R.id.ftxt2);
        txt3=findViewById(R.id.ftxt3);
        txt4=findViewById(R.id.ftxt4);
        txt5=findViewById(R.id.ftxt5);

        CardView incomcard=findViewById(R.id.income);
        CardView loancard=findViewById(R.id.loancard);
        CardView debtcard=findViewById(R.id.dept);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView financialcard=findViewById(R.id.financialcard);
        CardView walletcard=findViewById(R.id.wallet);

        if (LocaleHelper.getLanguage(Financial.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Financial.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.financial_literacy));
            lang_selected=0;
            setString();



        } else if (LocaleHelper.getLanguage(Financial.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Financial.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.financial_literacy));
            lang_selected=1;
            setString();


        }


        incomcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,Income.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Financial.this);
            }
        });

        loancard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,LoanSavingService.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Financial.this);
            }
        });

        debtcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,DebtManagement.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Financial.this);
            }
        });

        financialcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,FinancialManagement.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Financial.this);
            }
        });

        walletcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Financial.this,DigitalWallet.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Financial.this);
            }
        });
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.F_IEB));
        txt2.setText(resources.getString(R.string.F_LSS));
        txt3.setText(resources.getString(R.string.F_DM));
        txt4.setText(resources.getString(R.string.F_FM));
        txt5.setText(resources.getString(R.string.F_DW));
    }
}