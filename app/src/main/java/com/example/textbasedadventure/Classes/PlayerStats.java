package com.example.textbasedadventure.Classes;

import com.example.textbasedadventure.Classes.DndClasses.ClassBase;

public class PlayerStats {
    public static int hp = 100;
    public static ClassBase playerClass;
    public static int reputation = 50;

    public static void updateHealth(int healthChange) {
        hp += healthChange;
    }

    public static String getStats() {
        return "HP: " + hp + ", Class: " + playerClass + ", Reputation: " + reputation;
    }
}

