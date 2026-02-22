package com.annotations.override;
import java.util.Scanner;

public class OverrideMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnimalLogic logic = new AnimalLogic();

        while (true) {
            System.out.println("\n--- @Override Exercise Menu ---");
            System.out.println("1. Hear Dog Sound (Overridden)");
            System.out.println("2. Hear Generic Animal Sound");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 3) break;
            if (choice == 1 || choice == 2) {
                logic.playSound(choice);
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
