package com.annotations.roleallowed;
import java.util.Scanner;

public class RoleAccessMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoleLogic logic = new RoleLogic();

        while (true) {
            System.out.println("\n--- @RoleAllowed Menu ---");
            System.out.println("1. Execute Action");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;
            if (choice == 1) {
                System.out.print("Enter your role (ADMIN/USER): ");
                String role = sc.nextLine();
                System.out.print("Enter action (deleteDatabase/viewProfile): ");
                String action = sc.nextLine();
                logic.executeMethod(role, action);
            }
        }
        sc.close();
    }
}
