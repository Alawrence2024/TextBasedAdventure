package com.example.textbasedadventure.Classes;

public class ClassBase {
    private final int minStatScore = 3;
    private final int maxStatScore = 20;
    private final int minClassLevel = 1;
    private final int maxClassLevel = 20;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String className;
    private int classLevel;

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
