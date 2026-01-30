package com.regex.licensevalidation;
import java.util.Scanner;

public class LicensePlateMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LicensePlate obj = new LicensePlate();

        while (true) {
            System.out.println("\n--- License Plate Validator ---");
            System.out.println("1. Check Plate");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter Plate Number (e.g., AB1234): ");
                String input = sc.nextLine();
                System.out.println(obj.isValidLicensePlate(input) ? "Valid" : "Invalid");
            }
        }
        sc.close();
    }
}