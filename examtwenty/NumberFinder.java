package com.indivaragroup.examtwenty;

public class NumberFinder {
    public static int findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array harus memiliki setidaknya dua angka.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
