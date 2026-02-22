package com.day01.examscanner;

import java.util.*;

public class ExamScannerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamScannerService service =
                new ExamScannerService();

        boolean running = true;

        List<String> answerKey =
                Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        while (running) {

            System.out.println("\n1.Process File  2.Show Results  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter CSV file path: ");
                    service.processFile(
                            sc.nextLine(),
                            answerKey);
                    break;
                case 2:
                    service.displaySortedResults();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

        sc.close();
    }
}