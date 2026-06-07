package com.indivaragroup.examtwenty;

public class Leaderboard {
    public static int[] getRankings(int[] scores) {
        int n = scores.length;
        int[] rankings = new int[n];

        for (int i = 0; i < n; i++) {
            int currentRank = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    currentRank++;
                }
            }
            rankings[i] = currentRank;
        }
        return rankings;
    }
}
