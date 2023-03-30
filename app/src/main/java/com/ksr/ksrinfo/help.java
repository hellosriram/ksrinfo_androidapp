package com.ksr.ksrinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity {

    Button whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(help.this, web.class);
                intent.putExtra("browserlink","https://wa.me/+919788392054");
                startActivity(intent);
            }
        });

    }
}