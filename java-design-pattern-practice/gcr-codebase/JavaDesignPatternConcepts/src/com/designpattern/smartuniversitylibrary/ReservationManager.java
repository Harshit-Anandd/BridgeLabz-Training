package com.designpattern.smartuniversitylibrary;
import java.util.Scanner;

public class ReservationManager {

    public void handleReservation(Scanner sc) {

        System.out.println("Enter user name: ");
        String name = sc.nextLine();

        System.out.println("Enter book title: ");
        String title = sc.nextLine();

        System.out.println("Select reservation type (1-Standard, 2-Priority): ");
        int type = sc.nextInt();
        sc.nextLine();

        ReservationStrategy strategy;

        if (type == 1) strategy = new StandardReservation();
        else strategy = new PriorityReservation();

        strategy.reserve(name, title);
    }
}
