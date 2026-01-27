package com.bridgelabz.day02.trafficmanager;

import java.util.Scanner;

public class TrafficManagerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrafficManager manager = new TrafficManager();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Traffic Manager Menu ------");
            System.out.println("1. Add vehicle to waiting queue");
            System.out.println("2. Allow vehicle to enter roundabout");
            System.out.println("3. Exit vehicle from roundabout");
            System.out.println("4. Display traffic state");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicle = sc.nextLine();
                    manager.enqueueVehicle(vehicle);
                    break;

                case 2:
                    manager.allowVehicleEntry();
                    break;

                case 3:
                    System.out.print("Enter vehicle number to exit: ");
                    String exitVehicle = sc.nextLine();
                    manager.exitVehicle(exitVehicle);
                    break;

                case 4:
                    manager.displayState();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Traffic Manager.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
