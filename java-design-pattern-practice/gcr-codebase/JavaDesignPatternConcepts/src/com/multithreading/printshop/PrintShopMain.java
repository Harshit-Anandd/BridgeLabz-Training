package com.multithreading.printshop;
import java.util.Scanner;

public class PrintShopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService service = new PrintService();

        while (true) {
            System.out.println("\n--- Print Shop Scheduler ---");
            System.out.println("1. Start Print Jobs");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) service.startPrinting();
            else System.exit(0);
        }
    }
}