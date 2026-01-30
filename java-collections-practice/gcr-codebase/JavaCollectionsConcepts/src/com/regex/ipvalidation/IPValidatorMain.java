package com.regex.ipvalidation;
import java.util.Scanner;

public class IPValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPValidator obj = new IPValidator();

        while (true) {
            System.out.println("\n--- IP Address Validator ---");
            System.out.println("1. Validate IP");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter IP Address: ");
                String input = sc.nextLine();
                System.out.println(obj.isValidIP(input) ? "Valid IPv4" : "Invalid IP");
            }
        }
        sc.close();
    }
}