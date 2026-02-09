package com.reflections.retrieveannotations;

import java.util.Scanner;

public class Annotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnnotationReader reader = new AnnotationReader();

        while (true) {
            System.out.println("\n--- Annotation Reader ---");
            System.out.println("1. Read Annotation from Book class");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 2) break;

            if (choice == 1) {
                reader.readAuthorAnnotation(new Book());
            }
        }
        sc.close();
    }
}