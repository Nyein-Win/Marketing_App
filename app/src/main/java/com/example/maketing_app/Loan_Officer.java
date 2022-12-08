package com.example.maketing_app;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Loan_Officer extends AppCompatActivity {
    Button mSaveBtn;
    TextView text;
    private static final int STORAGE_CODE = 1000;
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
                savePdf();
            }
        });

    }
    private void savePdf() {
        //create object of Document class
        Document mDoc = new Document();
        //pdf file name
        String mFileName = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(System.currentTimeMillis());
        //pdf file path
        String mFilePath = Environment.getExternalStorageDirectory().getPath()+ "/Download/" + mFileName + ".pdf";
        Toast.makeText(this, mFileName+".pdf", Toast.LENGTH_SHORT).show();

        try {
            //create instance of PdfWriter class
            PdfWriter.getInstance(mDoc, new FileOutputStream(mFilePath));
            //open the document for writing
            mDoc.open();
            //get text from EditText i.e. mTextEt
            String mText ="Designation. :Loan Officer\n" +
            "Responsible to : Chief Loan Officer\n" +
                    "\n" +
                    "Position Summary\n" +
                    "\n" +
                    "The Loan Officer job is to do direct marketing and sell loan products\n" +
                    "\n" +
                    "thereafter, conduct due dillgence before recrulting and selecting qualified borrowers. Bullding good relationship with \n" +
                    "target segments/cllentele and providing high qualty of customer service which will help Loan Officer to attract new andyor maintaining exlsting cllenteles\n" +
                    "\n" +
                    "Duties and Responsibilities\n" +
                    "(1) Research and analyze market area for promoting and selling\n" +
                    "company's products to the public.\n" +
                    "\n" +
                    "(2) Dellver training on loan product, policy and procedure to customers or\n" +
                    "communitles.\n" +
                    "\n" +
                    "(3) Bulld and maintaln good relationship with colleagues, customers.\n" +
                    "local authoritles and other stakeholders.\n" +
                    "\n" +
                    "(4) Implement target plan distributed by chlef loan officer or branch\n" +
                    "manager.\n" +
                    "(5) Perform data collection, validation anbppraisal to all loan\n" +
                    "applicants before recommending for approval.\n" +
                    "(6) Help clients to complete loan application and loan agreement than explain them to make sure that\n" +
                    " they are well understand of all clauses in those document especially loan agreement\n" +
                    "(7) Perform loan monitoring, reviewing and solve problem related to\n" +
                    "default loans\n" +
                    "(8) Perform other tasks as assigned by manager.";


            mDoc.add(new Paragraph(mText));

            //close the document
            mDoc.close();
            //show message that file is saved, it will show file name and file path too
            Toast.makeText(this, "saved!", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            //if any thing goes wrong causing exception, get and show exception message
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    //handle permission result
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //permission was granted from popup, call savepdf method
                    savePdf();
                } else {
                    //permission was denied from popup, show error message
                    Toast.makeText(this, "Permission denied...!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}