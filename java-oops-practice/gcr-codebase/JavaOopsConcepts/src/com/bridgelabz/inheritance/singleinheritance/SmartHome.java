package com.bridgelabz.inheritance.singleinheritance;

import java.util.Scanner;
public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();
        
        System.out.print("Enter Status (On/Off): ");
        String status = sc.nextLine();
        
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        Thermostat t = new Thermostat(id, status, temp);
        t.displayStatus();
        
        sc.close();
    }
}