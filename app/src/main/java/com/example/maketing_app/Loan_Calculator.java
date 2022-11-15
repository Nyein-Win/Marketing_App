package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Loan_Calculator extends AppCompatActivity {
 public  String spinner_data,u_amount,u_principle,u_debt,u_p,total1,saving1;
 public Spinner spinner;
 public EditText user_amount,user_term;
 public  View view2;
  public TextView equal,equal1,equal2,equal3,equal4,equal5,last_time,last_amount,up_fees,up_fees1,social_txt,social_txt1,saving_txt,saving_txt1,usr_loan,usr_interest,usr_period,usr_txt11,usr_txt22,usr_txt33,monthly_debt,monthly_deb1,u_prin,u_prin1,remak,total_txt,total_txt1;
  public  int i;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        getSupportActionBar().setTitle("Loan Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=findViewById(R.id.spinner);
        spinner_data = spinner.getSelectedItem().toString();
        user_amount=findViewById(R.id.user_Amount);
        user_term=findViewById(R.id.user_Term);
        usr_loan=findViewById(R.id.txt1);
        usr_interest=findViewById(R.id.txt2);
        usr_period=findViewById(R.id.txt3);
        usr_txt11=findViewById(R.id.txt11);
        usr_txt22=findViewById(R.id.txt22);
        usr_txt33=findViewById(R.id.txt33);
        monthly_debt=findViewById(R.id.monthly_debt);
        monthly_deb1=findViewById(R.id.monthly_deb1);
        u_prin=findViewById(R.id.u_prin);
        u_prin1=findViewById(R.id.u_prin1);
        remak=findViewById(R.id.m_txt);
        view2=findViewById(R.id.view2);
        total_txt=findViewById(R.id.t_txt);
        total_txt1=findViewById(R.id.t_txt1);
        saving_txt=findViewById(R.id.saving_txt);
        saving_txt1=findViewById(R.id.saving_txt1);
        up_fees=findViewById(R.id.up_fees);
        up_fees1=findViewById(R.id.up_fees1);
        social_txt=findViewById(R.id.social_txt);
        social_txt1=findViewById(R.id.social_txt1);
        equal=findViewById(R.id.equal);
        equal1=findViewById(R.id.equal1);
        equal2=findViewById(R.id.equal2);
        equal3=findViewById(R.id.equal3);
        equal4=findViewById(R.id.equal4);
        equal5=findViewById(R.id.equal5);
        last_time=findViewById(R.id.t_txt01);
        last_amount=findViewById(R.id.t_txt02);

    }

    public void calculate(View view) {
        int loanAmt=Integer.parseInt(user_amount.getText().toString());
        int tenor=Integer.parseInt(user_term.getText().toString());
        spinner_data = spinner.getSelectedItem().toString();
        if(loanAmt<300000){
            user_amount.setError("(၃) သိန်းမှ သိန်း (၁၀၀) ထိ");
        } else if(loanAmt>10000000){
            user_amount.setError("(၃) သိန်းမှ သိန်း (၁၀၀) ထိ");
        } else if(tenor>30){
            user_term.setError("လ ၃၀ အောက်");
        }else
            if(spinner_data.equals("စီးပွားရေးချေးငွေ")){
                Toast.makeText(this, "စီးပွားရေးချေးငွေ", Toast.LENGTH_SHORT).show();
                equal.setText("=");
                equal1.setText("=");
                equal2.setText("=");
                equal3.setText("=");
                equal4.setText("=");
                equal5.setText("");
                DecimalFormat formatter = new DecimalFormat("#,###,###");
                int c=loanAmt/tenor;
                i= (int) (loanAmt*0.0133*tenor)+loanAmt;
                int p= (int) (loanAmt*0.0233);
                int saving= (int) (loanAmt*0.05);
                int total=p+c;
                int social=(int) (((tenor*0.0417)*loanAmt)*0.01);
                int upfront=(int) (((tenor*0.125)*loanAmt)*0.01);
                u_amount = formatter.format(Integer.parseInt(user_amount.getText().toString()));
                u_principle=formatter.format(i);
                u_debt=formatter.format(c);
                u_p=formatter.format(p);
                String social_fees=formatter.format(social);
                String upfront_fees=formatter.format(upfront);
                saving1=formatter.format(saving);
                total1=formatter.format(total);
                usr_loan.setText("ချေးငွေပမာဏ");
                usr_interest.setText("ပြန်ဆပ်");
                usr_period.setText("ချေးငွေသက်တမ်း");
                monthly_debt.setText("လစဉ်ပေးဆပ်ရမည့် အရင်း");
                u_prin.setText("လစဉ်ပေးဆပ်ရမည့် အတိုး");
                usr_txt11.setText(u_amount+"ကျပ်");
                usr_txt22.setText(u_principle+"ကျပ်");
                usr_txt33.setText(user_term.getText().toString()+"လ");
                monthly_deb1.setText(u_debt +"ကျပ်");
                u_prin1.setText("="+u_p+"ကျပ်");
                remak.setText("(အရင်းကျေအတိုးလျော့)");
                view2.setBackgroundColor(Color.BLACK);
                total_txt.setText("ပထမ အကြိမ်သွင်းငွေ");
                total_txt1.setText(total1 +"ကျပ်");
                saving_txt.setText("မဖြစ်မနေစုဆောင်းငွေ 5% ");
                saving_txt1.setText(saving1+"ကျပ်");
                up_fees.setText("ဝန်ဆောင်မှုနှင့်စာရွက်စာတမ်းခ ("+user_term.getText().toString()+")လ");
                up_fees1.setText(upfront_fees+"ကျပ်");
                social_txt.setText("လူမှုဖူလုံရေး("+user_term.getText().toString()+")လ");
                social_txt1.setText(social_fees+"ကျပ်");
                last_time.setText("");
                last_amount.setText("");


            }
            else if(spinner_data.equals("စိုက်ပျိုးရေးချေးငွေ")){
                Toast.makeText(this, "စိုက်ပျိုးရေးချေးငွေ", Toast.LENGTH_SHORT).show();
                equal.setText("=");
                equal1.setText("=");
                equal2.setText("=");
                equal3.setText("=");
                equal4.setText("=");
                equal5.setText("=");

                DecimalFormat formatter = new DecimalFormat("#,###,###");

                i= (int) (loanAmt*0.0233*tenor)+loanAmt;
                int p= (int) (loanAmt*0.0233);
                int saving= (int) (loanAmt*0.05);
                int total=p;
                int last_total=p+loanAmt;
                int social=(int) (((tenor*0.0417)*loanAmt)*0.01);
                int upfront=(int) (((tenor*0.125)*loanAmt)*0.01);
                u_amount = formatter.format(Integer.parseInt(user_amount.getText().toString()));
                u_principle=formatter.format(i);
                u_p=formatter.format(p);
                String social_fees=formatter.format(social);
                String upfront_fees=formatter.format(upfront);
                String last_total_amount=formatter.format(last_total);
                saving1=formatter.format(saving);
                total1=formatter.format(total);
                usr_loan.setText("ချေးငွေပမာဏ");
                usr_interest.setText("ပြန်ဆပ်");
                usr_period.setText("ချေးငွေသက်တမ်း");
                monthly_debt.setText("လစဉ်ပေးဆပ်ရမည့် အရင်း");
                u_prin.setText("လစဉ်ပေးဆပ်ရမည့် အတိုး");
                usr_txt11.setText(u_amount+"ကျပ်");
                usr_txt22.setText(u_principle+"ကျပ်");
                usr_txt33.setText(user_term.getText().toString()+"လ");
                monthly_deb1.setText(0 +"ကျပ်");
                u_prin1.setText("="+u_p+"ကျပ်");
                remak.setText("");
                view2.setBackgroundColor(Color.BLACK);
                total_txt.setText("ပထမ အကြိမ်သွင်းငွေ");
                total_txt1.setText(total1 +"ကျပ်");
                saving_txt.setText("မဖြစ်မနေစုဆောင်းငွေ 5% ");
                saving_txt1.setText(saving1+"ကျပ်");
                up_fees.setText("ဝန်ဆောင်မှုနှင့်စာရွက်စာတမ်းခ ("+user_term.getText().toString()+")လ");
                up_fees1.setText(upfront_fees+"ကျပ်");
                social_txt.setText("လူမှုဖူလုံရေး("+user_term.getText().toString()+")လ");
                social_txt1.setText(social_fees+"ကျပ်");
                last_time.setText("နောက်ဆုံးအကြိမ် သွင်းငွေ");
                last_amount.setText(last_total_amount+"ကျပ်");

            }





    }
}