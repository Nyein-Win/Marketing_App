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
import java.io.FileNotFoundException;
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1000);
        }

        mSaveBtn = (Button) findViewById(R.id.downloading);
        text = (TextView) findViewById(R.id.textView28);

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String mtext=text.getText().toString();
                 SaveTextAsFile(mtext);

            }
        });

    }
    private  void  SaveTextAsFile(String context){
        String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(System.currentTimeMillis());

        try {
            //path  tp storage
            File path= Environment.getExternalStorageDirectory();
            //create folder name "My File"
            File dir=new File(path+ "/Download/");
            dir.mkdir();
            //file name
            String fileName="Loan_Officer"+timeStamp+".txt"; //egLoan Officer_20221129_152233.text
            Toast.makeText(this, fileName, Toast.LENGTH_SHORT).show();

            File file=new File(dir,fileName);
            //fileWriter class is used to store character in file
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(context);
            bw.close();
            Toast.makeText(this,"saved!", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "File not found"+e.getMessage(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error Saving!"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1000: {
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_DENIED) {
                    //permission was granted,save data
                    Toast.makeText(this, "Storage permission is granted..!", Toast.LENGTH_SHORT).show();

                } else {
                    //permission denied from popup,show toast
                    Toast.makeText(this, "Storage permission is not granted..!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }

    }
    }
