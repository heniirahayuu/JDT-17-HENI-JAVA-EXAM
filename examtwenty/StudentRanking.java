package com.indivaragroup.examtwenty;

public class StudentRanking {
    public int[] getRanking(int[] scores) {
        int[] ranks = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}
