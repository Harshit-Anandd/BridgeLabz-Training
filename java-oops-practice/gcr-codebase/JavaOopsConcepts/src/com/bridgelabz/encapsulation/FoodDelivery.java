package com.bridgelabz.encapsulation;

import java.util.Scanner;
public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ordering Veg Burger...");
        VegItem v = new VegItem("Veg Burger", 100, 2);
        
        System.out.println("Ordering Chicken Pizza...");
        NonVegItem nv = new NonVegItem("Chicken Pizza", 300, 1);

        v.getItemDetails();
        System.out.println("Total (after discount): " + v.calculateTotalPrice());

        nv.getItemDetails();
        System.out.println("Total (with charges): " + nv.calculateTotalPrice());
        
        sc.close();
    }
}