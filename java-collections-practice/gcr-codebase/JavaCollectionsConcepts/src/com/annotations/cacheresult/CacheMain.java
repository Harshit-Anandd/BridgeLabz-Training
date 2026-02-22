package com.annotations.cacheresult;
import java.util.Scanner;

public class CacheMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CacheLogic logic = new CacheLogic();

        while (true) {
            System.out.println("\n--- @CacheResult Menu ---");
            System.out.println("1. Compute Square");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) {
                System.out.print("Enter number to square: ");
                int num = sc.nextInt();
                logic.processCalculation(num);
            }
        }
        sc.close();
    }
}
