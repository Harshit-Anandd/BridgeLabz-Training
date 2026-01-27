package com.bridgelabz.day04.examcell;

import java.util.Scanner;

public class ExamCellMain {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[50];
        int count = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n------ Exam Cell Menu ------");
            System.out.println("1. Add student");
            System.out.println("2. Generate rank list");
            System.out.println("3. Display ranks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();
                    students[count++] = new Student(name, score);
                    break;

                case 2:
                    ExamCell.mergeSort(students, 0, count - 1);
                    System.out.println("Rank list generated.");
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + students[i]);
                    }
                    break;

                case 4:
                    running = false;
                    break;
            }
        }
        sc.close();
    }
}
