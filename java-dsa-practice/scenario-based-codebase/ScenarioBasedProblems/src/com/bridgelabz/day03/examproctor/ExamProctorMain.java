package com.bridgelabz.day03.examproctor;

import java.util.Scanner;

public class ExamProctorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Exam Proctor Menu ------");
            System.out.println("1. Visit question");
            System.out.println("2. Submit answer");
            System.out.println("3. Review last question");
            System.out.println("4. Submit exam");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter question ID: ");
                    int qid = sc.nextInt();
                    exam.visitQuestion(qid);
                    break;

                case 2:
                    System.out.print("Enter question ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter answer: ");
                    String ans = sc.nextLine();
                    exam.submitAnswer(id, ans);
                    break;

                case 3:
                    exam.reviewLastQuestion();
                    break;

                case 4:
                    exam.evaluate();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Exam Proctor.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}