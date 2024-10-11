package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView textViewPytanie;
    private Button buttonT;
    private Button buttonN;
    private Button buttonNext;
    private Button buttonHint;
    private ArrayList<Pytanie> pytania = new ArrayList<>();
    private int numerWyswietlanegoPytania = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewPytanie = findViewById(R.id.textViewPytanie);
        buttonT = findViewById(R.id.buttonTak);
        buttonN = findViewById(R.id.buttonNie);
        buttonNext = findViewById(R.id.buttonNext);
        buttonHint = findViewById(R.id.buttonHint);

        pytania.add(new Pytanie("Czy Niedźwiedź polarny je pingwiny?", false,"Zastanów się gdzie każde zwierzę żyje"));
        pytania.add(new Pytanie("Czy żyrafa może polizać się po uchu?", true, "Żyrafy mają bardzo długi język"));
        pytania.add(new Pytanie("Zebry śpią na leżąco?", false, "???"));

        textViewPytanie.setText(pytania.get(0).getTresc());

        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Odpowiedź Tak", Toast.LENGTH_SHORT).show();
            }
        });


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numerWyswietlanegoPytania++;

                if(numerWyswietlanegoPytania == pytania.size()){
                    textViewPytanie.setText("To już koniec quizu.");
                    buttonT.setVisibility(View.INVISIBLE);
                    buttonN.setVisibility(View.INVISIBLE);
                    buttonNext.setVisibility(View.INVISIBLE);
                    buttonHint.setVisibility(View.INVISIBLE);

                }
                else{
                    textViewPytanie.setText(pytania.get(numerWyswietlanegoPytania).getTresc());
                }
            }
        });

    }
}