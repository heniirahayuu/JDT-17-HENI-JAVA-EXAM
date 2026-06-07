package com.indivaragroup.examtwenty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateDetector {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
}
