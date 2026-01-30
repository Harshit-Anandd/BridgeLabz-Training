package com.collections.mixedproblems.shoppingcart;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> prices = new HashMap<>();
        Map<String, Integer> cart = new LinkedHashMap<>(); // Maintains add order
        
        // Setup dummy prices
        prices.put("Apple", 1.0); prices.put("Banana", 0.5); prices.put("Laptop", 1000.0);
        
        while(true) {
            System.out.println("\n1. Add Item\n2. View Cart (Order Added)\n3. View Cart (Sorted by Price)\n4. Exit");
            int ch = sc.nextInt();
            if (ch == 4) break;
            
            if (ch == 1) {
                System.out.print("Item (Apple/Banana/Laptop): "); String item = sc.next();
                if(prices.containsKey(item)) cart.put(item, cart.getOrDefault(item, 0) + 1);
                else System.out.println("Unknown item.");
            } else if (ch == 2) {
                System.out.println("Cart: " + cart);
            } else if (ch == 3) {
                // Sort keys based on price
                TreeMap<Double, String> sorted = new TreeMap<>();
                for(String k : cart.keySet()) sorted.put(prices.get(k), k);
                System.out.println("Sorted by Price: " + sorted);
            }
        }
        sc.close();
    }
}