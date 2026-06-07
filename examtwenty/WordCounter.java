package com.indivaragroup.examtwenty;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static String findMostFrequentWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";

        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}
