package com.indivaragroup.examtwenty;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> getFrequency(String sentence) {
        Map<String, Integer> freqMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\s+");
        for (String word : words) {freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);}
        return freqMap;
    }
}
