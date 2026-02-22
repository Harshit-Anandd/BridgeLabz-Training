package com.annotations.maxlength;
import java.util.Scanner;

public class MaxLengthMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidationLogic logic = new ValidationLogic();

        while (true) {
            System.out.println("\n--- @MaxLength Validation Menu ---");
            System.out.println("1. Create and Validate User");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 2) break;
            if (choice == 1) {
                System.out.print("Enter username (max 10 chars): ");
                String name = sc.nextLine();
                try {
                    User user = new User(name);
                    logic.validateUser(user);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Validation Error: " + ex.getMessage());
                }
            }
        }
        sc.close();
    }
}
