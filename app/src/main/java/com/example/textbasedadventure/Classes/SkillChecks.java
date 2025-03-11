package com.example.textbasedadventure.Classes;

import com.example.textbasedadventure.Classes.DndClasses.*;
import java.util.Random;

public class SkillChecks {
    Random rand = new Random();

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1. It adds the strengthModifier to the number and returns it.
     * @param strengthModifier number to add to the skill check
     * @return int result  of the skill check
     */
    public int StrengthCheck (int strengthModifier){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        result = d20 + strengthModifier;
        return result;
    }

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1. It adds the dexterityModifier to the number and returns it.
     * @param dexterityModifier number to add to the skill check
     * @return int result of the skill check
     */
    public int DexterityCheck (int dexterityModifier){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        result = d20 + dexterityModifier;
        return result;
    }

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1.
     * If the character is an instance of Druid, it runs the set method in the Druid class.
     * Otherwise it adds the constitutionModifier and returns it
     * @param constitutionModifier number to add to the skill check
     * @param character the character the skill check is being done with
     * @return int result of the skill check
     */
    public int ConstitutionCheck (int constitutionModifier, ClassBase character){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        if (character instanceof Druid){
            Druid druid = (Druid) character;
            result = druid.bonusToResultOnWisdomOrConstitutionBasedChecks(d20, false);
        } else {
            result = d20 + constitutionModifier;
        }
        return result;
    }

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1.
     * If the character is an instance of Sorcerer, it runs the set method in the Sorcerer class.
     * Otherwise it adds the intelligenceModifier and returns it
     * @param intelligenceModifier number to add to the skill check
     * @param character the character the skill check is being done with
     * @return int result of the skill check
     */
    public int IntelligenceCheck (int intelligenceModifier, ClassBase character){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        if (character instanceof Sorcerer){
            Sorcerer sorcerer = (Sorcerer) character;
            result = sorcerer.bonusToResultOnCharismaOrIntelligenceBasedChecks(d20, false);
        } else {
            result = d20 + intelligenceModifier;
        }
        return result;
    }

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1.
     * If the character is an instance of Sorcerer, it runs the set method in the Sorcerer class.
     * Otherwise it adds the intelligenceModifier and returns it
     * @param wisdomModifier number to add to the skill check
     * @param character the character the skill check is being done with
     * @return int result of the skill check
     */
    public int WisdomCheck (int wisdomModifier, ClassBase character){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        if (character instanceof Druid){
            Druid druid = (Druid) character;
            result = druid.bonusToResultOnWisdomOrConstitutionBasedChecks(d20, true);
        } else {
            result = d20 + wisdomModifier;
        }
        return result;
    }

    /**
     * Generates a number between 0 and 20. If the number is 0, it sets it to 1.
     * If the character is an instance of Sorcerer, it runs the set method in the Sorcerer class.
     * Otherwise it adds the intelligenceModifier and returns it
     * @param charismaModifier number to add to the skill check
     * @param character the character the skill check is being done with
     * @return int result of the skill check
     */
    public int CharismaCheck (int charismaModifier, ClassBase character){
        int d20 = rand.nextInt(21);
        int result = d20;
        if (d20 == 0){
            d20 = 1;
        }
        if (character instanceof Sorcerer){
            Sorcerer sorcerer = (Sorcerer) character;
            result = sorcerer.bonusToResultOnCharismaOrIntelligenceBasedChecks(d20, true);
        } else {
            result = d20 + charismaModifier;
        }
        return result;
    }
}
