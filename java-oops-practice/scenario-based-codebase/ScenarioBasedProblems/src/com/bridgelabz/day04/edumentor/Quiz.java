package com.bridgelabz.day04.edumentor;

import java.util.List;
import java.util.ArrayList;
// 3. Quiz Class (Encapsulation)
public class Quiz {
    private List<String> questions;
    private List<String> correctAnswers; // Private: Cannot be seen/modified externally
    private int difficultyLevel; // 1 to 5

    public Quiz(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
        this.questions = new ArrayList<>();
        this.correctAnswers = new ArrayList<>();
    }

    public void addQuestion(String question, String answer) {
        questions.add(question);
        correctAnswers.add(answer);
    }

    // Logic: Score calculation
    public double attemptQuiz(List<String> userAnswers) {
        int score = 0;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (i < correctAnswers.size() && userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                score++;
            }
        }
        return ((double) score / questions.size()) * 100;
    }
}