package com.annotations.importantmethod;
import java.util.Scanner;

public class ImportantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImportantLogic logic = new ImportantLogic();

        while (true) {
            System.out.println("\n--- @ImportantMethod Menu ---");
            System.out.println("1. Scan for Important Methods");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) logic.scanImportantMethods();
        }
        sc.close();
    }
}
