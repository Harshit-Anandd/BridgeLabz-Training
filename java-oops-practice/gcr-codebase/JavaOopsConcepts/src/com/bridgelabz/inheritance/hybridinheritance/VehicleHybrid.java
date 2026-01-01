package com.bridgelabz.inheritance.hybridinheritance;

import java.util.Scanner;
public class VehicleHybrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Petrol Car Model: ");
        PetrolVehicle pv = new PetrolVehicle(sc.nextLine(), 180);
        
        System.out.print("Enter Electric Car Model: ");
        ElectricVehicle ev = new ElectricVehicle(sc.nextLine(), 150);

        System.out.println("\n--- Actions ---");
        pv.refuel(); // From Interface
        ev.charge(); // Specific method
        
        sc.close();
    }
}