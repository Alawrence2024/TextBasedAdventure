package com.example.textbasedadventure.Classes.DndClasses;

public class Sorcerer extends ClassBase {

    public Sorcerer(int strength, int dexterity, int constitution, int wisdom, int intelligence, int charisma, int classLevel, int armorClass) throws Exception {
        setClassName("Sorcerer");
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
        hitDiceSides = "d6";
    }

    public int bonusToResultOnCharismaOrIntelligenceBasedChecks (int result, boolean isCharismaCheck){
        int newResult = result;
        int bonus = 2;
        if (isCharismaCheck){
            int profBonus = Integer.parseInt(getProficiencyBonus());
            newResult = result + profBonus + bonus;
        } else {
            newResult = result + bonus;
        }
        return newResult;
    }
}
