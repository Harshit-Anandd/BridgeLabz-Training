package com.regex.usernamevalidation;
import java.util.Scanner;

public class UsernameValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsernameValidator obj = new UsernameValidator();

        while (true) {
            System.out.println("\n--- Username Validator ---");
            System.out.println("1. Validate Username");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter Username: ");
                String input = sc.nextLine();
                if (obj.isValidUsername(input)) {
                    System.out.println("Valid Username.");
                } else {
                    System.out.println("Invalid Username. (Must start with letter, 5-15 chars, alphanumeric/underscore only)");
                }
            }
        }
        sc.close();
    }
}