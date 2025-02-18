package com.example.textbasedadventure.Classes;

import java.util.ArrayList;

public class StoryOption {

    public StoryOption(String optionTitle, String optionText) {
        this.optionTitle = optionTitle;
        this.optionText = optionText;
    }
    public StoryOption() {}

    public ArrayList<StoryOption> nextOptions = new ArrayList<>();
    public String optionTitle;
    public String optionText;
}
