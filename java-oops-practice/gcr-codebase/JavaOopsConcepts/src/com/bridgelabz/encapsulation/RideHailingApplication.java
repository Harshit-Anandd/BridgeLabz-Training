package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RideHailingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<RideVehicle> rides = new ArrayList<>();

        rides.add(new Auto("Auto-01", "Raj", 15)); // 15 per km
        rides.add(new Cab("Cab-01", "Sam", 25));   // 25 per km + base

        System.out.print("Enter distance (km): ");
        double dist = sc.nextDouble();

        System.out.println("\n--- Fare Estimates ---");
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            if (v instanceof GPS) {
                ((GPS) v).updateLocation("User Location");
                System.out.println("Loc: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("Fare: " + v.calculateFare(dist));
            System.out.println("---------------");
        }
        sc.close();
    }
}