package com.bridgelabz.day04.eventmanager;
import java.util.Scanner;

public class EventManagerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] prices = new int[50];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Event Manager Menu ------");
            System.out.println("1. Add ticket price");
            System.out.println("2. Sort prices");
            System.out.println("3. Display prices");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ticket price: ");
                    prices[count++] = sc.nextInt();
                    break;

                case 2:
                    EventManager.quickSort(prices, 0, count - 1);
                    System.out.println("Prices sorted.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(prices[i]);
                    }
                    break;

                case 4:
                    running = false;
                    break;
            }
        }
        sc.close();
    }
}