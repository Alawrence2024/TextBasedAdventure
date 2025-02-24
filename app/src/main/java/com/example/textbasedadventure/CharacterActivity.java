package com.example.textbasedadventure;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.textbasedadventure.Classes.StoryOption;

public class CharacterActivity extends AppCompatActivity {

    Button btnDruid, btnFighter, btnRogue, btnSorcerer, btnSelect;
    TextView tvCharDescription;

    String selectedCharacter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);

        btnDruid = findViewById(R.id.btnDruid);
        btnFighter = findViewById(R.id.btnFighter);
        btnRogue = findViewById(R.id.btnRogue);
        btnSorcerer = findViewById(R.id.btnSorcerer);
        btnSelect = findViewById(R.id.btnSelect);

        tvCharDescription = findViewById(R.id.tvCharDescription);

        // Initialize ImageViews here
        ImageView imageDruid = findViewById(R.id.imageDruid);
        ImageView imageFighter = findViewById(R.id.imageFighter);
        ImageView imageRogue = findViewById(R.id.imageRogue);
        ImageView imageSorcerer = findViewById(R.id.imageSorcerer);

        imageDruid.setVisibility(INVISIBLE);
        imageFighter.setVisibility(INVISIBLE);
        imageRogue.setVisibility(INVISIBLE);
        imageSorcerer.setVisibility(INVISIBLE);

        btnDruid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDruid.setVisibility(VISIBLE);
                imageFighter.setVisibility(INVISIBLE);
                imageRogue.setVisibility(INVISIBLE);
                imageSorcerer.setVisibility(INVISIBLE);

                tvCharDescription.setText("Druid character information");

                selectedCharacter = "Druid";
            }
        });

        btnFighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDruid.setVisibility(INVISIBLE);
                imageFighter.setVisibility(VISIBLE);
                imageRogue.setVisibility(INVISIBLE);
                imageSorcerer.setVisibility(INVISIBLE);

                tvCharDescription.setText("Fighter character information");

                selectedCharacter = "Fighter";
            }
        });

        btnRogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDruid.setVisibility(INVISIBLE);
                imageFighter.setVisibility(INVISIBLE);
                imageRogue.setVisibility(VISIBLE);
                imageSorcerer.setVisibility(INVISIBLE);

                tvCharDescription.setText("Rogue character information");

                selectedCharacter = "Rogue";
            }
        });

        btnSorcerer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDruid.setVisibility(INVISIBLE);
                imageFighter.setVisibility(INVISIBLE);
                imageRogue.setVisibility(INVISIBLE);
                imageSorcerer.setVisibility(VISIBLE);

                tvCharDescription.setText("Sorcerer character information");

                selectedCharacter = "Sorcerer";
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CharacterActivity.this, MainActivity2.class);
                intent.putExtra("selectedCharacter", selectedCharacter);
                startActivity(intent);


            }
        });
    }








}
