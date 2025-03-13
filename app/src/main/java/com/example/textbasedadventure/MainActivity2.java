package com.example.textbasedadventure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.textbasedadventure.Classes.DndClasses.ClassBase;
import com.example.textbasedadventure.Classes.DndClasses.Druid;
import com.example.textbasedadventure.Classes.DndClasses.Fighter;
import com.example.textbasedadventure.Classes.DndClasses.Rogue;
import com.example.textbasedadventure.Classes.DndClasses.Sorcerer;
import com.example.textbasedadventure.Classes.PlayerStats;
import com.example.textbasedadventure.Classes.SkillChecks;
import com.example.textbasedadventure.Classes.StoryOption;

public class MainActivity2 extends AppCompatActivity {

    Button btnOpt1, btnOpt2, btnOpt3, btnOpt4;
    TextView tvInfo1, tvInfo2, tvInfo3;

    public TextView info, maintext;
    public Button opt1, opt2, opt3, opt4;
    StorySetup setup = new StorySetup();
    public StoryOption currentOption;
    PlayerStats playerStats = new PlayerStats();
    SkillChecks skillChecks = new SkillChecks();


    String selectedCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        selectedCharacter = bundle.getString("selectedCharacter");

        try {
            initializePlayerStats(selectedCharacter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        btnOpt1 = findViewById(R.id.btnOpt1);
        btnOpt2 = findViewById(R.id.btnOpt2);
        btnOpt3 = findViewById(R.id.btnOpt3);
        btnOpt4 = findViewById(R.id.btnOpt4);

        tvInfo1 = findViewById(R.id.tvInfo1);
        tvInfo2 = findViewById(R.id.tvInfo2);
        tvInfo3 = findViewById(R.id.tvInfo3);

        tvInfo1.setText("Welcome to Kerfta");
        tvInfo2.setText("Character Selected: " + selectedCharacter);


        setup.adjustStoryBasedOnCharacter(selectedCharacter);

        currentOption = StorySetup.startNode;

        updateView();
    }

    private void initializePlayerStats(String characterClass) throws Exception {
        switch (characterClass) {
            case "Druid":
                ClassBase Druid = new Druid(skillChecks.StrengthCheck(1),
                        skillChecks.DexterityCheck(2),
                        3, 5, 5,
                        6, 7, 8);
                playerStats = new PlayerStats(100, Druid, 0);
                break;
            case "Fighter":
                ClassBase Fighter = new Fighter(4, 4,
                        3, 4, 5,
                        6, 7, 8);
                playerStats = new PlayerStats(80, Fighter, 0);
                break;
            case "Rogue":
                ClassBase Rogue = new Rogue(4, 4,
                        3, 4, 5,
                        6, 7, 8);
                playerStats = new PlayerStats(90, Rogue, 0);
                break;
            default:
                ClassBase Sorcerer = new Sorcerer(4, 4,
                        3, 4, 5,
                        6, 7, 8);
                playerStats = new PlayerStats(100, Sorcerer, 0);
                break;
        }

    }

    public void option1(View view) {
        currentOption = currentOption.GetNextOptions().get(0);
        updateView();
    }

    public void option2(View view) {
        currentOption = currentOption.GetNextOptions().get(1);
        updateView();
    }

    public void option3(View view) {
        currentOption = currentOption.GetNextOptions().get(2);
        updateView();
    }

    public void option4(View view) {
        currentOption = currentOption.GetNextOptions().get(3);
        updateView();
    }

    public void updateView() {




        //applies reputation and health changes both positve and negative
        currentOption.applyStatChanges();


        maintext = findViewById(R.id.tvInfo3);
        info = findViewById(R.id.tvInfo2);
        maintext.setText("\n" + currentOption.optionText);
        info.setText("Option: " + currentOption.optionTitle);

        opt1 = findViewById(R.id.btnOpt1);
        opt2 = findViewById(R.id.btnOpt2);
        opt3 = findViewById(R.id.btnOpt3);
        opt4 = findViewById(R.id.btnOpt4);

        opt1.setVisibility(View.VISIBLE);
        opt2.setVisibility(View.VISIBLE);
        opt3.setVisibility(View.VISIBLE);
        opt4.setVisibility(View.VISIBLE);

        if (currentOption.GetNextOptions().size() == 0) {
            // If there are no next options (end of story), show play again or home button
            opt1.setVisibility(View.INVISIBLE);
            opt2.setVisibility(View.INVISIBLE);
            opt3.setVisibility(View.INVISIBLE);
            opt4.setText("Play Again");
            opt4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetGame(); // Reset the game
                }
            });
        } else {
            // Update the options normally
            switch (currentOption.GetNextOptions().size()) {
                case 1:
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    opt1.setText(currentOption.GetNextOptions().get(0).optionTitle);
                    break;
                case 2:
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    opt1.setText(currentOption.GetNextOptions().get(0).optionTitle);
                    opt2.setText(currentOption.GetNextOptions().get(1).optionTitle);
                    break;
                case 3:
                    opt4.setVisibility(View.INVISIBLE);
                    opt1.setText(currentOption.GetNextOptions().get(0).optionTitle);
                    opt2.setText(currentOption.GetNextOptions().get(1).optionTitle);
                    opt3.setText(currentOption.GetNextOptions().get(2).optionTitle);
                    break;
                case 4:
                    opt1.setText(currentOption.GetNextOptions().get(0).optionTitle);
                    opt2.setText(currentOption.GetNextOptions().get(1).optionTitle);
                    opt3.setText(currentOption.GetNextOptions().get(2).optionTitle);
                    opt4.setText(currentOption.GetNextOptions().get(3).optionTitle);
                    break;
                default:
                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.VISIBLE);
                    opt4.setText("Home");
                    opt4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            resetGame(); // Go back to the main menu or reset the game
                        }
                    });
                    break;
            }
        }
    }

    public void resetGame() {
        StorySetup setup = new StorySetup();
        StorySetup.startNode = new StoryOption();
        currentOption = StorySetup.startNode;

        selectedCharacter = "";

        tvInfo1.setText("Welcome to Kerfta");
        tvInfo2.setText("Character Selected: " + selectedCharacter);
        tvInfo3.setText("");

        btnOpt1.setVisibility(View.VISIBLE);
        btnOpt2.setVisibility(View.VISIBLE);
        btnOpt3.setVisibility(View.VISIBLE);
        btnOpt4.setVisibility(View.VISIBLE);

        btnOpt1.setText("Start Your Journey");
        btnOpt2.setText("Option 2");
        btnOpt3.setText("Option 3");
        btnOpt4.setText("Option 4");


        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }


    public void specialOptionSetup() {
        if (currentOption.specialOptionNum == 0) return;

        switch (currentOption.specialOptionNum) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
