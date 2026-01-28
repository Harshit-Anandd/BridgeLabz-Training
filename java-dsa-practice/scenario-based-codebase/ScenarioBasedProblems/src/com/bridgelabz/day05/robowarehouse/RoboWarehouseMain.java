package com.bridgelabz.day05.robowarehouse;
import java.util.Scanner;

public class RoboWarehouseMain {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PackageBox[] shelf = new PackageBox[30];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ RoboWarehouse Menu ------");
            System.out.println("1. Add package");
            System.out.println("2. Display shelf");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter package weight: ");
                    int weight = sc.nextInt();
                    shelf[count++] = new PackageBox(weight);

                    // Maintain sorted order after every insertion
                    RoboWarehouse.insertionSort(shelf, count);
                    System.out.println("Package placed in sorted order.");
                    break;

                case 2:
                    System.out.println("Shelf state:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(shelf[i]);
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting RoboWarehouse.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}