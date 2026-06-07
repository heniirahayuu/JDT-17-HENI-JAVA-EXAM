package com.indivaragroup.examtwenty;

public class BankAccount {
    public static int calculateBalance(int[] transactions) {
        int balance = 0;
        for (int amount : transactions) {
            balance += amount;
        }
        return balance;
    }
}
