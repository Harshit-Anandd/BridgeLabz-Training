package com.reflections.modifystaticfields;

import java.util.Scanner;

public class StaticFieldMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaticFieldModifier modifier = new StaticFieldModifier();

        while (true) {
            System.out.println("\n--- Static Field Modifier ---");
            Configuration.printKey();
            System.out.println("1. Modify API_KEY");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) {
            	System.out.println("Exiting...");
            	break;
            }

            if (choice == 1) {
                System.out.print("Enter new API Key: ");
                String key = sc.nextLine();
                modifier.changeApiKey(key);
            }
        }
        sc.close();
    }
}