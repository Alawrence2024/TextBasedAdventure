package com.example.textbasedadventure.Classes.DndClasses;

import java.util.Random;

public class Fighter extends ClassBase {

    public Fighter(int strength, int dexterity, int constitution, int wisdom, int intelligence, int charisma, int classLevel, int armorClass) throws Exception {
        setClassName("Fighter");
        setClassLevel(classLevel);
        setStrength(strength);
        setStrengthModifier();
        setDexterity(dexterity);
        setDexterityModifier();
        setConstitution(constitution);
        setConstitutionModifier();
        setWisdom(wisdom);
        setWisdomModifier();
        setIntelligence(intelligence);
        setIntelligenceModifier();
        setCharisma(charisma);
        setCharismaModifier();
        setProficiencyBonus();
        setArmorClass(armorClass);
        setHitdiceSides();
        setHitDiceNumber();
        setHitPoints();
    }

    @Override
    void setHitdiceSides() {
        hitDiceSides = "d10";
    }

    /**
     * Generates a random number 0-19
     * if number is 0, sets it to 1
     * Adds current level to the random number
     * updates the hit points with the result
     */
    public void secondWind(){
        Random rand = new Random();
        int d10Roll = rand.nextInt(11);
        if (d10Roll == 0){
            d10Roll = 1;
        }
        int healing = d10Roll + getClassLevel();
        updateHitPoints(getHitPoints(), healing);
    }
}
