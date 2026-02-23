package com.multithreading.threadmonitor;
import java.util.Scanner;

public class MonitorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonitorService service = new MonitorService();

        while (true) {
            System.out.println("\n--- Thread State Monitor ---");
            System.out.println("1. Start Monitoring");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) service.startMonitoring();
            else System.exit(0);
        }
    }
}