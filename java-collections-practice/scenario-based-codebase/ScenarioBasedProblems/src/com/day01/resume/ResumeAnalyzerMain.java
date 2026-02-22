package com.day01.resume;

import java.util.Scanner;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResumeAnalyzerService service =
                new ResumeAnalyzerService();

        boolean running = true;

        while (running) {

            System.out.println("\n1.Read Resumes  2.Display  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter folder path: ");
                    service.readResumes(sc.nextLine());
                    break;
                case 2:
                    service.displayCandidates();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

        sc.close();
    }
}