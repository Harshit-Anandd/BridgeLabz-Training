package com.annotations.logtime;
import java.util.Scanner;

public class LogExecutionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutionLogic logic = new ExecutionLogic();

        while (true) {
            System.out.println("\n--- @LogExecutionTime Menu ---");
            System.out.println("1. Run and Log Methods");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) logic.invokeAndLog();
        }
        sc.close();
    }
}
