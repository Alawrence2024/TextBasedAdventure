package com.example.textbasedadventure.Classes.DndClasses;

public class Druid extends ClassBase {

    public Druid(int strength, int dexterity, int constitution, int wisdom, int intelligence, int charisma, int classLevel, int armorClass) throws Exception {
        setClassName("Druid");
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
        hitDiceSides = "d8";
    }

    public int bonusToResultOnWisdomOrConstitutionBasedChecks (int result, boolean isWisdomCheck){
        int newResult = result;
        int bonus = 2;
        if (isWisdomCheck){
            int profBonus = Integer.parseInt(getProficiencyBonus());
            newResult = result + profBonus + bonus;
        } else {
            newResult = result + bonus;
        }
        return newResult;
    }
}
