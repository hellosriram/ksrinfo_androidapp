package com.ksr.ksrinfo;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmenthome extends Fragment {
    private CardView deals,orphan, police, hospital, news;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragmenthome, container, false);
        orphan = view.findViewById(R.id.click_orphanage);
        police = view.findViewById(R.id.click_police);
        hospital = view.findViewById(R.id.click_hospital);
        news = view.findViewById(R.id.click_news);
        deals=view.findViewById(R.id.click_todaydeals);
        orphan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), orphanagehome.class);
                startActivity(intent);
            }
        });
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), policehome.class);
                startActivity(intent);
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), hospitalhome.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), newshome.class);
                startActivity(intent);
            }
        });
        deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), dealstoday.class);
                startActivity(intent);
            }
        });

        return view;
    }

}