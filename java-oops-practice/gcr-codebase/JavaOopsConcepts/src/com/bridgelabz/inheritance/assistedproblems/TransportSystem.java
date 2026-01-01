package com.bridgelabz.inheritance.assistedproblems;

import java.util.Scanner;
public class TransportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[2]; // Polymorphic Array

        for(int i=0; i<2; i++) {
            System.out.println("Enter vehicle " + (i+1) + " type (1. Car, 2. Truck): ");
            int type = sc.nextInt();
            System.out.print("Model: ");
            String model = sc.next();
            System.out.print("Max Speed: ");
            double speed = sc.nextDouble();

            if (type == 1) {
                System.out.print("Seats: ");
                vehicles[i] = new Car(model, speed, sc.nextInt());
            } else {
                System.out.print("Load Capacity: ");
                vehicles[i] = new Truck(model, speed, sc.nextDouble());
            }
        }

        System.out.println("\n--- Fleet Info ---");
        for(Vehicle v : vehicles) {
            v.displayInfo(); // Dynamic Method Dispatch
            System.out.println("----------------");
        }
        sc.close();
    }
}