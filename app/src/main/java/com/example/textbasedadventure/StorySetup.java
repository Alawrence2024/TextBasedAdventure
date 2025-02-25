package com.example.textbasedadventure;

import com.example.textbasedadventure.Classes.*;
import com.example.textbasedadventure.Classes.DndClasses.*;

public class StorySetup {
    public static StoryOption startNode = new StoryOption();
    public static ClassBase playerClass;
    public static StoryOption finalBattleNode = new StoryOption();
    public static StoryOption victoryNode = new StoryOption();
    public static StoryOption failureNode = new StoryOption();

    public StorySetup() {
        startNode.optionTitle = "Journey's Start";
        startNode.optionText = "You have arrived in the town of Kerfta, where strange happenings have occurred. Choose your next move wisely.";

        StoryOption townSquareOption = new StoryOption("Speak with the townsfolk", "The locals seem uneasy, but perhaps one of them can provide useful information.");
        StoryOption blacksmithOption = new StoryOption("Visit the Blacksmith", "You might be able to gather more supplies for your journey.");
        StoryOption dukeCastleOption = new StoryOption("Go to the Duke's Castle", "The Duke might have more information about the beast haunting the town.");

        startNode.nextOptions.add(townSquareOption);
        startNode.nextOptions.add(blacksmithOption);
        startNode.nextOptions.add(dukeCastleOption);

        finalBattleNode.optionTitle = "Final Battle";
        finalBattleNode.optionText = "You have reached the beast's lair. It's time to face the monster that has haunted this town.";

        StoryOption fightOption = new StoryOption("Fight the Beast", "You choose to fight the beast head-on with the weapon and supplies you've gathered.");
        StoryOption retreatOption = new StoryOption("Retreat", "You choose to retreat and leave the town, leaving the beast to terrorize Kerfta.");

        finalBattleNode.nextOptions.add(fightOption);
        finalBattleNode.nextOptions.add(retreatOption);
    }

    // A method to add class-specific options to avoid repeating code
    private void addClassOptions(String character) {
        if ("Druid".equals(character)) {
            updateClassStory("As a druid, you feel the pulse of the land and are drawn to the strange happenings in Kerfta. The locals might need your help.");
            addDruidOptions();
        } else if ("Fighter".equals(character)) {
            updateClassStory("As a seasoned fighter, you walk into Kerfta with a sense of duty to protect the town from the beast. Your skills might be needed here.");
            addFighterOptions();
        } else if ("Rogue".equals(character)) {
            updateClassStory("As a sly rogue, you see Kerfta as both an opportunity and a mystery. The beast could be a valuable target for treasure.");
            addRogueOptions();
        } else if ("Sorcerer".equals(character)) {
            updateClassStory("As a noble sorcerer, your magical powers are your greatest asset. The beast might hold some ancient magical secret.");
            addSorcererOptions();
        }
    }

    private void updateClassStory(String storyText) {
        startNode.optionText = storyText;
    }

    // Druid-specific options
    private void addDruidOptions() {
        StoryOption townInfoOption = new StoryOption("Ask about the forest", "You inquire about the strange happenings in the forest, sensing a disturbance in nature.");
        StoryOption townInfoBeast = new StoryOption("Ask about the beast", "You ask the townsfolk about the beast, hoping to understand its origins.");
        startNode.nextOptions.get(0).nextOptions.add(townInfoOption);
        startNode.nextOptions.get(0).nextOptions.add(townInfoBeast);

        // Blacksmith Options for Druid
        StoryOption blacksmithInteraction = new StoryOption("Speak with the Blacksmith", "The Blacksmith seems busy but notices your druidic attire and asks if you can assist with repairing his enchanted tools.");
        startNode.nextOptions.get(1).nextOptions.add(blacksmithInteraction);

        // Duke's Castle Options for Druid
        StoryOption dukeIntro = new StoryOption("Speak with the Duke", "The Duke recognizes you as a druid and offers his help, suggesting that the beast might be connected to dark magic in the forest.");
        startNode.nextOptions.get(2).nextOptions.add(dukeIntro);
        StoryOption leaveDuke = new StoryOption("Leave", "The Duke was concerned by you leaving suddenly");
        startNode.nextOptions.get(2).nextOptions.add(leaveDuke);
    }

    // Fighter-specific options
    private void addFighterOptions() {
        StoryOption townInfoOptionFighter = new StoryOption("Ask about the beast", "You ask the townsfolk about the beast's whereabouts, offering your services to protect them.");
        StoryOption townInfoQuest = new StoryOption("Ask about quests", "The townsfolk mention a quest to eliminate the beast, but they need a skilled warrior like you.");
        startNode.nextOptions.get(0).nextOptions.add(townInfoOptionFighter);
        startNode.nextOptions.get(0).nextOptions.add(townInfoQuest);

        // Blacksmith Options for Fighter
        StoryOption blacksmithInteractionFighter = new StoryOption("Speak with the Blacksmith", "The Blacksmith gives you a discount on gear after hearing you're a fighter, preparing you for battle.");
        startNode.nextOptions.get(1).nextOptions.add(blacksmithInteractionFighter);

        // Duke's Castle Options for Fighter
        StoryOption dukeIntroFighter = new StoryOption("Speak with the Duke", "The Duke sees the fighter's armor and trusts you as a soldier, offering you a weapon to fight the beast.");
        startNode.nextOptions.get(2).nextOptions.add(dukeIntroFighter);
        StoryOption leaveDuke = new StoryOption("Leave", "The Duke was concerned by you leaving suddenly");
        startNode.nextOptions.get(2).nextOptions.add(leaveDuke);
    }

    // Rogue-specific options
    private void addRogueOptions() {
        StoryOption townInfoOptionRogue = new StoryOption("Ask about the beast", "You ask the townsfolk if they have any information on the beast's treasure hoard.");
        StoryOption townInfoSecrets = new StoryOption("Ask about secrets", "You listen carefully to the rumors, hoping to learn something that others might have missed.");
        startNode.nextOptions.get(0).nextOptions.add(townInfoOptionRogue);
        startNode.nextOptions.get(0).nextOptions.add(townInfoSecrets);

        // Blacksmith Options for Rogue
        StoryOption blacksmithInteractionRogue = new StoryOption("Speak with the Blacksmith", "The Blacksmith eyes you warily but offers you a set of lockpicks and light armor, perfect for sneaking past the beast.");
        startNode.nextOptions.get(1).nextOptions.add(blacksmithInteractionRogue);

        // Duke's Castle Options for Rogue
        StoryOption dukeIntroRogue = new StoryOption("Speak with the Duke", "The Duke seems curious about your skills as a rogue, offering a special reward for anyone who can sneak past the beast's defenses.");
        startNode.nextOptions.get(2).nextOptions.add(dukeIntroRogue);
        StoryOption leaveDuke = new StoryOption("Leave", "The Duke was concerned by you leaving suddenly");
        startNode.nextOptions.get(2).nextOptions.add(leaveDuke);
    }

    // Sorcerer-specific options
    private void addSorcererOptions() {
        StoryOption townInfoOptionSorcerer = new StoryOption("Ask about the magical disturbances", "You ask the townsfolk if there have been any magical disturbances connected to the beast.");
        StoryOption townInfoArcane = new StoryOption("Ask about arcane magic", "The locals mention strange arcane symbols near the beast’s lair. Perhaps magic is the key to defeating it.");
        startNode.nextOptions.get(0).nextOptions.add(townInfoOptionSorcerer);
        startNode.nextOptions.get(0).nextOptions.add(townInfoArcane);

        // Blacksmith Options for Sorcerer
        StoryOption blacksmithInteractionSorcerer = new StoryOption("Speak with the Blacksmith", "The Blacksmith shows you an enchanted amulet, believing that your sorcerous powers might help unlock its true potential.");
        startNode.nextOptions.get(1).nextOptions.add(blacksmithInteractionSorcerer);

        // Duke's Castle Options for Sorcerer
        StoryOption dukeIntroSorcerer = new StoryOption("Speak with the Duke", "The Duke is intrigued by your magical abilities and suggests that magic could be the only way to defeat the beast.");
        startNode.nextOptions.get(2).nextOptions.add(dukeIntroSorcerer);
        StoryOption leaveDuke = new StoryOption("Leave", "The Duke was concerned by you leaving suddenly");
        startNode.nextOptions.get(2).nextOptions.add(leaveDuke);
    }

    public void adjustStoryBasedOnCharacter(String character) {
        addClassOptions(character);
    }




}
