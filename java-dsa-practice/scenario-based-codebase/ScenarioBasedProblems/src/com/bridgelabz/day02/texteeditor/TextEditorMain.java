package com.bridgelabz.day02.texteeditor;

import java.util.Scanner;

public class TextEditorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        boolean running = true;

        while (running) {

            System.out.println("\n------ Text Editor Menu ------");
            System.out.println("1. Insert text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. View text");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text to insert: ");
                    String text = sc.nextLine();
                    editor.insert(text);
                    System.out.println("Text inserted.");
                    break;

                case 2:
                    editor.undo();
                    System.out.println("Undo performed.");
                    break;

                case 3:
                    editor.redo();
                    System.out.println("Redo performed.");
                    break;

                case 4:
                    System.out.println("Current Text: " + editor.getText());
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Text Editor.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
