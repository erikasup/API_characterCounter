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

// Erika Supranavičiūtė  2021
// Character Calculator
// Android Studio version: 4.0

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    EditText edtText;
    public static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Character Calculator");

        btnOk = findViewById(R.id.btnOk);
        edtText = findViewById(R.id.edtText);
        textView = findViewById(R.id.textView);


        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int character = edtText.length();

                String convert = String.valueOf(character);

                textView.setText("Number of characters " + convert);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String nameValue = textView.getText().toString();
                Intent intent = new Intent(MainActivity.this, counter.class);
                intent.putExtra("isvesta", nameValue);
                startActivity(intent);


            }
        });
    }



}