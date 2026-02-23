package com.multithreading.restaurantsystem;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantService service = new RestaurantService();

        while (true) {
            System.out.println("\n--- Restaurant Order System ---");
            System.out.println("1. Start Kitchen");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) service.startKitchen();
            else System.exit(0);
        }
    }
}