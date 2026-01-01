package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> fleet = new ArrayList<>();

        System.out.print("Enter rental days: ");
        int days = sc.nextInt();

        fleet.add(new Car("KA-01-1234", 2000, "POL-999"));
        fleet.add(new Bike("KA-01-5678", 500, "POL-888"));

        System.out.println("\n--- Rental Summary ---");
        for (Vehicle v : fleet) {
            double cost = v.calculateRentalCost(days);
            double insurance = (v instanceof Insurable) ? ((Insurable) v).calculateInsurance() : 0;
            
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Cost: " + cost);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total: " + (cost + insurance));
            System.out.println("----------------");
        }
        sc.close();
    }
}