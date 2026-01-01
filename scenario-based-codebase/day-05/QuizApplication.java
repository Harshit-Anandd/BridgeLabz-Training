// Create class QuizApplication that conducts a Java quiz and rates user performance

import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Array of quiz questions
        String[] questions = {
            "1. What is the size of int in Java? (a) 2 bytes (b) 4 bytes (c) 8 bytes",
            "2. Which keyword is used to inherit a class? (a) extends (b) implements (c) this",
            "3. Who developed Java? (a) Microsoft (b) Google (c) Sun Microsystems",
            "4. What is the default value of boolean? (a) true (b) false (c) null",
            "5. Arrays in Java are? (a) Primitive (b) Objects (c) None"
        };

        // Array of correct answers
        char[] answers = {'b', 'a', 'c', 'b', 'b'};

        // Variable to track score
        int score = 0;

        System.out.println("--- Java Quiz Application ---");
        System.out.println("Please answer a, b, or c.");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your Answer: ");
            char input = sc.next().toLowerCase().charAt(0);

            // Check if answer is correct
            if (input == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        // Display final score
        System.out.println("\n-----------------------");
        System.out.println("Final Score: " + score + "/5");

        // Display rank based on score
        switch (score) {
            case 5: System.out.println("Rank: Expert"); break;
            case 4: System.out.println("Rank: Proficient"); break;
            case 3: System.out.println("Rank: Intermediate"); break;
            default: System.out.println("Rank: Beginner - Keep Practicing!");
        }

        // Close the scanner stream
        sc.close();
    }
}