package com.example.maketing_app;

import android.annotation.SuppressLint;
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


public class en_news_fragment extends Fragment {
    View v;
    private RecyclerView myrecyclerView1;
    private List<Contact1> lstcontact1;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_en_news_fragment, container, false);
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

        lstcontact1.add(new Contact1(R.drawable.n1, "2022 Sathapana Head Office Staff Paying Respect to Thitincut","Thetincut month is the second largest Thetincut festival in Myanmar after Thingyan New Year. During the month of Thitincut, Burmese people pay their respects to their parents, teachers, relatives, and elders. This tradition and Buddhist culture has been preserved and practiced for centuries.\n" +
                "\n" +
                "Thasapana staff all over Myanmar practice good customs by showing respect to the elderly.\n" +
                "\n" +
                "This year's festival season."));
        lstcontact1.add(new Contact1(R.drawable.n2,"Corn planting","August 22, 2022, 10:53, general news\n" +
                "\n" +
                "\n" +
                "Maize is one of the most important crops after rice in Myanmar, and it is the main crop in the human food chain. According to published reports, the total area under rice cultivation in Myanmar is about 1.2 million acres, with an annual yield of 2.5 to 2.9 million tons.\n" +
                "\n" +
                "More than 55 percent of agricultural production is in Shan State, and seeds are also sown in Sagaing Region, Karen State, Kachin State, Kayah State, and Irrawaddy Region. About 85 percent of the total cultivated land is planted in the rainy season from May to June and harvested in October to November. The remaining 15 percent is planted as a dry season crop in November and December and harvested in March to April.\n" +
                "\n" +
                "Approximately 40 percent of the output is produced for domestic consumption, such as bread and bakery for the poultry and pig sectors, and domestic distilleries produce alcohol, and the remaining 60 percent is produced in Thailand, Vietnam, China, and India. The rice crop is one of the agricultural products that provide a large foreign exchange inflow for the country.\n" +
                "\n" +
                "SATHAPANA Limited has always encouraged the cultivation of rice, which is an essential crop in Myanmar's agricultural sector.\n" +
                "\n" +
                "SATHAPANA provided total loan amount of 243 billion.\n" +
                "\n" +
                "338 corn farmers in Taunggyi, Aungpang, Bosong, and Namsan\n" +
                "\n" +
                "For rainy season cultivation, Phae Gon, Pyin Lwin and Ba An townships"));
        lstcontact1.add(new Contact1(R.drawable.n3,"rainy rice cultivation","August 18, 2022, 8:41, general news\n" +
                "\n" +
                "Regardless of the challenges, rice is the staple crop consumed daily in Myanmar.\n" +
                "\n" +
                "According to research data, 60% of the average calories and daily nutrient requirements for Myanmar people living in urban and rural areas are obtained from rice. About 50% of the cultivated land is cultivated with rice and it contributes about 40% of the total agricultural output in Myanmar. Rice production contributes about 14% of Myanmar's total GDP.\n" +
                "\n" +
                "SATHAPANA Limited has always encouraged the cultivation of rice, a very important crop for the country's agriculture sector. SATHAPANA has provided 8.825 billion kyats as agricultural loans (only for rice crops) to 8,547 customers throughout Myanmar during this monsoon season from April to July 2022."));
        lstcontact1.add(new Contact1(R.drawable.n4,"New Employee Job Application Training Weekly (42)","July 8, 2022 4:00 PM Training\n" +
                "\n" +
                "From 05th to 07th July 2022, SATHAPANA Limited conducted a New Recruitment Training at its Yangon Head Office. SPNM is aimed at improving employee performance, morale among employees and expanding knowledge of their products and services,"));
        lstcontact1.add(new Contact1(R.drawable.n5,"Donation to fire victims","June 22, 2021 12:57 p.m. Social worker\n" +
                "\n" +
                "Providing social security and benefits to those affected by natural calamities is one of the priorities and policies of SATHAPANA's welfare program. Committed to being an organization that provides social protection to its customers, SATHAPANA Limited waived the loans of 17 customers who lost their businesses during the recent layoffs, to relieve customers of the burden, especially at difficult times in their lives. .\n" +
                "\n" +
                "On May 1, 2021 at 54:00 at Shwe Bo city market, a shooting occurred in Hlaeng U Kam village of Myengmu Township on March 147, 2021.\n" +
                "\n" +
                "Erawati Region, Pathein Township, Kangyi Taung Market and the early morning of June 1, 2021."));
        lstcontact1.add(new Contact1(R.drawable.n6,"New contact information for My Dougyi branch office","May 27, 2021 2:08 PM General News\n" +
                "\n" +
                "Aiming to support community economic development through financial inclusion, SATHAPANA is expanding its business.\n" +
                "\n" +
                "Operation area. In this regard, we are very pleased to announce the opening of the Natogyi branch in May 2021.\n" +
                "\n" +
                "To access our financial services, please contact our offices at the address below.\n" +
                "\n" +
                "Natogyi Branch\n" +
                "\n" +
                "Natogyi Branch (5-C/239), Horse Farm-Yuan Road, No. (5) Ward, Natgyi Township, Mandalay Region,"));
        lstcontact1.add(new Contact1(R.drawable.n7,"Awarding Uncertified Certificates","24 April 2021, Yangon.\n" +
                "\n" +
                "A celebration of hard work, effort and commitment to those who have achieved it,\n" +
                "\n" +
                "Oracle FLEXTCUBE Core Banking System was held today at 11:00 AM at the headquarters of SATHAPANA Limited.\n" +
                "\n" +
                "The Chief Executive Officer (CEO), executive committee members, and management teams attended the ceremony,\n" +
                "\n" +
                "Employees who participated in the project.\n" +
                "\n" +
                "Chief Executive Officer Mr Seang Serey (CEO) said, The successful implementation of this project is a proof that reinforces our commitment to provide valuable financial services and we would like to acknowledge and thank the employees. From various departments who have contributed and dedicated to this core banking pe.\n" +
                "\n" +
                "To be project\n" +
                "\n" +
                "Achieved even in the midst of the Covid-19 pandemic.\n" +
                "\n" +
                "\n" +
                "\n" +
                "With the flexibility and scalability of FLEXCUBE, SATHAPANA Limited will be able to improve its operational efficiency while accelerating.\n" +
                "\n" +
                "Its products and services are rolled out to its loan and deposit customers. The platform will empower the institution to act in real time."));
        lstcontact1.add(new Contact1(R.drawable.n8,"Announcement of the opening of a new branch of Namsan","January 15. 2021,10:03 am General News\n" +
                "\n" +
                "Aiming to support the economic development of the community through financial inclusion, SATHAPANA is expanding its operational area. In this regard, we are very pleased to announce the opening of the Nansam branch between December 2020 and January 2021.\n" +
                "\n" +
                "To access our financial services, contact our offices at the address below.\n" +
                "\n" +
                "Nanhsam Branch\n" +
                "\n" +
                "No. 1/747, Bu Rin Naung Road, No. (1) Ward, Nansong Township, Shan State (South)"));
        lstcontact1.add(new Contact1(R.drawable.n9,"Internship Program Weekly (1)","November 12, 2021 9:48 am ,Training\n" +
                "\n" +
                "Sathapana Limited has successfully nurtured two management trainees as they are always on the lookout for youth enthusiasm and quality.\n" +
                "\n" +
                "For the first time through the Management Trainee Program (Paid Opportunity),\n" +
                "\n" +
                "The trainees were assigned to all departments of Sathapana (Credit, Operations, Marketing, HR, IT and MIS, Administration, Finance, Risk and Compliance, Intemal Audit). They worked and learned and gained valuable experience and knowledge.\n" +
                "\n" +
                "Sathapana Limited Management Trainee Program is a golden opportunity for graduates and sincerely welcome from Sathapana"));
    }
}