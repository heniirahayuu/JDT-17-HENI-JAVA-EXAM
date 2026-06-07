package com.indivaragroup.examtwenty;

import java.util.Arrays;

public class LongestConsecutive {
    public int findLongest(int[] numbers) {

        Arrays.sort(numbers);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                current++;
            } else if (numbers[i] != numbers[i - 1]) {
                current = 1;
            }

            if (current > longest) {
                longest = current;
            }
        }

        return longest;
    }
}
