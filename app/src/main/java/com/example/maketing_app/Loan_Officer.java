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
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Loan_Officer extends AppCompatActivity {
    private static final int  WRITE_EXTERNAL_STORAGE_CODE=1;
    EditText mInputEd;
    Button mSaveBtn;
    String mText;
    TextView text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_officer);
        getSupportActionBar().setTitle("Loan Officer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //savePdf();

        mSaveBtn =(Button)findViewById(R.id.downloading);
        text=(TextView)findViewById(R.id.textView28);

        String[] id_txt={"R.id.textView6","R.id.textView20","R.id.textView20","R.id.textView23","R.id.textView24"};


        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mText=text.getText().toString().trim();


                if(mText.isEmpty()){
                    Toast.makeText(Loan_Officer.this, "please insert!", Toast.LENGTH_SHORT).show();
                }else{
                    if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                        if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
                                PackageManager.PERMISSION_DENIED){

                            String[] permissions={Manifest.permission.WRITE_EXTERNAL_STORAGE};
                            //show popup for runtime permission
                            requestPermissions(permissions,WRITE_EXTERNAL_STORAGE_CODE);

                        }
                        else{
                            //permission already granted,perform download
                            saveToTextfile(mText);
                        }
                    } else {
                        //system os is less than marshallow,perform download
                        saveToTextfile(mText);
                    }
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case WRITE_EXTERNAL_STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_DENIED) {
                    //permission was granted,save data
                    saveToTextfile(mText);
                } else {
                    //permission denied from popup,show toast
                    Toast.makeText(this, "Storage permission is require to store data..!", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
    private void saveToTextfile(String mText) {
        String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(System.currentTimeMillis());
        try {
            //path  tp storage
            File path= Environment.getExternalStorageDirectory();
            //create folder name "My File"
            File dir=new File(path+ "/Download/");
            dir.mkdir();
            //file name
            String fileName="Loan_Officer"+timeStamp+".pdf"; //egLoan Officer_20221129_152233.text

            File file=new File(dir,fileName);
            //fileWriter class is used to store character in file
            FileWriter fw=new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(mText);

            //show file name and path where file to save
            Toast.makeText(this,fileName+"is saved to \n"+dir, Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            //if anything goes wrong
            Toast.makeText(this, e.getMessage() , Toast.LENGTH_SHORT).show();

        }
    }

}