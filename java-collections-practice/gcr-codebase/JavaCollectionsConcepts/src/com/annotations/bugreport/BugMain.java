package com.annotations.bugreport;
import java.util.Scanner;

public class BugMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BugLogic logic = new BugLogic();

        while (true) {
            System.out.println("\n--- @BugReport Repeatable Annotation Menu ---");
            System.out.println("1. View Bug Reports");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) logic.displayBugs();
        }
        sc.close();
    }
}
