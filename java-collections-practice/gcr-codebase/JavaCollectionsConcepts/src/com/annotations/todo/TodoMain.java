package com.annotations.todo;
import java.util.Scanner;

public class TodoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoLogic logic = new TodoLogic();

        while (true) {
            System.out.println("\n--- @Todo Feature Menu ---");
            System.out.println("1. Display Pending Todos");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;
            if (choice == 1) logic.printTodos();
        }
        sc.close();
    }
}
