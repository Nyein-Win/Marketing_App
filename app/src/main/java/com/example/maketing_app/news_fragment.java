package com.example.maketing_app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class news_fragment extends Fragment {
    private RecyclerView myrecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_news_fragment, container, false);
//        myrecyclerView=(RecyclerView) view.findViewById(R.id.news_recycle);
//        NWAdapter nwAdapter=new NWAdapter(getContext(),lstmodel);
//        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        myrecyclerView.setAdapter(nwAdapter);
        return  view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        lstmodel=new ArrayList<>();
//        lstmodel.add(new model(R.drawable.n1,"၂၀၂၂  ခုနှစ် စထာပါနာ ရုံးချုပ်ဝန်ထမ်းများ သီတင်းကျွတ် ဂါရဝပြုပွဲ"));
//        lstmodel.add(new model(R.drawable.n2,"ပြောင်းစိုက်ပျိုးခြင်း"));
//        lstmodel.add(new model(R.drawable.n3,"မိုးစပါး စိုက်ပျိုးခြင်း"));
//        lstmodel.add(new model(R.drawable.n4,"ဝန်ထမ်းသစ် လုပ်ငန်းခွင် အသုံးချသင်တန်း အပတ်စဉ် (၄၂)"));
//        lstmodel.add(new model(R.drawable.n5,"မီးဘေးသင့် ပြည်သူများအားလှူဒါန်းခြင်း"));
//        lstmodel.add(new model(R.drawable.n6,"နွားထိုးကြီး ရုံးခွဲသစ်ဖွင့်လစ်ကြောင်းကြောညာခြင်း"));
//        lstmodel.add(new model(R.drawable.n7,"မအသိအမှတ်ပြုလက်မှတ်များအား ချီးမြှင့်ပေးအပ်ခြင်း"));
//        lstmodel.add(new model(R.drawable.n8,"နမ့်စန်ရုံးခွဲသစ်ဖွင့်လစ်ကြောင်း ကြောညာခြင်း"));
//        lstmodel.add(new model(R.drawable.n9,"အလုပ်သင်အစီအစဉ် အပတ်စဉ် (၁)"));

    }
}