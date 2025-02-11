package com.example.textbasedadventure.Classes.DndClasses;

public class Rogue extends ClassBase {
    private String sneakAttackBonusDamage;

    public Rogue(int strength, int dexterity, int constitution, int wisdom, int intelligence, int charisma, int classLevel, int armorClass) throws Exception {
        setClassName("Rogue");
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
        setArmorClass(armorClass);
        setSneakAttackBonusDamage();
        setProficiencyBonus();
        setHitdiceSides();
        setHitDiceNumber();
        setHitPoints();
    }

    public String getSneakAttackBonusDamage() {
        return sneakAttackBonusDamage;
    }

    /**
     * sets sneakAttackBonusDamage to xd6 where x is based on class level.
     */
    public void setSneakAttackBonusDamage() {
        int lvl = getClassLevel();
        switch (lvl){
            case 1:
            case 2:
                sneakAttackBonusDamage = "1d6";
                break;
            case 3:
            case 4:
                sneakAttackBonusDamage = "2d6";
                break;
            case 5:
            case 6:
                sneakAttackBonusDamage = "3d6";
                break;
            case 7:
            case 8:
                sneakAttackBonusDamage = "4d6";
                break;
            case 9:
            case 10:
                sneakAttackBonusDamage = "5d6";
                break;
            case 11:
            case 12:
                sneakAttackBonusDamage = "6d6";
                break;
            case 13:
            case 14:
                sneakAttackBonusDamage = "7d6";
                break;
            case 15:
            case 16:
                sneakAttackBonusDamage = "8d6";
                break;
            case 17:
            case 18:
                sneakAttackBonusDamage = "9d6";
                break;
            case 19:
            case 20:
                sneakAttackBonusDamage = "10d6";
                break;
        }
    }

    @Override
    void setHitdiceSides() {
        hitDiceSides = "d8";
    }

    /**
     * Takes in the attack damage, halves it if the class level is greater than or equal to 5, and returns it.
     * @param attackDamage the amount of damage done to the player
     * @return the actual damage, normal if below level 5 and halved if level 5 or higher.
     */
    public int uncannyDodge (int attackDamage){
        int actualDamage = attackDamage;
        if(getClassLevel() >= 5){
            actualDamage = attackDamage/2;
        }
        return actualDamage;
    }
}
