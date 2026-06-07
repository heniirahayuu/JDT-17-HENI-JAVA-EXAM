package com.indivaragroup.examtwenty;

public class BonusCalculator {
    public static double calculateBonus(int score, int years) {
        double baseBonus = 1000.0; //misal
        double bonusMultiplier = 0;

        if (score >= 90) {
            bonusMultiplier += 0.20;
        } else if (score >= 75) {
            bonusMultiplier += 0.10;
        }
        if (years >= 5) {
            bonusMultiplier += 0.15;
        } else if (years >= 2) {
            bonusMultiplier += 0.05;
        }

        return baseBonus + (baseBonus * bonusMultiplier);
    }
}
