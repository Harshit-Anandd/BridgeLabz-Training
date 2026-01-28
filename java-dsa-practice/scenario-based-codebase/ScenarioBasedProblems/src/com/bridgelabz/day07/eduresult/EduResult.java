package com.bridgelabz.day07.eduresult;
import java.util.Scanner;

public class EduResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result[] results = new Result[50];
        int count = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add  2.Sort  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();
                    results[count++] = new Result(name, marks);
                    break;

                case 2:
                    ResultSorter.mergeSort(results, 0, count - 1);
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        System.out.println((i + 1) + ". " + results[i]);
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}