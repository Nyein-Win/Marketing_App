package com.example.maketing_app;


import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
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
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;


public class Loan_Officer extends AppCompatActivity {
    Button download;
    Bitmap bitmap;
    LinearLayout linear;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_officer);
        getSupportActionBar().setTitle("Loan Officer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //savePdf();

        download =(Button)findViewById(R.id.downloading);
        linear =(LinearLayout)findViewById(R.id.linearLayout);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Downloading File" , Toast.LENGTH_SHORT ).show();
                Log.d("size",""+linear.getWidth()+""+linear.getHeight());
                bitmap=loadBitmapFromView(linear,linear.getWidth(),linear.getHeight());
                createPdf();
//               Log.d("size",linear.getWidth() + "" + linear.getHeight());
//             //  bitmap = loadBitmapFromView(linear, 200, 200);
//                bitmap = loadBitmapFromView(linear, linear.getWidth(), linear.getHeight());
//                createPdf();
            }
        });
    }
    private void createPdf() {
        WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float height = displayMetrics.heightPixels;
        float width = displayMetrics.widthPixels;

        int convertHeight = (int) height,
                convertWidth = (int) width;

        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(convertWidth, convertHeight, 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        canvas.drawPaint(paint);
        bitmap = Bitmap.createScaledBitmap (bitmap, convertWidth, convertHeight, true);
        canvas.drawBitmap(bitmap, 0, 0, null);
        document.finishPage(page);

        //String targetpdf = "/Download/page.pdf";
        File filepath = new File("/storage/emulated.VidMate/download/page.pdf");
        try {
            document.writeTo(new FileOutputStream(filepath));
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "something wrong try again" + e.toString(), Toast.LENGTH_SHORT).show();
        }
        document.close();
        Toast.makeText(this, "pdf create successfully ", Toast.LENGTH_SHORT).show();
        openPdf();
    }

    private void openPdf() {
        File file = new File("/storage/emulated.VidMate/download/page.pdf");
        if (file.exists()) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.fromFile(file);
            intent.setDataAndType(uri, "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "Not application found for pdf reader", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private Bitmap loadBitmapFromView(LinearLayout linear, int width, int height) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        linear.draw(canvas);
        return bitmap;
    }
}
