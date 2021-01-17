// Erika Supranavičiūtė  2021
// Character Calculator
// Android Studio version: 4.1.1

package com.example.charactercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText edtText;
     TextView textView;
     Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Character Calculator");


        edtText = findViewById(R.id.edtText);
        textView = findViewById(R.id.textView);
        btnClear = findViewById(R.id.btnClear);


        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int character = edtText.length();

                String convert = String.valueOf(character);

                textView.setText("Number of characters: " + convert);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtText.setText(""); // Button clear text area
            }
        });
    }



}