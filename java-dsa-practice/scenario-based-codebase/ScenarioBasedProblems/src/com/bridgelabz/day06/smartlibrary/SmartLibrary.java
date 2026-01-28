package com.bridgelabz.day06.smartlibrary;
import java.util.Scanner;

public class SmartLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BorrowedBook[] books = new BorrowedBook[20];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Borrow  2.Display  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Book title: ");
                    books[count++] = new BorrowedBook(sc.nextLine());
                    LibrarySorter.insertionSort(books, count);
                    break;

                case 2:
                    for (int i = 0; i < count; i++)
                        System.out.println(books[i]);
                    break;

                case 3:
                    running = false;
            }
        }
        sc.close();
    }
}