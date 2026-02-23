package com.multithreading.bankingsystem;
import java.util.Scanner;
public class BankingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingService service = new BankingService();
        while (true) {
            System.out.println("\n1. Process Transactions");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            if (choice == 1) service.processTransactions();
            else System.exit(0);
        }
    }
}