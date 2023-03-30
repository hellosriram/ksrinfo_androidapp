package com.ksr.ksrinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    private Button needhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        needhelp = findViewById(R.id.needhelp);
        needhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(about.this, help.class);
                startActivity(i);
            }
        });
    }
}