package com.ksr.ksrinfo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.CountDownTimer;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Toast.makeText(profile.this, "hi", Toast.LENGTH_SHORT).show();
            }
        };
        //requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);

    }
}