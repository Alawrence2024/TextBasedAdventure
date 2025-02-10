package com.example.textbasedadventure.Classes;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class UI {
    Button btnOpt1, btnOpt2, btnOpt3, btnOpt4;

    public UI(Button btnOpt1, Button btnOpt2, Button btnOpt3, Button btnOpt4) {
        this.btnOpt1 = btnOpt1;
        this.btnOpt2 = btnOpt2;
        this.btnOpt3 = btnOpt3;
        this.btnOpt4 = btnOpt4;

        this.btnOpt1.setOnClickListener(v -> onClickOpt1(v));
        this.btnOpt2.setOnClickListener(v -> onClickOpt2(v));
        this.btnOpt3.setOnClickListener(v -> onClickOpt3(v));
        this.btnOpt4.setOnClickListener(v -> onClickOpt4(v));
    }

    // Handle button clicks in UI class
    public void onClickOpt1(View v) {
        showToast(v.getContext(), "Option 1 clicked!");
    }

    public void onClickOpt2(View v) {
        showToast(v.getContext(), "Option 2 clicked!");
    }

    public void onClickOpt3(View v) {
        showToast(v.getContext(), "Option 3 clicked!");
    }

    public void onClickOpt4(View v) {
        showToast(v.getContext(), "Option 4 clicked!");
    }

    private void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
