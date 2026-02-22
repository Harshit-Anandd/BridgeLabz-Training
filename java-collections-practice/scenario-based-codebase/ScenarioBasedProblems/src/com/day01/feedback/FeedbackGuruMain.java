package com.day01.feedback;

import java.util.Scanner;

public class FeedbackGuruMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FeedbackGuruService<String> service =
                new FeedbackGuruService<>();

        boolean running = true;

        while (running) {

            System.out.println("\n1.Read File  2.Display  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter file path: ");
                    service.readFile(sc.nextLine());
                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

        sc.close();
    }
}