package com.day01.bankmanagement;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {
            System.out.println("\n--- Bank Transaction System ---");
            System.out.println("1. Start Simulation");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                service.startSimulation();
            } else {
                System.exit(0);
            }
        }
    }
}