package com.example.maketing_app;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.internal.v;

import java.text.DecimalFormat;

public class CalculatorLoan extends AppCompatActivity implements View.OnClickListener {
    public String spinner_data, u_amount, u_p, u_principle, u_debt, saving1, total1;
    public Spinner spinner;
    public EditText user_amount, user_term;
    public View view2, view3;
    public TextView t1,t2, equal, nyein_01, equal1, equal2, equal3, equal4, equal5, equal001, final_txt, final_txt1, last_time, last_amount, up_fees, up_fees1, social_txt, social_txt1, saving_txt, saving_txt1, usr_loan, usr_interest, usr_period, usr_txt11, usr_txt22, usr_txt33, monthly_debt, monthly_deb1, u_prin, u_prin1, total_txt, total_txt1;
    public int i;
    public Button calculate;
    Context context;
    Resources resources;
    int lang_selected;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_loan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1=findViewById(R.id.loanAmt);
        t2=findViewById(R.id.tenor);

        spinner = findViewById(R.id.spinner2);

        user_amount = findViewById(R.id.user_Amount);
        user_term = findViewById(R.id.user_Term);
        calculate=findViewById(R.id.cal_loan);
        usr_loan = findViewById(R.id.txt1);
        usr_interest = findViewById(R.id.txt2);
        usr_period = findViewById(R.id.txt3);
        usr_txt11 = findViewById(R.id.txt11);
        usr_txt22 = findViewById(R.id.txt22);
        usr_txt33 = findViewById(R.id.txt33);
        equal001 = findViewById(R.id.equal001);
        final_txt = findViewById(R.id.t_txt001);
        final_txt1 = findViewById(R.id.t_txt002);

        monthly_debt = findViewById(R.id.monthly_debt);
        monthly_deb1 = findViewById(R.id.monthly_deb1);
        u_prin = findViewById(R.id.u_prin);
        u_prin1 = findViewById(R.id.u_prin1);
        view2 = findViewById(R.id.view2);
        view3 = findViewById(R.id.view3);
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
        nyein_01 = findViewById(R.id.nyein_01);

        if (LocaleHelper.getLanguage(CalculatorLoan.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(CalculatorLoan.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.loan_calculator));
            lang_selected=0;
            setString();
            calculate.setOnClickListener(this);



        } else if (LocaleHelper.getLanguage(CalculatorLoan.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(CalculatorLoan.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.loan_calculator));
            lang_selected=1;
            setString();
            calculate.setOnClickListener(this);


        }
    }

    private void setString() {
    t1.setText(resources.getString(R.string.loanAmt));
    t2.setText(resources.getString(R.string.tenor));
    calculate.setText(resources.getString(R.string.Cal_loan));
    }

    @Override
    public void onClick(View view) {


        String t1 = user_amount.getText().toString();
        String t2 = user_term.getText().toString();
        spinner_data = spinner.getSelectedItem().toString();
        if (TextUtils.isEmpty(t1)) {
            user_amount.setError(resources.getString(R.string.error0));
            return;
        } else if (TextUtils.isEmpty(t2)) {
            user_term.setError(resources.getString(R.string.error0));
            return;
        } else if (Integer.parseInt(t1) < 300000) {
            user_amount.setError(resources.getString(R.string.error1));
        } else if (Integer.parseInt(t1) > 10000000) {
            user_amount.setError(resources.getString(R.string.error1));
        } else if (Integer.parseInt(t2) > 30) {
            user_term.setError(resources.getString(R.string.error2));
        } else if (Integer.parseInt(t2) <= 5) {
            user_term.setError(resources.getString(R.string.error2));
        } else if (spinner_data.equals("Business Loans")) {
            Toast.makeText(this, resources.getString(R.string.B_loan), Toast.LENGTH_SHORT).show();
            equal.setText("=");
            equal1.setText("=");
            equal2.setText("=");
            equal3.setText("=");
            equal4.setText("=");
            equal5.setText("");
            equal001.setText("=");
            nyein_01.setText("=");
            DecimalFormat formatter = new DecimalFormat("#,###,###");
            int c = Integer.parseInt(t1) / Integer.parseInt(t2);
            i = (int) (Integer.parseInt(t1) * 0.0133 * Integer.parseInt(t2)) + Integer.parseInt(t1);
            int p = (int) (Integer.parseInt(t1) * 0.0233);
            int saving = (int) (Integer.parseInt(t1) * 0.05);
            int total = p + c;
            int social = (int) (((Integer.parseInt(t2) * 0.0417) * Integer.parseInt(t1)) * 0.01);
            int upfront = (int) (((Integer.parseInt(t2) * 0.125) * Integer.parseInt(t1)) * 0.01);
            int total00 = social + upfront + saving;
            u_amount = formatter.format(parseInt(user_amount.getText().toString()));
            u_principle = formatter.format(i);
            u_debt = formatter.format(c);
            u_p = formatter.format(p);
            String social_fees = formatter.format(social);
            String upfront_fees = formatter.format(upfront);
            String total001 = formatter.format(total00);
            saving1 = formatter.format(saving);
            total1 = formatter.format(total);
            usr_loan.setText(resources.getString(R.string.loanAmt));
            usr_interest.setText(resources.getString(R.string.Rpayment));
            usr_period.setText(resources.getString(R.string.tnor));
            monthly_debt.setText(resources.getString(R.string.principal));
            u_prin.setText(resources.getString(R.string.interest_1st));
            usr_txt11.setText(u_amount +" "+ resources.getString(R.string.mmk));
            usr_txt22.setText(u_principle +" "+resources.getString(R.string.mmk));
            usr_txt33.setText( user_term.getText().toString() +"-"+  resources.getString(R.string.month));
            monthly_deb1.setText(u_debt +" "+ resources.getString(R.string.mmk));
            u_prin1.setText(u_p +" "+ resources.getString(R.string.mmk));
            view2.setBackgroundColor(Color.BLACK);
            view3.setBackgroundColor(Color.BLACK);
            total_txt.setText(resources.getString(R.string.first_D));
            total_txt1.setText(total1 +" "+resources.getString(R.string.mmk));
            saving_txt.setText(resources.getString(R.string.saving));
            saving_txt1.setText(saving1 +" "+ resources.getString(R.string.mmk));
            up_fees.setText(resources.getString(R.string.upfont)+"(" + user_term.getText().toString() + ")"+resources.getString(R.string.month));
            up_fees1.setText(upfront_fees +" "+ resources.getString(R.string.mmk));
            social_txt.setText(resources.getString(R.string.social_welfare)+"(" + user_term.getText().toString() + ")"+resources.getString(R.string.month));
            social_txt1.setText(social_fees +" "+resources.getString(R.string.mmk));
            last_time.setText("");
            last_amount.setText("");
            final_txt.setText(resources.getString(R.string.total));
            final_txt1.setText(total001 +" "+resources.getString(R.string.mmk));
        } else if (spinner_data.equals("Agricultural Loans")) {
            Toast.makeText(this, resources.getString(R.string.Ag_loan), Toast.LENGTH_SHORT).show();
            equal.setText("=");
            equal1.setText("=");
            equal2.setText("=");
            equal3.setText("=");
            equal4.setText("=");
            equal5.setText("=");
            equal001.setText("=");
            DecimalFormat formatter = new DecimalFormat("#,###,###");

            i = (int) (Integer.parseInt(t1) * 0.0233 * Integer.parseInt(t2)) + Integer.parseInt(t1);
            int p = (int) (Integer.parseInt(t1) * 0.0233);
            int saving = (int) (Integer.parseInt(t1) * 0.05);
            int total = p;
            int last_total = p + Integer.parseInt(t1);
            int social = (int) (((Integer.parseInt(t2) * 0.0417) * Integer.parseInt(t1)) * 0.01);
            int upfront = (int) (((Integer.parseInt(t2) * 0.125) * Integer.parseInt(t1)) * 0.01);
            int total00 = social + upfront + saving;
            u_amount = formatter.format(parseInt(user_amount.getText().toString()));
            u_principle = formatter.format(i);
            u_p = formatter.format(p);
            String social_fees = formatter.format(social);
            String upfront_fees = formatter.format(upfront);
            String total001 = formatter.format(total00);
            String last_total_amount = formatter.format(last_total);
            saving1 = formatter.format(saving);
            total1 = formatter.format(total);
            usr_loan.setText(resources.getString(R.string.loanAmt));
            usr_interest.setText(resources.getString(R.string.tenor));
            usr_period.setText(resources.getString(R.string.tnor));
            monthly_debt.setText(resources.getString(R.string.principal));
            u_prin.setText(resources.getString(R.string.monthly_interest));
            usr_txt11.setText(u_amount +" "+ resources.getString(R.string.mmk));
            usr_txt22.setText(u_principle +" "+ resources.getString(R.string.mmk));
            usr_txt33.setText(user_term.getText().toString() +"-"+  resources.getString(R.string.month));
            monthly_deb1.setText(0 +" "+ resources.getString(R.string.mmk));
            u_prin1.setText(u_p +" "+ resources.getString(R.string.mmk));
            view2.setBackgroundColor(Color.BLACK);
            view2.setBackgroundColor(Color.BLACK);
            total_txt.setText(resources.getString(R.string.first_D));
            total_txt1.setText(total1 +" "+resources.getString(R.string.mmk));
            saving_txt.setText(resources.getString(R.string.saving));
            saving_txt1.setText(saving1 +" "+resources.getString(R.string.mmk));
            up_fees.setText(resources.getString(R.string.upfont)+"(" + user_term.getText().toString() + ")"+resources.getString(R.string.month));
            up_fees1.setText(upfront_fees +resources.getString(R.string.mmk));
            social_txt.setText(resources.getString(R.string.social_welfare)+"(" + user_term.getText().toString() + ")"+resources.getString(R.string.month));
            social_txt1.setText(social_fees +" "+resources.getString(R.string.mmk));
            last_time.setText(resources.getString(R.string.last_D));
            last_amount.setText(last_total_amount +" "+ resources.getString(R.string.mmk));
            final_txt.setText(resources.getString(R.string.total));
            final_txt1.setText(total001 +" "+resources.getString(R.string.mmk));

        }


    }
}
