package com.ksr.ksrinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgot extends AppCompatActivity {

    private EditText email;
    private FirebaseAuth mAuth;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        submit = findViewById(R.id.forgot);
        email = findViewById(R.id.login_email);
        mAuth = FirebaseAuth.getInstance();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String memail = email.getText().toString();

                mAuth.sendPasswordResetEmail(memail).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            // if isSuccessful then done message will be shown
                            // and you can change the password
                            Toast.makeText(forgot.this,"Instructions to reset your password was sent to your email!",Toast.LENGTH_LONG).show();
                            Intent i = new Intent(forgot.this, login.class);
                            startActivity(i);

                        }
                        else {
                            Toast.makeText(forgot.this,"Error Occurred! Try later",Toast.LENGTH_LONG).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(forgot.this,"Error Occured! Try later",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}