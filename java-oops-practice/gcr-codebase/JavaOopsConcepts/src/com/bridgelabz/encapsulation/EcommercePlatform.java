package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EcommercePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();

        System.out.println("Adding items to cart...");
        // Simulating input for brevity, in real app loop as per Practice 1
        cart.add(new Electronics(101, "Laptop", 50000));
        cart.add(new Clothing(102, "T-Shirt", 1000));

        System.out.println("\n--- Invoice ---");
        for (Product p : cart) {
            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: -" + p.calculateDiscount());
            if (p instanceof Taxable) {
                System.out.println("Tax (" + ((Taxable) p).getTaxDetails() + "): +" + ((Taxable) p).calculateTax());
            }
            System.out.println("Final Price: " + p.getFinalPrice());
            System.out.println("----------------");
        }
        sc.close();
    }
}