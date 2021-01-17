package com.example.charactercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Erika Supranavičiūtė  2021
// Character Calculator
// Android Studio version: 4.0

public class counter extends AppCompatActivity {

    TextView textView2;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        textView2 = findViewById(R.id.textView2);
        btnBack = findViewById(R.id.btnBack);

        textView2.setText(" " +getIntent().getStringExtra("isvesta"));


        setTitle("Character Counter");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}