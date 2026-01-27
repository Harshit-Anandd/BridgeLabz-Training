package com.bridgelabz.day03.examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private Map<Integer, String> answers = new HashMap<>();
    private Map<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public void visitQuestion(int qid) {
        navigationStack.push(qid);
        System.out.println("Visited Question " + qid);
    }

    public void submitAnswer(int qid, String ans) {
        answers.put(qid, ans);
        System.out.println("Answer recorded.");
    }

    public void reviewLastQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No navigation history.");
            return;
        }
        System.out.println("Last visited question: " + navigationStack.peek());
    }

    public void evaluate() {
        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (correctAnswers.get(qid).equals(answers.get(qid))) {
                score++;
            }
        }
        System.out.println("Final Score: " + score);
    }
}