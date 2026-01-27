package com.bridgelabz.day03.smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> queue = new LinkedList<>();
    private Map<String, Integer> priceMap = new HashMap<>();
    private Map<String, Integer> stockMap = new HashMap<>();

    public SmartCheckout() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 60);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 10);
        stockMap.put("Eggs", 10);
    }

    public void addCustomer(String name, String[] items) {
        queue.add(new Customer(name, items));
        System.out.println("Customer added to billing queue.");
    }

    public void processBilling() {

        if (queue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = queue.poll();
        int total = 0;

        for (String item : customer.items) {

            if (!priceMap.containsKey(item) || stockMap.get(item) == 0) {
                System.out.println(item + " unavailable.");
                continue;
            }

            total += priceMap.get(item);
            stockMap.put(item, stockMap.get(item) - 1);
        }

        System.out.println("Customer: " + customer.name);
        System.out.println("Total Bill: INR " + total);
    }

    public void displayStock() {
        System.out.println("Current Stock: " + stockMap);
    }
}