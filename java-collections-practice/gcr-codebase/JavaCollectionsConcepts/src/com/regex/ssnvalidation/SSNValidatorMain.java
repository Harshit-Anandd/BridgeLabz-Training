package com.regex.ssnvalidation;
import java.util.Scanner;

public class SSNValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SSNValidator obj = new SSNValidator();

        while (true) {
            System.out.println("\n--- SSN Validator ---");
            System.out.println("1. Validate SSN");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter SSN (xxx-xx-xxxx): ");
                String input = sc.nextLine();
                System.out.println(obj.isValidSSN(input) ? "Valid SSN" : "Invalid SSN");
            }
        }
        sc.close();
    }
}