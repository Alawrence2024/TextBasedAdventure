package com.example.textbasedadventure.Classes;

import com.example.textbasedadventure.Classes.DndClasses.ClassBase;

public class PlayerStats {
    public static int hp = 100;
    public static ClassBase playerClass;
    public static int reputation = 50;

    public PlayerStats(int hp, ClassBase playerClass, int reputation)
    {
        this.hp = hp;
        this.playerClass = playerClass;
        this.reputation = reputation;

    }

    public PlayerStats(){

    }
    public static void updateHealth(int healthChange) {
        hp += healthChange;
    }
    public static void updateReputation(int reputationChange) {reputation += reputationChange;}

    public static String getStats() {
        return "HP: " + hp + ", Class: " + playerClass + ", Reputation: " + reputation;
    }
}

