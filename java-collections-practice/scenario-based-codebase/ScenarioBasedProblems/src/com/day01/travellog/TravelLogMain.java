package com.day01.travellog;

import java.util.Scanner;

public class TravelLogMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TravelLogService service =
                new TravelLogService();

        boolean running = true;

        while (running) {

            System.out.println("\n1.Save  2.Load  3.Summary  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("Country: ");
                    String country = sc.nextLine();
                    System.out.print("Duration: ");
                    int d = sc.nextInt();
                    service.saveTrip(
                            new Trip(city, country, d),
                            "trip.dat");
                    break;
                case 2:
                    service.loadTrip("trip.dat");
                    break;
                case 3:
                    service.summary();
                    break;
                case 4:
                    running = false;
                    break;
            }
        }

        sc.close();
    }
}