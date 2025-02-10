package com.example.textbasedadventure;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.textbasedadventure.Classes.UI;

public class MainActivity2 extends AppCompatActivity {

    private UI ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Find buttons from the layout
        Button btnOpt1 = findViewById(R.id.btnOpt1);
        Button btnOpt2 = findViewById(R.id.btnOpt2);
        Button btnOpt3 = findViewById(R.id.btnOpt3);
        Button btnOpt4 = findViewById(R.id.btnOpt4);

        // Initialize the UI class and pass button references
        ui = new UI(btnOpt1, btnOpt2, btnOpt3, btnOpt4);
    }
}
