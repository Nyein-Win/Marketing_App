package com.example.maketing_app;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Loan_Officer extends AppCompatActivity {
    private static final int  WRITE_EXTERNAL_STORAGE_CODE=1;
    Button mSaveBtn;
    TextView text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_officer);
        getSupportActionBar().setTitle("Loan Officer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mSaveBtn = (Button) findViewById(R.id.downloading);
        text = (TextView) findViewById(R.id.textView28);
    }

    }
