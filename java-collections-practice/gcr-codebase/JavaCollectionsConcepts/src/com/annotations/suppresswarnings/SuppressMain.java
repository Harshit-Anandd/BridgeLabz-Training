package com.annotations.suppresswarnings;
import java.util.Scanner;

public class SuppressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WarningLogic logic = new WarningLogic();

        while (true) {
            System.out.println("\n--- @SuppressWarnings Menu ---");
            System.out.println("1. Execute Raw List Logic");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) {
                logic.demonstrateSuppression();
            }
        }
        sc.close();
    }
}
