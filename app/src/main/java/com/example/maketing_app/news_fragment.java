package com.example.maketing_app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class news_fragment extends Fragment {
    View v;
    private  RecyclerView myrecyclerView1;
    private List<Contact1>  lstcontact1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_news_fragment, container, false);
        myrecyclerView1=(RecyclerView) view.findViewById(R.id.news_recycle);
        RecycleViewAdapter1 recycleViewAdapter1=new RecycleViewAdapter1(getContext(),lstcontact1);
        myrecyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView1.setAdapter(recycleViewAdapter1);

        return  view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstcontact1=new ArrayList<>();

        lstcontact1.add(new Contact1(R.drawable.n1, "၂၀၂၂  ခုနှစ် စထာပါနာ ရုံးချုပ်ဝန်ထမ်းများ သီတင်းကျွတ် ဂါရဝပြုပွဲ"));
        lstcontact1.add(new Contact1(R.drawable.n2,"ပြောင်းစိုက်ပျိုးခြင်း"));
        lstcontact1.add(new Contact1(R.drawable.n3,"မိုးစပါး စိုက်ပျိုးခြင်း"));
       lstcontact1.add(new Contact1(R.drawable.n4,"ဝန်ထမ်းသစ် လုပ်ငန်းခွင် အသုံးချသင်တန်း အပတ်စဉ် (၄၂)"));
        lstcontact1.add(new Contact1(R.drawable.n5,"မီးဘေးသင့် ပြည်သူများအားလှူဒါန်းခြင်း"));
       lstcontact1.add(new Contact1(R.drawable.n6,"နွားထိုးကြီး ရုံးခွဲသစ်ဖွင့်လစ်ကြောင်းကြောညာခြင်း"));
       lstcontact1.add(new Contact1(R.drawable.n7,"မအသိအမှတ်ပြုလက်မှတ်များအား ချီးမြှင့်ပေးအပ်ခြင်း"));
       lstcontact1.add(new Contact1(R.drawable.n8,"နမ့်စန်ရုံးခွဲသစ်ဖွင့်လစ်ကြောင်း ကြောညာခြင်း"));
       lstcontact1.add(new Contact1(R.drawable.n9,"အလုပ်သင်အစီအစဉ် အပတ်စဉ် (၁)"));
    }




}