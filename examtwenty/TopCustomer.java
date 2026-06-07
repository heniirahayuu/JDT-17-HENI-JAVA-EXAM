package com.indivaragroup.examtwenty;

public class TopCustomer {
    public String findTopCustomer(String[] customers) {

        String topCustomer = "";
        int maxCount = 0;

        for (String customer : customers) {
            int count = 0;

            for (String c : customers) {
                if (customer.equals(c)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                topCustomer = customer;
            }
        }

        return topCustomer;
    }
}
