package com.bridgelabz.day06.fleetmanager;
import java.util.Scanner;

public class FleetManagerMain {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[50];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Fleet Manager Menu ------");
            System.out.println("1. Add vehicle (from depot)");
            System.out.println("2. Generate maintenance schedule");
            System.out.println("3. Display schedule");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter mileage: ");
                    int mileage = sc.nextInt();

                    vehicles[count++] = new Vehicle(id, mileage);
                    break;

                case 2:
                	FleetManager.mergeSort(vehicles, 0, count - 1);
                    System.out.println("Maintenance schedule generated (sorted by mileage).");
                    break;

                case 3:
                    System.out.println("Maintenance Schedule:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(vehicles[i]);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Fleet Manager.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}