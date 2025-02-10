package com.example.textbasedadventure.Classes;

public class Rogue extends ClassBase {
    private String sneakAttackBonusDamage;

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
}
