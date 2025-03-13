package com.example.textbasedadventure.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class StoryOption {

    public String optionTitle;
    public String optionText;
    private List<StoryOption> nextOptions;

    public int healthDrain;

    public int reputationChange;
    public int requiredHp;
    public String requiredClass;
    public int requiredReputation;

    public int specialOptionNum;



    public List<StoryOption> GetNextOptions() {
        List<StoryOption> validOptions = new ArrayList<>();
        for (StoryOption option : nextOptions) {
            if (option.optionIsValid()) {
                validOptions.add(option);
            }
        }

        if (validOptions.size() > 4){
            Collections.shuffle(validOptions);
        }
        return validOptions;
    }

    public List<StoryOption> getNextOptionsOrdered() {
        return nextOptions;
    }


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

    public StoryOption(String optionTitle, String optionText, int healthDrain, int reputationChange, String requiredClass, int requiredHp, int requiredReputation) {
        this.optionTitle = optionTitle;
        this.optionText = optionText;
        this.healthDrain = healthDrain;
        this.reputationChange = reputationChange;
        this.requiredClass = requiredClass;
        this.requiredHp = requiredHp;
        this.requiredReputation = requiredReputation;
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

    private void applyHealthDrain() {
            PlayerStats.updateHealth(-healthDrain);
    }

    private void applyReputationChange() {
        PlayerStats.updateReputation(reputationChange);
    }

    public void applyStatChanges(){
        applyHealthDrain();
        applyReputationChange();
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
