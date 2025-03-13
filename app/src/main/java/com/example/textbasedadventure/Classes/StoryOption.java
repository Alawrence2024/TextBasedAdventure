package com.example.textbasedadventure.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoryOption {

    public String optionTitle;
    public String optionText;
    public List<StoryOption> nextOptions;

    public int healthDrain;
    public int requiredHp;
    public String requiredClass;
    public int requiredReputation;

    public int specialOptionNum;

    public StoryOption(String optionTitle, String optionText) {
        this.optionTitle = optionTitle;
        this.optionText = optionText;
        this.nextOptions = new ArrayList<>();
        this.specialOptionNum = 0;
        this.healthDrain = 0;
        this.requiredHp = 0;
        this.requiredClass = "";
        this.requiredReputation = 0;
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

    public boolean optionIsValid() {
        if (requiredHp > 0 && PlayerStats.hp < requiredHp) {
            return false;
        }
        if (!requiredClass.isEmpty() && !PlayerStats.playerClass.equals(requiredClass)) {
            return false;
        }
        if (requiredReputation > 0 && PlayerStats.reputation < requiredReputation) {
            return false;
        }
        return true;
    }

    public void applyHealthDrain() {
        if (healthDrain > 0) {
            PlayerStats.updateHealth(-healthDrain);
        }
    }

    public static List<StoryOption> getNextOptions(List<StoryOption> options) {
        List<StoryOption> validOptions = new ArrayList<>();
        for (StoryOption option : options) {
            if (option.optionIsValid()) {
                validOptions.add(option);
            }
        }

        if (validOptions.size() > 4) {
            Random rand = new Random();
            for (int i = 0; i < validOptions.size(); i++) {
                int j = rand.nextInt(validOptions.size());
                StoryOption temp = validOptions.get(i);
                validOptions.set(i, validOptions.get(j));
                validOptions.set(j, temp);
            }
        }
        return validOptions;
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
