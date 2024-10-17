package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);

        textView.findViewById(R.id.textView);
        String podpowiedz = getIntent().getStringExtra("PODPOWIEDZ");
        textView.setText(podpowiedz);
    }
}