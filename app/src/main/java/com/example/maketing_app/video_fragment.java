package com.example.maketing_app;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.load.model.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class video_fragment extends Fragment {
    private RecyclerView myrecyclerView;
    RecycleViewAdapter recycleViewAdapter;
    ArrayList<Contact> list=new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_video_fragment, container, false);
      myrecyclerView=view.findViewById(R.id.videos_recycle);
        recycleViewAdapter=new RecycleViewAdapter(getContext(),list);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recycleViewAdapter);
        fetchdata();
       return view;
    }
  private void fetchdata(){
      RequestQueue requestQueue= Volley.newRequestQueue(getActivity());
      StringRequest stringRequest=new StringRequest(Request.Method.GET,"https://www.googleapis.com/youtube/v3/search?part=snippet&channelid=UC7xBHK6l5bCV_YMHo54Uerw&maxResults=27&key=AIzaSyBSZCn_WxIXXzIqO-nv6VovHOSsGCqU-nY",new Response.Listener<String>() {
                  @SuppressLint("NotifyDataSetChanged")
                  @Override
                  public void onResponse(String response) {
                      try {
                          JSONObject jsonObject=new JSONObject(response);
                          JSONArray jsonArray=jsonObject.getJSONArray("items");
                          for (int i=0;i<jsonArray.length();i++){
                              JSONObject jsonObject1=jsonArray.getJSONObject(i);
                              JSONObject jsonvideoid=jsonObject1.getJSONObject("id");
                              JSONObject jsonsnippet=jsonObject1.getJSONObject("snippet");
                              JSONObject jsonthumbail=jsonsnippet.getJSONObject("thumbnails").getJSONObject("medium");

                              Contact md=new Contact();
                              if( i != 1 && i != 2){
                                  md.setVideoId(jsonvideoid.getString("videoId"));
                                  md.setTitle(jsonsnippet.getString("title"));
                                  md.setUrl(jsonthumbail.getString("url"));
                                  list.add(md);
                              }

                          }
                          if(list.size()>0){
                              recycleViewAdapter.notifyDataSetChanged();
                          }
                      } catch (JSONException e) {
                          e.printStackTrace();
                      }

                  }
              }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
              Toast.makeText(getActivity(),"Error!", Toast.LENGTH_SHORT).show();
          }
      });
      requestQueue.add(stringRequest);
  }
}