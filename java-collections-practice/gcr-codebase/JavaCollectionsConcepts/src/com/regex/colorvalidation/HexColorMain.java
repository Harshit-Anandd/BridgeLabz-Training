package com.regex.colorvalidation;
import java.util.Scanner;

public class HexColorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HexColor obj = new HexColor();

        while (true) {
            System.out.println("\n--- Hex Color Validator ---");
            System.out.println("1. Validate Color Code");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter Hex Code (e.g., #FFA500): ");
                String input = sc.nextLine();
                System.out.println(obj.isValidHexColor(input) ? "Valid" : "Invalid");
            }
        }
        sc.close();
    }
}