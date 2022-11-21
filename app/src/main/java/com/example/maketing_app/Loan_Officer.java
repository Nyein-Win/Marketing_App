package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Loan_Officer extends AppCompatActivity {
    Button download;
    CardView cardform;
    Bitmap bitmap;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_officer);
        getSupportActionBar().setTitle("Loan Officer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        savePdf();

        download=(Button) findViewById(R.id.downloading);
        cardform=(CardView) findViewById(R.id.cardform);
    }

    private void savePdf() {
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("size",cardform.getWidth()+""+cardform.getHeight());
                bitmap=loadBitmapFromView(cardform,cardform.getWidth(),cardform.getHeight());
                createPdf();
            }
        });

    }

    private void createPdf() {
        DisplayMetrics displayMetrics=new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float height=displayMetrics.heightPixels;
        float width=displayMetrics.widthPixels;

        int convertHeight=(int)height,
                convertWidth=(int)width;

        PdfDocument document=new PdfDocument();
        PdfDocument.PageInfo pageInfo=new PdfDocument.PageInfo.Builder(convertWidth,convertHeight,1).create();
        PdfDocument.Page page=document.startPage(pageInfo);

        Canvas canvas=page.getCanvas();
        Paint paint=new Paint();
        canvas.drawPaint(paint);
        bitmap=Bitmap.createScaledBitmap(bitmap,convertWidth,convertHeight,true);
        canvas.drawBitmap(bitmap,0,0,null);
        document.finishPage(page);

        String targetpdf="sdcard/page.pdf";
        File filepath=new File(targetpdf);
        try{
            document.writeTo(new FileOutputStream(filepath));
        }catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this,"something want wrong try again"+e.toString(),Toast.LENGTH_SHORT).show();
        }
        document.close();
        Toast.makeText(this,"pdf create successfully ",Toast.LENGTH_SHORT).show();
        openPdf();
    }

    private void openPdf() {
        File file=new File("/sdcard/page.pdf");
        Intent intent=new Intent(Intent.ACTION_VIEW);
        Uri uri= Uri.fromFile(file);
        intent.setDataAndType(uri,"application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        try{
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Toast.makeText(this,"Not application found for pdf reader",Toast.LENGTH_SHORT).show();
        }
    }

    private Bitmap loadBitmapFromView(CardView cardform, int width, int height) {
        bitmap=Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bitmap);
        cardform.draw(canvas);
        return bitmap;
    }
    }
