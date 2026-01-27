package com.bridgelabz.day04.zipzipmart;
import java.util.Scanner;

public class ZipZipMartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sale[] sales = new Sale[50];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ ZipZipMart Menu ------");
            System.out.println("1. Add sale");
            System.out.println("2. Sort sales");
            System.out.println("3. Display sales");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter sale amount: ");
                    sales[count++] = new Sale(sc.nextInt());
                    break;

                case 2:
                    ZipZipMart.mergeSort(sales, 0, count - 1);
                    System.out.println("Sales sorted.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(sales[i]);
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