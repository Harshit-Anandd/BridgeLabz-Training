package com.annotations.taskinfo;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskLogic logic = new TaskLogic();

        while (true) {
            System.out.println("\n--- @TaskInfo Custom Annotation Menu ---");
            System.out.println("1. Inspect Annotated Tasks");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) logic.inspectTasks();
        }
        sc.close();
    }
}
