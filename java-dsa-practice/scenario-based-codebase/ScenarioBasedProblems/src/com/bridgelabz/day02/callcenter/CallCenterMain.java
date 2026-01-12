package com.bridgelabz.day02.callcenter;

import java.util.Scanner;

public class CallCenterMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenter center = new CallCenter();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Call Center Menu ------");
            System.out.println("1. Receive call");
            System.out.println("2. Serve next call");
            System.out.println("3. View call count of customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer ID: ");
                    String id = sc.nextLine();
                    System.out.print("Is VIP (true/false): ");
                    boolean vip = sc.nextBoolean();
                    center.receiveCall(id, vip);
                    System.out.println("Call received.");
                    break;

                case 2:
                    Call call = center.serveCall();
                    if (call != null) {
                        System.out.println("Serving customer: " + call.customerId);
                    } else {
                        System.out.println("No calls in queue.");
                    }
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    String cid = sc.nextLine();
                    System.out.println("Total calls this month: "
                            + center.getCallCount(cid));
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Call Center.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
