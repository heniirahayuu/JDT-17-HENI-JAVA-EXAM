package com.indivaragroup.examtwenty;

import java.util.Map;

public class SalesAnalyzer {
    public static String findTopSellingProduct(Map<String, Integer> salesData) {
        if (salesData == null || salesData.isEmpty()) {
            return null;
        }
        String topProduct = null;
        int maxSales = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : salesData.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                topProduct = entry.getKey();
            }
        }

        return topProduct;
    }
}
