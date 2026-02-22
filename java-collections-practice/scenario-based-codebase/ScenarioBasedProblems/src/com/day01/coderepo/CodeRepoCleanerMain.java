package com.day01.coderepo;

import java.util.Scanner;

public class CodeRepoCleanerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CodeRepoCleanerService service =
                new CodeRepoCleanerService();

        boolean running = true;

        while (running) {

            System.out.println("\n1.Scan Folder  2.Report  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter folder path: ");
                    service.scanFolder(sc.nextLine());
                    break;
                case 2:
                    service.displayReport();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

        sc.close();
    }
}