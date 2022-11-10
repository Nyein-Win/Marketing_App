package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

public class Loan_Calculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
 private ListView lv;
 String schDate,monthly_Pay,monthly_Interest,principal,debt,saving,social_welfare,upfront_fees;
 private  static String JSON_URL="http://localhost:8080/api/method/loanCalObj";
 ArrayList<HashMap<String,String>> schObjlist ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(
                this,
                R.array.Method,
                R.layout.color_spinner_layout
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        schObjlist=new ArrayList<>();
        lv=findViewById(R.id.listview);
        GetData getData=new GetData();
        getData.execute();

    }


    public  class GetData extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... strings) {
            String current="";
            try {
                URL url;
                HttpURLConnection urlConnection=null;
                try {
                    url=new URL(JSON_URL);
                    urlConnection=(HttpURLConnection) url.openConnection();
                    InputStream in=urlConnection.getInputStream();
                    InputStreamReader isr=new InputStreamReader(in);
                    int data=isr.read();
                    while (data != -1){
                        current +=(char) data;
                        data=isr.read();
                    }
                    return  current;
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    if(urlConnection != null){
                        urlConnection.disconnect();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return current;
        }

        @Override
        protected void onPostExecute(String s) {
           try {
               JSONObject jsonObject=new JSONObject(s);
               JSONArray   jsonArray=jsonObject.getJSONArray("schObj");

               for(int i=0;i<jsonArray.length();i++){
                   JSONObject jsonObject1=jsonArray.getJSONObject(i);
                   schDate=jsonObject1.getString("schDate");
                   monthly_Pay=jsonObject1.getString("monthly_Pay");
                   monthly_Interest=jsonObject1.getString("monthly_Interest");
                   principal=jsonObject1.getString("principal");
                   debt =jsonObject1.getString("debt");

                   HashMap<String ,String> schObj=new HashMap<>();
                   schObj.put("schDate",schDate);
                   schObj.put("monthly_Pay",monthly_Pay);
                   schObj.put("monthly_Interest",monthly_Interest);
                   schObj.put("principal",principal);
                   schObj.put("debt",debt);

                   schObjlist.add(schObj);


               }
           } catch (JSONException e) {
               e.printStackTrace();
           }
            ListAdapter adapter=new SimpleAdapter(
                    Loan_Calculator.this,
                    schObjlist,
                    R.layout.row_layout,
                    new String[]{"schDate","monthly_Pay","monthly_Interest","principal","debt"},
                    new int[]{R.id.textView00,R.id.textView01,R.id.textView02,R.id.textView03,R.id.textView04});
                    lv.setAdapter(adapter);

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