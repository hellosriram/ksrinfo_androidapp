package com.ksr.ksrinfo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class localnews extends AppCompatActivity
{
    RecyclerView recview;
    localnewsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localnews);



        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<localnewsList> options =
                new FirebaseRecyclerOptions.Builder<localnewsList>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("news/localnews" +
                                ""), localnewsList.class)
                        .build();

        adapter=new localnewsAdapter(options);
        recview.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}