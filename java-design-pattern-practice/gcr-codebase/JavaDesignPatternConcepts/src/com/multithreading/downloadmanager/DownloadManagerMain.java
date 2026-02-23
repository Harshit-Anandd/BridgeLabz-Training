package com.multithreading.downloadmanager;
import java.util.Scanner;
public class DownloadManagerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DownloadService service = new DownloadService();
        while (true) {
            System.out.println("\n1. Using Thread Class");
            System.out.println("2. Using Runnable Interface");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            if (choice == 1) service.downloadUsingThread();
            else if (choice == 2) service.downloadUsingRunnable();
            else System.exit(0);
        }
    }
}