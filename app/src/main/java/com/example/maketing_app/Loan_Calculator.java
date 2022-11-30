package com.example.maketing_app;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Loan_Calculator extends AppCompatActivity implements View.OnClickListener {
    public String spinner_data,u_amount,u_p,u_principle,u_debt,saving1,total1;
    public Spinner spinner;
    public EditText user_amount, user_term;
    public View view2,view3;
    public TextView equal, equal1, equal2, equal3, equal4, equal5,equal001,final_txt,final_txt1, last_time, last_amount, up_fees, up_fees1, social_txt, social_txt1, saving_txt, saving_txt1, usr_loan, usr_interest, usr_period, usr_txt11, usr_txt22, usr_txt33, monthly_debt, monthly_deb1, u_prin, u_prin1, remak, total_txt, total_txt1;
    public int i;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        getSupportActionBar().setTitle("Loan Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner = findViewById(R.id.spinner);

        user_amount = findViewById(R.id.user_Amount);
        user_term = findViewById(R.id.user_Term);
        findViewById(R.id.cal_laon).setOnClickListener(this);
        usr_loan = findViewById(R.id.txt1);
        usr_interest = findViewById(R.id.txt2);
        usr_period = findViewById(R.id.txt3);
        usr_txt11 = findViewById(R.id.txt11);
        usr_txt22 = findViewById(R.id.txt22);
        usr_txt33 = findViewById(R.id.txt33);
        equal001=findViewById(R.id.equal001);
        final_txt=findViewById(R.id.t_txt001);
        final_txt1=findViewById(R.id.t_txt002);

        monthly_debt = findViewById(R.id.monthly_debt);
        monthly_deb1 = findViewById(R.id.monthly_deb1);
        u_prin = findViewById(R.id.u_prin);
        u_prin1 = findViewById(R.id.u_prin1);
        remak = findViewById(R.id.m_txt);
        view2 = findViewById(R.id.view2);
        view3=findViewById(R.id.view3);
        total_txt = findViewById(R.id.t_txt);
        total_txt1 = findViewById(R.id.t_txt1);
        saving_txt = findViewById(R.id.saving_txt);
        saving_txt1 = findViewById(R.id.saving_txt1);
        up_fees = findViewById(R.id.up_fees);
        up_fees1 = findViewById(R.id.up_fees1);
        social_txt = findViewById(R.id.social_txt);
        social_txt1 = findViewById(R.id.social_txt1);
        equal = findViewById(R.id.equal);
        equal1 = findViewById(R.id.equal1);
        equal2 = findViewById(R.id.equal2);
        equal3 = findViewById(R.id.equal3);
        equal4 = findViewById(R.id.equal4);
        equal5 = findViewById(R.id.equal5);
        last_time = findViewById(R.id.t_txt01);
        last_amount = findViewById(R.id.t_txt02);

    }


    @Override
    public void onClick(View v) {
        String t1=user_amount.getText().toString();
        String t2=user_term.getText().toString();
        spinner_data = spinner.getSelectedItem().toString();
        if(TextUtils.isEmpty(t1)){
            user_amount.setError("error!");
            return;
        }else
            if(TextUtils.isEmpty(t2)){
                user_term.setError("error!");
                return;
            }else
            if (Integer.parseInt(t1) < 300000 ) {
                user_amount.setError("(၃) သိန်းမှ သိန်း (၁၀၀) ထိ");
            } else if (Integer.parseInt(t1) > 10000000) {
                user_amount.setError("(၃) သိန်းမှ သိန်း (၁၀၀) ထိ");
            } else if (Integer.parseInt(t2) > 30) {
                user_term.setError("၆ လ မှ လ ၃၀ အောက်");
            } else if (Integer.parseInt(t2) <= 5) {
                user_term.setError("၆ လ မှ လ ၃၀ အောက်");
            } else if (spinner_data.equals("စီးပွားရေးချေးငွေ")) {
                Toast.makeText(this, "စီးပွားရေးချေးငွေ", Toast.LENGTH_SHORT).show();
                equal.setText("=");
                equal1.setText("=");
                equal2.setText("=");
                equal3.setText("=");
                equal4.setText("=");
                equal5.setText("");
                equal001.setText("=");
                DecimalFormat formatter = new DecimalFormat("#,###,###");
                int c = Integer.parseInt(t1) / Integer.parseInt(t2);
                i = (int) (Integer.parseInt(t1) * 0.0133 * Integer.parseInt(t2)) + Integer.parseInt(t1);
                int p = (int) (Integer.parseInt(t1) * 0.0233);
                int saving = (int) (Integer.parseInt(t1) * 0.05);
                int total = p + c;
                int social = (int) (((Integer.parseInt(t2) * 0.0417) * Integer.parseInt(t1)) * 0.01);
                int upfront = (int) (((Integer.parseInt(t2) * 0.125) * Integer.parseInt(t1)) * 0.01);
                int total00=social+upfront+saving;
                u_amount = formatter.format(parseInt(user_amount.getText().toString()));
                u_principle = formatter.format(i);
                u_debt = formatter.format(c);
                u_p = formatter.format(p);
                String social_fees = formatter.format(social);
                String upfront_fees = formatter.format(upfront);
                String total001=formatter.format(total00);
                saving1 = formatter.format(saving);
                total1 = formatter.format(total);
                usr_loan.setText("ချေးငွေပမာဏ");
                usr_interest.setText("ပြန်ဆပ်");
                usr_period.setText("ချေးငွေသက်တမ်း");
                monthly_debt.setText("လစဉ်ပေးဆပ်ရမည့် အရင်း");
                u_prin.setText("ပထမ လ ပေးဆပ်ရမည် အတိုး");
                usr_txt11.setText(u_amount + "ကျပ်");
                usr_txt22.setText(u_principle + "ကျပ်");
                usr_txt33.setText(user_term.getText().toString() + "လ");
                monthly_deb1.setText(u_debt + "ကျပ်");
                u_prin1.setText("=" + u_p + "ကျပ်");
                remak.setText("(အရင်းကျေအတိုးလျော့)");
                view2.setBackgroundColor(Color.BLACK);
                view3.setBackgroundColor(Color.BLACK);
                total_txt.setText("ပထမ အကြိမ်သွင်းငွေ");
                total_txt1.setText(total1 + "ကျပ်");
                saving_txt.setText("မဖြစ်မနေစုဆောင်းငွေ 5% ");
                saving_txt1.setText(saving1 + "ကျပ်");
                up_fees.setText("ဝန်ဆောင်မှုနှင့်စာရွက်စာတမ်းခ (" + user_term.getText().toString() + ")လ");
                up_fees1.setText(upfront_fees + "ကျပ်");
                social_txt.setText("လူမှုဖူလုံရေး(" + user_term.getText().toString() + ")လ");
                social_txt1.setText(social_fees + "ကျပ်");
                last_time.setText("");
                last_amount.setText("");
                final_txt.setText("စုစုပေါင်း ");
                final_txt1.setText(total001+ "ကျပ်");
            }
            else if (spinner_data.equals("စိုက်ပျိုးရေးချေးငွေ")) {
                Toast.makeText(this, "စိုက်ပျိုးရေးချေးငွေ", Toast.LENGTH_SHORT).show();
                equal.setText("=");
                equal1.setText("=");
                equal2.setText("=");
                equal3.setText("=");
                equal4.setText("=");
                equal5.setText("=");
                equal001.setText("=");
                DecimalFormat formatter = new DecimalFormat("#,###,###");

                i = (int) (Integer.parseInt(t1) * 0.0233 * Integer.parseInt(t2)) + Integer.parseInt(t2);
                int p = (int) (Integer.parseInt(t1) * 0.0233);
                int saving = (int) (Integer.parseInt(t1) * 0.05);
                int total = p;
                int last_total = p + Integer.parseInt(t1);
                int social = (int) (((Integer.parseInt(t2) * 0.0417) * Integer.parseInt(t1)) * 0.01);
                int upfront = (int) (((Integer.parseInt(t2) * 0.125) * Integer.parseInt(t1)) * 0.01);
                int total00=social+upfront+saving;
                u_amount = formatter.format(parseInt(user_amount.getText().toString()));
                u_principle = formatter.format(i);
                u_p = formatter.format(p);
                String social_fees = formatter.format(social);
                String upfront_fees = formatter.format(upfront);
                String total001=formatter.format(total00);
                String last_total_amount = formatter.format(last_total);
                saving1 = formatter.format(saving);
                total1 = formatter.format(total);
                usr_loan.setText("ချေးငွေပမာဏ");
                usr_interest.setText("ပြန်ဆပ်");
                usr_period.setText("ချေးငွေသက်တမ်း");
                monthly_debt.setText("လစဉ်ပေးဆပ်ရမည့် အရင်း");
                u_prin.setText("လစဉ်ပေးဆပ်ရမည့် အတိုး");
                usr_txt11.setText(u_amount + "ကျပ်");
                usr_txt22.setText(u_principle + "ကျပ်");
                usr_txt33.setText(user_term.getText().toString() + "လ");
                monthly_deb1.setText(0 + "ကျပ်");
                u_prin1.setText("=" + u_p + "ကျပ်");
                remak.setText("");
                view2.setBackgroundColor(Color.BLACK);
                view2.setBackgroundColor(Color.BLACK);
                total_txt.setText("ပထမ အကြိမ်သွင်းငွေ");
                total_txt1.setText(total1 + "ကျပ်");
                saving_txt.setText("မဖြစ်မနေစုဆောင်းငွေ 5% ");
                saving_txt1.setText(saving1 + "ကျပ်");
                up_fees.setText("ဝန်ဆောင်မှုနှင့်စာရွက်စာတမ်းခ (" + user_term.getText().toString() + ")လ");
                up_fees1.setText(upfront_fees + "ကျပ်");
                social_txt.setText("လူမှုဖူလုံရေး(" + user_term.getText().toString() + ")လ");
                social_txt1.setText(social_fees + "ကျပ်");
                last_time.setText("နောက်ဆုံးအကြိမ် သွင်းငွေ");
                last_amount.setText(last_total_amount + "ကျပ်");
                final_txt.setText("စုစုပေါင်း ");
                final_txt1.setText(total001+ "ကျပ်");

            }


    }

    }
