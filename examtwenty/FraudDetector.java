package com.indivaragroup.examtwenty;

public class FraudDetector {
    public static int countFraudulentTransactions(int[] transactions) {
        if (transactions == null || transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int t : transactions) {
            sum += t;
        }
        double average = sum / transactions.length;
        int count = 0;
        double threshold = 2 * average;
        for (int t : transactions) {
            if (t > threshold) {
                count++;
            }
        }
        return count;
    }
}
