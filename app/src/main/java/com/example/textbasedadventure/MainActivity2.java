package com.example.textbasedadventure;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button btnOpt1, btnOpt2, btnOpt3, btnOpt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnOpt1 = findViewById(R.id.btnOpt1);
        btnOpt2 = findViewById(R.id.btnOpt2);
        btnOpt3 = findViewById(R.id.btnOpt3);
        btnOpt4 = findViewById(R.id.btnOpt4);

        btnOpt1.setOnClickListener(v -> {
            // Handle button click
        });

        btnOpt2.setOnClickListener(v -> {
            // Handle button click
        });

        btnOpt3.setOnClickListener(v -> {
            // Handle button click
        });

        btnOpt4.setOnClickListener(v -> {
            // Handle button click
        });


    }
}
