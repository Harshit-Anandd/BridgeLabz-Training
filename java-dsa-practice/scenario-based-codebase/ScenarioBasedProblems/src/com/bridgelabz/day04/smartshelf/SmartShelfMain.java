package com.bridgelabz.day04.smartshelf;

import java.util.Scanner;

public class SmartShelfMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] shelf = new Book[20];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ SmartShelf Menu ------");
            System.out.println("1. Add book");
            System.out.println("2. Display shelf");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    shelf[count++] = new Book(sc.nextLine());
                    SmartShelf.insertionSort(shelf, count);
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(shelf[i]);
                    }
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}