package com.bridgelabz.day10.ticketbooking;
import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventAVL avl = new EventAVL();
        boolean running = true;

        while (running) {

            System.out.println("\n1.Add Event  2.Show Events  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Event Name: ");
                    String name = sc.nextLine();
                    System.out.print("Start Time (HHMM): ");
                    int time = sc.nextInt();
                    avl.addEvent(name, time);
                    break;

                case 2:
                    avl.displayInOrder(avl.root);
                    break;

                case 3:
                    running = false;
            }
        }
        sc.close();
    }
}