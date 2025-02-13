package com.example.textbasedadventure.Classes.DndClasses;

public abstract class ClassBase {
    private final int minStatScore = 3;
    private final int maxStatScore = 20;
    private final int minClassLevel = 1;
    private final int maxClassLevel = 20;
    private int strength;
    private String strengthModifier;
    private int dexterity;
    private String dexterityModifier;
    private int constitution;
    private String constitutionModifier;
    private int intelligence;
    private String intelligenceModifier;
    private int wisdom;
    private String wisdomModifier;
    private int charisma;
    private String charismaModifier;
    private String className;
    private int classLevel;
    private int armorClass;
    private String proficiencyBonus;
    private int hitPoints;
    protected String hitDiceSides;
    private int hitDiceNumber;
    private int maxHitPoints;


    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) throws Exception {
        if(strength >= getMinStatScore() && strength <= getMaxStatScore()) {
            this.strength = strength;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getStrengthModifier() {
        return strengthModifier;
    }

    /**
     * sets strengthMod to a value based on Strength
     */
    public void setStrengthModifier() {
        int strengthScore = getStrength();
        switch (strengthScore){
            case 3:
                strengthModifier = "-4";
                break;
            case 4:
            case 5:
                strengthModifier = "-3";
                break;
            case 6:
            case 7:
                strengthModifier = "-2";
                break;
            case 8:
            case 9:
                strengthModifier = "-1";
                break;
            case 10:
            case 11:
                strengthModifier = "+0";
                break;
            case 12:
            case 13:
                strengthModifier = "+1";
                break;
            case 14:
            case 15:
                strengthModifier = "+2";
                break;
            case 16:
            case 17:
                strengthModifier = "+3";
                break;
            case 18:
            case 19:
                strengthModifier = "+4";
                break;
            case 20:
                strengthModifier = "+5";
                break;
        }
    }

    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) throws Exception {
        if (dexterity >= getMinStatScore() && dexterity <= getMaxStatScore()) {
            this.dexterity = dexterity;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getDexterityModifier() {
        return dexterityModifier;
    }
    /**
     * sets dexterityMod to a value based on Dexterity
     */
    public void setDexterityModifier() {
        int dexterityScore = getDexterity();
        switch (dexterityScore){
            case 3:
                dexterityModifier = "-4";
                break;
            case 4:
            case 5:
                dexterityModifier = "-3";
                break;
            case 6:
            case 7:
                dexterityModifier = "-2";
                break;
            case 8:
            case 9:
                dexterityModifier = "-1";
                break;
            case 10:
            case 11:
                dexterityModifier = "+0";
                break;
            case 12:
            case 13:
                dexterityModifier = "+1";
                break;
            case 14:
            case 15:
                dexterityModifier = "+2";
                break;
            case 16:
            case 17:
                dexterityModifier = "+3";
                break;
            case 18:
            case 19:
                dexterityModifier = "+4";
                break;
            case 20:
                dexterityModifier = "+5";
                break;
        }
    }

    public int getConstitution() {
        return constitution;
    }
    public void setConstitution(int constitution) throws Exception {
        if (constitution >= getMinStatScore() && constitution <= getMaxStatScore()) {
            this.constitution = constitution;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getConstitutionModifier() {
        return constitutionModifier;
    }
    /**
     * sets constitutionMod to a value based on Constitution
     */
    public void setConstitutionModifier() {
        int constitutionScore = getConstitution();
        switch (constitutionScore){
            case 3:
                constitutionModifier = "-4";
                break;
            case 4:
            case 5:
                constitutionModifier = "-3";
                break;
            case 6:
            case 7:
                constitutionModifier = "-2";
                break;
            case 8:
            case 9:
                constitutionModifier = "-1";
                break;
            case 10:
            case 11:
                constitutionModifier = "+0";
                break;
            case 12:
            case 13:
                constitutionModifier = "+1";
                break;
            case 14:
            case 15:
                constitutionModifier = "+2";
                break;
            case 16:
            case 17:
                constitutionModifier = "+3";
                break;
            case 18:
            case 19:
                constitutionModifier = "+4";
                break;
            case 20:
                constitutionModifier = "+5";
                break;
        }
    }

    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) throws Exception {
        if (intelligence >= getMinStatScore() && intelligence <= getMaxStatScore()) {
            this.intelligence = intelligence;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getIntelligenceModifier() {
        return intelligenceModifier;
    }
    /**
     * sets intelligenceMod to a value based on Intelligence
     */
    public void setIntelligenceModifier() {
        int intelligenceScore = getIntelligence();
        switch (intelligenceScore){
            case 3:
                intelligenceModifier = "-4";
                break;
            case 4:
            case 5:
                intelligenceModifier = "-3";
                break;
            case 6:
            case 7:
                intelligenceModifier = "-2";
                break;
            case 8:
            case 9:
                intelligenceModifier = "-1";
                break;
            case 10:
            case 11:
                intelligenceModifier = "+0";
                break;
            case 12:
            case 13:
                intelligenceModifier = "+1";
                break;
            case 14:
            case 15:
                intelligenceModifier = "+2";
                break;
            case 16:
            case 17:
                intelligenceModifier = "+3";
                break;
            case 18:
            case 19:
                intelligenceModifier = "+4";
                break;
            case 20:
                intelligenceModifier = "+5";
                break;
        }
    }

    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) throws Exception {
        if (wisdom >= getMinStatScore() && wisdom <= getMaxStatScore()) {
            this.wisdom = wisdom;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getWisdomModifier() {
        return wisdomModifier;
    }
    /**
     * sets wisdomMod to a value based on Wisdom
     */
    public void setWisdomModifier() {
        int wisdomScore = getWisdom();
        switch (wisdomScore){
            case 3:
                wisdomModifier = "-4";
                break;
            case 4:
            case 5:
                wisdomModifier = "-3";
                break;
            case 6:
            case 7:
                wisdomModifier = "-2";
                break;
            case 8:
            case 9:
                wisdomModifier = "-1";
                break;
            case 10:
            case 11:
                wisdomModifier = "+0";
                break;
            case 12:
            case 13:
                wisdomModifier = "+1";
                break;
            case 14:
            case 15:
                wisdomModifier = "+2";
                break;
            case 16:
            case 17:
                wisdomModifier = "+3";
                break;
            case 18:
            case 19:
                wisdomModifier = "+4";
                break;
            case 20:
                wisdomModifier = "+5";
                break;
        }
    }

    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) throws Exception {
        if (charisma >= getMinStatScore() && charisma <= getMaxStatScore()) {
            this.charisma = charisma;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public String getCharismaModifier() {
        return charismaModifier;
    }
    /**
     * sets charismaMod to a value based on Charisma
     */
    public void setCharismaModifier() {
        int charismaScore = getCharisma();
        switch (charismaScore){
            case 3:
                charismaModifier = "-4";
                break;
            case 4:
            case 5:
                charismaModifier = "-3";
                break;
            case 6:
            case 7:
                charismaModifier = "-2";
                break;
            case 8:
            case 9:
                charismaModifier = "-1";
                break;
            case 10:
            case 11:
                charismaModifier = "+0";
                break;
            case 12:
            case 13:
                charismaModifier = "+1";
                break;
            case 14:
            case 15:
                charismaModifier = "+2";
                break;
            case 16:
            case 17:
                charismaModifier = "+3";
                break;
            case 18:
            case 19:
                charismaModifier = "+4";
                break;
            case 20:
                charismaModifier = "+5";
                break;
        }
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassLevel() {
        return classLevel;
    }
    public void setClassLevel(int classLevel) throws Exception {
        if (classLevel >= getMinClassLevel() && classLevel <= getMaxClassLevel()) {
            this.classLevel = classLevel;
        } else {
            Exception intOutOfRange = new Exception("The provided number is out of range.");
            throw intOutOfRange;
        }
    }

    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public String getProficiencyBonus() {
        return proficiencyBonus;
    }

    /**
     * sets proficencyBonus to a number based on the class level.
     */
    public void setProficiencyBonus() {
        int lvl = getClassLevel();
        switch (lvl){
            case 1:
            case 2:
            case 3:
            case 4:
                proficiencyBonus = "+2";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                proficiencyBonus = "+3";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                proficiencyBonus = "+4";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                proficiencyBonus = "+5";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                proficiencyBonus = "+6";
                break;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
    public int getMaxHitPoints() {
        return maxHitPoints;
    }
    public void setHitPoints(){
        String diceSides = getHitDiceSides();
        int sides = 0;
        switch (diceSides){
            case "d4":
                sides = 4;
                break;
            case "d6":
                sides = 6;
                break;
            case "d8":
                sides = 8;
                break;
            case "d10":
                sides = 10;
                break;
            case "d12":
                sides = 12;
                break;
            case "d20":
                sides = 20;
                break;
        }
        hitPoints = sides * getHitDiceNumber();
        maxHitPoints = hitPoints;
    }

    /**
     * used to update ohw many hitpoints the player has after the initial total has been set.
     * @param oldHitPoints the amount of hitpoints the character currently has
     * @param hitPointChange the amount to be added or subtracted from the current hit points
     *                       if hitPointChange is being subtracted, make it negative.
     */
    public void updateHitPoints(int oldHitPoints, int hitPointChange){
        hitPoints = oldHitPoints + hitPointChange;
    }

    public String getHitDiceSides() {
        return hitDiceSides;
    }
    abstract void setHitdiceSides();

    public int getHitDiceNumber() {
        return hitDiceNumber;
    }
    public void setHitDiceNumber(){
        hitDiceNumber = getClassLevel();
    }

    public int getMinStatScore() {
        return minStatScore;
    }

    public int getMaxStatScore() {
        return maxStatScore;
    }

    public int getMinClassLevel() {
        return minClassLevel;
    }

    public int getMaxClassLevel() {
        return maxClassLevel;
    }
}
