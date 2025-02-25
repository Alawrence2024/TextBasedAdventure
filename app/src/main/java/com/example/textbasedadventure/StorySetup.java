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
        startNode.optionText = "Arriving in town you see signs of a once lively sprawl, deserted market stalls like the streets, children’s toys lay discarded in the street. As you walk through the town’s modest square you feel the eyes of suspicious onlookers as daggers upon your backs. One brave soul works up the courage to confront you and your compatriots “What be your business? Be quick with it and go. This town has had too much trouble for adventurers like yourselves to attract more.";


        //Blacksmith tree
        StoryOption townBlacksmith = new StoryOption("We are just looking for a blacksmith", "The blacksmith lives at the edge of town. You lot will be a sight for sore eyes. Hasn’t had much business since things began");
        StoryOption townSmithTransition = new StoryOption("Continue", "You can always hear a smithy before you see it. The familiar clang of steel being molded to the will of the smith’s hammer echoes through your ears. You approach a tall figure perfecting their craft. \n\n" + "“Looking for some protection adventurer?” A bulky woman covered in many a scar inquires.");
        StoryOption blacksmith = new StoryOption("“Our blades are proficient, but we could all use some new armor. Ours are on their last legs”", "“Had a run in with the beast then? Tell me was it hairy or scaly, I’ve got a wager to win. Oh what am I saying you wouldn’t be alive if you’d seen it. Sorry, I can’t do much for you. A cave in at the mine of Mt. Yor’Thune has left me without workable ore.”");
        StoryOption blacksmithYorthuneTransition = new StoryOption("Go to Mt. Yor'Thune", "Mt. Yor’thune, a towering spire of earth, juts out from the worlds crust. It’s white peaks, loom over you if only to remind you that you’re place in this life is insignificant. A caved in mineshaft is framed by the base of the mountain.");

        startNode.nextOptions.add(townBlacksmith);
        startNode.nextOptions.get(0).nextOptions.add(townSmithTransition);
        startNode.nextOptions.get(0).nextOptions.get(0).nextOptions.add(blacksmith);
        startNode.nextOptions.get(0).nextOptions.get(0).nextOptions.get(0).nextOptions.add(blacksmithYorthuneTransition);

        //Horses Tail inn tree
        StoryOption townInn = new StoryOption("We need a place to stay the night", "“The Horses Tail might still be open. But don’t think of staying too long, adventurers attract all sorts of mischief.”");
        StoryOption townInnTransition = new StoryOption("Continue", "A pitiful trail of smoke trails from the chimney of this cozy downtown inn. Though it’s windows are boarded up you see a small sign swinging in the light breeze “VACANCY“. You enter hoping to find some shelter for the night.\n\n" + "“Oh. Dear, we’ve guests!” A kind elderly looking woman beacons to her portly husband crouched behind the bar. “Will you be staying with us this evening?”");
        StoryOption inn = new StoryOption("We were hoping to rest here the night, but it seems rather unsafe?", "Yes, admittedly things haven’t be as peaceful as they usually are. You see people have been going missing lately. Most say something about a hairy monster that lives in the nearby forest and comes at dusk. Though I’m not sure anyone has lived to properly see the creature. But I assure you this humble inn of ours is the safest place to be tonight.");
        StoryOption innStay = new StoryOption("Stay the night","While you are fast asleep the beast stealthy climbs into your rooms window and carries you off never to be seen again.");

        startNode.nextOptions.add(townInn);
        startNode.nextOptions.get(1).nextOptions.add(townInnTransition);
        startNode.nextOptions.get(1).nextOptions.get(0).nextOptions.add(inn);
        startNode.nextOptions.get(1).nextOptions.get(0).nextOptions.get(0).nextOptions.add(innStay);

        //General Store tree
        StoryOption townGeneralStore = new StoryOption("We are looking for supplies", "“General store still has some supplies, I think. Best hurry before their bought up”");
        StoryOption townStoreTransition = new StoryOption("Continue", "A well-kept general store sits before you, and general it is. You could swear you’ve seen this exact store a dozen times or more on your travels. You enter, hoping that they have at least some trail rations left in stock.\n\n" + "“What ever it is, we’re OUT” A scraggly bearded man proclaims as the door opens. “Ah adventurers, ignore what I just said. I’m sure I can find something you’d be interested in.”");
        StoryOption generalStore = new StoryOption("“We were in the market for some trail rations, though it looks you couldn’t find even a mere crumb here. Where have all your wares gone?”", "“I have to admit, it’s true. Haven’t been able to get the supply wagons through. They’re too scared the creature that stalks the Hills of Gelyle will snatch their horses right from under them. Truly it’s not that far, once you past the forest you could make your way through the hills and get supplies in the town next over.”");
        StoryOption storeForestTransition = new StoryOption("Head to the forest", "The Gelyian Woods sits in the center of the county, providing travelers with plentiful shade and refuge from the rain. As you approach you see several fallen trees and deep scratch marks on their bark. One particularly large tree lay in your path. ");

        startNode.nextOptions.add(townGeneralStore);
        startNode.nextOptions.get(2).nextOptions.add(townStoreTransition);
        startNode.nextOptions.get(2).nextOptions.get(0).nextOptions.add(generalStore);
        startNode.nextOptions.get(2).nextOptions.get(0).nextOptions.get(0).nextOptions.add(storeForestTransition);



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
        StoryOption townInfoOption = new StoryOption("Blacksmith", "You inquire about the strange happenings in the forest, sensing a disturbance in nature.");
        StoryOption townInfoBeast = new StoryOption("Ask about the beast", "You ask the townsfolk about the beast, hoping to understand its origins.");


        // Blacksmith Options for Druid
        StoryOption blacksmithInteraction = new StoryOption("Speak with the Blacksmith", "The Blacksmith seems busy but notices your druidic attire and asks if you can assist with repairing his enchanted tools.");
        startNode.nextOptions.get(1).nextOptions.add(blacksmithInteraction);

        // Duke's Castle Options for Druid
        StoryOption dukeIntro = new StoryOption("Speak with the Duke", "The Duke recognizes you as a druid and offers his help, suggesting that the beast might be connected to dark magic in the forest.");
        startNode.nextOptions.get(2).nextOptions.add(dukeIntro);
        StoryOption leaveDuke = new StoryOption("Leave", "The Duke was concerned by you leaving suddenly");
        startNode.nextOptions.get(2).nextOptions.add(leaveDuke);
        StoryOption test = new StoryOption("test", "test");
        startNode.nextOptions.get(2).nextOptions.add(test);
        StoryOption test2 = new StoryOption("test2", "test2");
        startNode.nextOptions.get(2).nextOptions.get(2).nextOptions.add(test2);
        StoryOption test2alt = new StoryOption("test2alt", "test2alt");
        startNode.nextOptions.get(2).nextOptions.get(2).nextOptions.add(test2alt);
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
        StoryOption townInfoOptionRogue = new StoryOption("Trouble?", "Aye a ghastly beast has accosted the town for nearly a fortnight. If we keep to ourselves and stay inside the casualties aren’t as bad\\n\\n" + "f you insist on bringing this town more misery speak to the duke. Now off with yeh!");
        StoryOption townCastleTransition = new StoryOption("Continue", "By all accords this must be the smallest castle you’ve seen on your journeys. Though even the most destitute noble is still a noble. A pair of guards escort you into an extensively decorated main hall. Before you sits the Duke of Gelyle, a thin man for his position with a young physique. He sits with his head in his hand, a torn bright red cloth clutched in his right hand. Noticing he sobs: \n\n" + "What business do people of fortune have in my county? I have no time for you, can’t you see I am in mourning?");
        StoryOption wineDine = new StoryOption("Wine and dine the duke","My daughter, the apple of my eye, I can’t believe she’s gone. That horrid thing, dragging her off to its lair. Not to mention some of the townsfolk spreading the rumor that I did such a horrible thing. \\n\\n" +  "Something seems off about the way he speaks, you can hear it in his voice. He is trying too hard to make a point that it couldn’t be him.");

        // Duke's Castle Options for Rogue
        startNode.nextOptions.add(townInfoOptionRogue);
        startNode.nextOptions.get(3).nextOptions.add(townCastleTransition);
        startNode.nextOptions.get(3).nextOptions.get(0).nextOptions.add(wineDine);
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
