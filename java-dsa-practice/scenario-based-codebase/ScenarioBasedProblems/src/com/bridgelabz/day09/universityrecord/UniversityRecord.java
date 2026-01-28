package com.bridgelabz.day09.universityrecord;
import java.util.Scanner;

public class UniversityRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentBST bst = new StudentBST();
        boolean running = true;

        while (running) {

            System.out.println("\n1.Insert  2.Delete  3.Display Sorted  4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    bst.insert(roll, name);
                    break;

                case 2:
                    System.out.print("Roll No to delete: ");
                    bst.delete(sc.nextInt());
                    break;

                case 3:
                    bst.displayInOrder();
                    break;

                case 4:
                    running = false;
            }
        }
        sc.close();
    }
}