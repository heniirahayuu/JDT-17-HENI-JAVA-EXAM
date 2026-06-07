package com.indivaragroup.examtwenty;

import java.util.Collections;
import java.util.PriorityQueue;

public class InventoryOptimizer {
    public static int minimizeStock(int[] stock, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stock) {
            maxHeap.add(s);
        }

        for (int i = 0; i < k; i++) {
            int max = maxHeap.poll();
            // Kurangi nilai terbesar dengan membaginya menjadi dua
            maxHeap.add(max / 2);
        }

        int totalStock = 0;
        for (int s : maxHeap) {
            totalStock += s;
        }
        return totalStock;
    }
}
