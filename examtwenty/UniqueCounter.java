package com.indivaragroup.examtwenty;

import java.util.HashSet;
import java.util.Set;

public class UniqueCounter {
    public static int countUniqueCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : text.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }
}
