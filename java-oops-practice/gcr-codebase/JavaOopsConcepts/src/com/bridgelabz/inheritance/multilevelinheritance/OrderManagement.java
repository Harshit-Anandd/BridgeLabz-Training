package com.bridgelabz.inheritance.multilevelinheritance;

import java.util.Scanner;
public class OrderManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Order Details (ID, Date, Tracking, Delivery Date):");
        int id = sc.nextInt();
        String date = sc.next();
        String track = sc.next();
        String delDate = sc.next();

        // Multilevel Inheritance Chain
        DeliveredOrder order = new DeliveredOrder(id, date, track, delDate);
        
        System.out.println("Final Status: " + order.getOrderStatus());
        sc.close();
    }
}