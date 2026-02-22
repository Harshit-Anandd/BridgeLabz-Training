package com.annotations.deprecated;
import java.util.Scanner;

public class DeprecatedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LegacyLogic logic = new LegacyLogic();

        while (true) {
            System.out.println("\n--- @Deprecated API Menu ---");
            System.out.println("1. Call Old Feature");
            System.out.println("2. Call New Feature");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 3) break;
            logic.executeFeature(choice);
        }
        sc.close();
    }
}
