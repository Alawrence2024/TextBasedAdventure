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
        btnRogue = findViewById(R.id.btnOpt3);
        btnSorcerer = findViewById(R.id.btnOpt4);
        btnSelect = findViewById(R.id.btnOpt2);

        tvCharDescription = findViewById(R.id.tvCharDescription);

        tvCharDescription.setText("Select Your Character");

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

                tvCharDescription.setText("Race: Half-Elf\n" +
                        "Background: Hermit\n" +
                        "Personality: Calm, spiritual, curious\n\n" +
                        "Backstory:\n Raised by druids, the druid is in Kerfta to " +
                        "stop the beast and restore balance to nature. " +
                        "Communicates with the land and the animals.\n\n" +
                        "Role:\n Healer, scout, and shape-shifter, " +
                        "using nature magic to aid the team.");

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

                tvCharDescription.setText("Race: Human\n" +
                        "Background: Soldier\n" +
                        "Personality: Loyal, disciplined, determined\n\n" +
                        "Backstory:\n Former soldier turned mercenary," +
                        " The fighter is here to protect the town from the beast." +
                        " He is driven by a sense of duty and honor.\n\n" +
                        "Role:\n Frontline fighter and tactician, skilled in combat and strategy.");

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

                tvCharDescription.setText("Race: Tiefling\n" +
                        "Background: Urchin\n" +
                        "Personality: Quick-witted, sly, independent\n\n" +
                        "Backstory:\n A street-smart Tiefling who " +
                        "learned magic to get by. He’s here for the " +
                        "mystery and treasure, and to defeat the beast.\n\n" +
                        "Role:\n Sneak, infiltrator, and magical " +
                        "trickster, skilled in stealth and magic.");

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

                tvCharDescription.setText("Race: Dragonborn\n" +
                        "Background: Noble\n" +
                        "Personality: Charismatic, proud, empathetic\n\n" +
                        "Backstory: \nRaised in a noble family with magical blood," +
                        " the sorcerer wants to prove himself by defeating the beast.\n\n" +
                        "Role:\n Magic damage dealer, leader, and diplomat, using fire and arcane spells.");

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
