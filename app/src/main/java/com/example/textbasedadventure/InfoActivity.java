package com.example.textbasedadventure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    TextView tvInfo;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        tvInfo = findViewById(R.id.tvInfo);

        btnHome = findViewById(R.id.btnHome);

        tvInfo.setText("You are one of four heroes tasked with saving the town of Kerfta from an " +
                "ancient and powerful beast that has been terrorizing the area. The beast has" +
                " caused many to disappear, including the Duke’s daughter, and the townsfolk" +
                " live in fear. The town is on the brink of collapse, and if the beast isn't " +
                "stopped, the town will soon fade into ruin.\n" +
                "\n" +
                "Key Locations:\n" +
                "\n" +
                "The Duke's Castle –\n The Duke mourns the loss of his daughter, whose " +
                "disappearance may be linked to the beast. Seek his guidance to uncover" +
                " more about the creature.\n\n\n" +
                "Kerfta Township –\n A once-vibrant town now in despair. The townsfolk " +
                "are scared, and clues can be gathered from the locals at the Horses Tail Inn," +
                " General Store, and Blacksmith.\n\n\n" +
                "The Hills of Gelyle –\n The creature has been seen in these hills, with signs of " +
                "destruction and missing people.\n\n\n" +
                "County Taren –\n The road leads to Taren, where you may find the Duke’s daughter " +
                "hiding, offering important psychic clues about the beast.\n\n\n" +
                "Mt. Yor’Thune –\n The volcanic mountain rumored to house the beast’s lair, as well" +
                " as a collapsed mine that could be linked to the creature’s origins.\n\n\n" +
                "Goal:\n Track and defeat the beast to save the town and the Duke’s daughter. Unravel" +
                " the mystery of the creature’s psychic link to the Duke’s daughter," +
                " and decide whether to kill the beast or break the link between " +
                "it and the girl.\n\n\n" +
                "\n" +
                "Key NPCs:\n" +
                "\n" +
                "The Duke of Gelyle –\n Mourns the loss of his daughter and seeks help" +
                " from the adventurers.\n\n\n" +
                "The Duke’s Daughter –\n Missing and hiding in fear, she shares a psychic " +
                "connection with the beast.\n\n\n" +
                "Townsfolk –\n Various villagers can offer clues, supplies, and warnings" +
                " about the creature’s movements.\n\n\n\n\n" +
                "" +
                "Good Luck!\n\n\n");

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });




    }
}
