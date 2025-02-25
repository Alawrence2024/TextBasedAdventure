package com.example.textbasedadventure.Classes;

import java.util.ArrayList;
import java.util.List;

public class StoryOption {

    public String optionTitle;
    public String optionText;
    public List<StoryOption> nextOptions;

    public int specialOptionNum;

    public StoryOption(String optionTitle, String optionText) {
        this.optionTitle = optionTitle;
        this.optionText = optionText;
        this.nextOptions = new ArrayList<>();
        this.specialOptionNum = 0;
    }

    public StoryOption() {
        this.optionTitle = "";
        this.optionText = "";
        this.nextOptions = new ArrayList<>();
        this.specialOptionNum = 0;
    }

    public void addNextOption(StoryOption option) {
        this.nextOptions.add(option);
    }

    public void setSpecialOption(int optionType) {
        this.specialOptionNum = optionType;
    }

    public boolean isEndgameOption() {
        return this.optionTitle.equals("Victory") || this.optionTitle.equals("Failure");
    }

    public static StoryOption createEndgameOption(String title, String description) {
        StoryOption endOption = new StoryOption(title, description);
        endOption.specialOptionNum = 99;
        return endOption;
    }
}
