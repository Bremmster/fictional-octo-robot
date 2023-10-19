package com.karlson;

import com.karlson.questions.Question;
import com.karlson.scanner.UserInputManager;

import java.util.List;

public class App {

    private final List<Question> questions;
    private int questionsTaken = 0;
    private int correctAnswers = 0;

    public App(List<Question> questions) {
        this.questions = questions;
        askQuestions();
        printScore();
        printBadAnswers();
    }

    private void askQuestions() {

        while (questionsTaken < questions.size()) {
//          questionsTaken is the counter in loop, class variable to enable tracking of % score
            System.out.print(questions.get(questionsTaken).prompt() + "\nenter your option: ");

            int usrInput = UserInputManager.getLimitedInt(1, 4);

            if (usrInput == questions.get(questionsTaken).getAnswer()) {
                this.correctAnswers++;
                questions.get(questionsTaken).setCorrectAnswer(true);
            } else System.out.println("wrong answer");
            questionsTaken++;
        }
    }

    private void printScore() {
        double percentage = (double) (correctAnswers * 100) / questionsTaken;
        System.out.println("Questions taken: " + questionsTaken + "\nCorrect answers: " + correctAnswers + "\nPercentage: " + percentage);
    }

    private void printBadAnswers() {
        System.out.println("questions you need to practice more:");
        for (Question question : questions) {
            if (!question.wasCorrectAnswer()) {
                System.out.println(" " + question.getQuiz());
            }
        }
    }
}

