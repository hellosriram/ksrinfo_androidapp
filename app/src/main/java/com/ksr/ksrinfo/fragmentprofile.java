package com.ksr.ksrinfo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class fragmentprofile extends Fragment {

    public int counter;
    Button button, stop;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmentprofile, container, false);


        button = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new CountDownTimer(5000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        textView.setText(String.valueOf(counter));
                        counter++;
                    }

                    public void onFinish() {
                        counter=0;
                        textView.setText(String.valueOf(counter));
                        Intent intent = new Intent(getActivity(), profile.class);
                        startActivity(intent);
                        //textView.setText("Emergency alerted to your neightbours!!");
                    }
                }.start();
            }
        });
        return view;
    }
}
