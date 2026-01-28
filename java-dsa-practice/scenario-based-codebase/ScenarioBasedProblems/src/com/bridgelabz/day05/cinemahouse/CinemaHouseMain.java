package com.bridgelabz.day05.cinemahouse;
import java.util.Scanner;

public class CinemaHouseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieShow[] shows = new MovieShow[15];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Cinema House Menu ------");
            System.out.println("1. Add movie show");
            System.out.println("2. Sort shows by time");
            System.out.println("3. Display shows");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter movie name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter show time (HHMM): ");
                    int time = sc.nextInt();

                    shows[count++] = new MovieShow(name, time);
                    break;

                case 2:
                    CinemaHouse.bubbleSort(shows, count);
                    System.out.println("Shows sorted by time.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(shows[i]);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Cinema House.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}