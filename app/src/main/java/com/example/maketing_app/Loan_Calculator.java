package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Loan_Calculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
 private ListView lv;
 String schDate,monthly_Pay,monthly_Interest,principal,debt,saving,social_welfare,upfront_fees;
    public EditText e1,e2;
    String spinner_house_data;
    public Integer tenor;
    public Integer loanAmt;
    public String loanType;
    public String JSON_URL="http://localhost:8080/api/method/loanCalObj";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        getSupportActionBar().setTitle("Loan Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Spinner spinner=findViewById(R.id.spinner);
        spinner_house_data = spinner.getSelectedItem().toString();
        e1=findViewById(R.id.user_Amount);
        e2=findViewById(R.id.user_Term);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(
                this,
                R.array.Method,
                R.layout.color_spinner_layout
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);




    }
    public void PostData(View view) {
        if (e1.getText().toString().trim().equalsIgnoreCase("")) {
            e1.setError("Enter Loan Amount");
        } else if
        (e2.getText().toString().trim().equalsIgnoreCase("")) {
            e2.setError("Enter Loan Term");
        } else {
            loanType = spinner_house_data;
            loanAmt = Integer.parseInt(e1.getText().toString());
            tenor = Integer.parseInt(e2.getText().toString());
            Toast.makeText(Loan_Calculator.this, "Test Success", Toast.LENGTH_SHORT).show();



        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}