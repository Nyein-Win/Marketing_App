package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Calculate_Loan extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public EditText e1,e2;
    String spinner_house_data;
    public Integer tenor;
    public Integer loanAmt;
    public String loanType;
    public String JSON_URL="http://localhost:8080/api/method/loanCalObj";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_loan);
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
            Toast.makeText(Calculate_Loan.this, "Test Success", Toast.LENGTH_SHORT).show();



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