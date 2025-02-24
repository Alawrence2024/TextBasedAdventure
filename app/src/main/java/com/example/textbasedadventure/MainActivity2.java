package com.example.textbasedadventure;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.textbasedadventure.Classes.StoryOption;

public class MainActivity2 extends AppCompatActivity {

    Button btnOpt1, btnOpt2, btnOpt3, btnOpt4;
    TextView tvInfo1, tvInfo2, tvInfo3;

    public TextView info, maintext;
    public Button opt1, opt2, opt3, opt4;
    StorySetup setup = new StorySetup();
    public StoryOption currentOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnOpt1 = findViewById(R.id.btnOpt1);
        btnOpt2 = findViewById(R.id.btnSelect);
        btnOpt3 = findViewById(R.id.btnRogue);
        btnOpt4 = findViewById(R.id.btnSorcerer);

        tvInfo1 = findViewById(R.id.tvInfo1);
        tvInfo2 = findViewById(R.id.tvInfo2);
        tvInfo3 = findViewById(R.id.tvInfo3);

        tvInfo1.setText("Hello Welcome to Kerfta");


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
        maintext = findViewById(R.id.tvInfo3);
        info = findViewById(R.id.tvInfo2);
        maintext.setText(currentOption.optionText);
        info.setText(currentOption.optionTitle);

        opt1 = findViewById(R.id.btnOpt1);
        opt2 = findViewById(R.id.btnSelect);
        opt3 = findViewById(R.id.btnRogue);
        opt4 = findViewById(R.id.btnSorcerer);

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

    public void specialOptionSetup(){
        if(currentOption.specialOptionNum == 0) return;

        switch (currentOption.specialOptionNum){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
