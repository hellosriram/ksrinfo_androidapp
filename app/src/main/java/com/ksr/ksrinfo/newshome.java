package com.ksr.ksrinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newshome extends AppCompatActivity {

    private Button Buttonlocal, Buttonindian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newshome);

        Buttonlocal = findViewById(R.id.localnews);
        Buttonindian = findViewById(R.id.indianews);

        Buttonindian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(newshome.this, indianews.class);
                startActivity(i);
            }
        });
        Buttonlocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(newshome.this, localnews.class);
                startActivity(i);
            }
        });

    }
}