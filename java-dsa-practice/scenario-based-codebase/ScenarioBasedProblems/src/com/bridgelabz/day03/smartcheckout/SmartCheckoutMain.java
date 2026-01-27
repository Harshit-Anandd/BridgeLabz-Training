package com.bridgelabz.day03.smartcheckout;

import java.util.Scanner;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Smart Checkout Menu ------");
            System.out.println("1. Add customer");
            System.out.println("2. Process billing");
            System.out.println("3. Display stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of items: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    String[] items = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter item " + (i + 1) + ": ");
                        items[i] = sc.nextLine();
                    }

                    checkout.addCustomer(name, items);
                    break;

                case 2:
                    checkout.processBilling();
                    break;

                case 3:
                    checkout.displayStock();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Smart Checkout.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}