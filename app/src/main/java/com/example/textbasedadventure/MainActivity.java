package com.example.textbasedadventure;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.textbasedadventure.Classes.StoryOption;

public class MainActivity extends AppCompatActivity {



    public TextView info, maintext;
    public Button opt1, opt2, opt3, opt4;
    StorySetup setup = new StorySetup();
    public StoryOption currentOption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        currentOption = StorySetup.startNode;
        updateView();

    }



    public void option1(View view) {
        currentOption = currentOption.nextOptions.get(0);
        updateView();
    }

    public void option2(View view) {
        currentOption = currentOption.nextOptions.get(1);
        updateView();
    }

    public void option3(View view) {
        currentOption = currentOption.nextOptions.get(2);
        updateView();

    }

    public void option4(View view) {
        currentOption = currentOption.nextOptions.get(3);
        updateView();
    }

    public void updateView(){
        maintext = findViewById(R.id.TVDialog);
        info = findViewById(R.id.TVInfo);
        maintext.setText(currentOption.optionText);
        info.setText(currentOption.optionTitle);

        opt1 = findViewById(R.id.btnOpt1);
        opt2 = findViewById(R.id.btnOpt2);
        opt3 = findViewById(R.id.btnOpt3);
        opt4 = findViewById(R.id.btnOpt4);

        opt1.setVisibility(View.VISIBLE);
        opt2.setVisibility(View.VISIBLE);
        opt3.setVisibility(View.VISIBLE);
        opt4.setVisibility(View.VISIBLE);


        switch (currentOption.nextOptions.size()){
            case 1:
                opt2.setVisibility(View.INVISIBLE);
                opt3.setVisibility(View.INVISIBLE);
                opt4.setVisibility(View.INVISIBLE);


                opt1.setText(currentOption.nextOptions.get(0).optionTitle);
                break;
            case 2:
                opt3.setVisibility(View.INVISIBLE);
                opt4.setVisibility(View.INVISIBLE);

                opt1.setText(currentOption.nextOptions.get(0).optionTitle);
                opt2.setText(currentOption.nextOptions.get(1).optionTitle);
                break;
            case 3:

                opt4.setVisibility(View.INVISIBLE);

                opt1.setText(currentOption.nextOptions.get(0).optionTitle);
                opt2.setText(currentOption.nextOptions.get(1).optionTitle);
                opt3.setText(currentOption.nextOptions.get(2).optionTitle);
                break;
            case 4:
                opt1.setText(currentOption.nextOptions.get(0).optionTitle);
                opt2.setText(currentOption.nextOptions.get(1).optionTitle);
                opt3.setText(currentOption.nextOptions.get(2).optionTitle);
                opt4.setText(currentOption.nextOptions.get(3).optionTitle);

                break;
                default:

                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    break;
        }


    }
}