package com.karlson;

import com.karlson.questions.Question;

import java.util.List;
import java.util.Scanner;

public class App {

    private List<Question> questions;

    private int questionsTaken = 0;
    private int correctAnswers = 0;


    public void game() {

        askQuestions();

    }

    private void askQuestions() {

        for (Question question : questions) {

            System.out.println(question.toString());
            System.out.println("enter your option: ");
            Scanner scanner = new Scanner(System.in);

            String usrInput = scanner.nextLine();

            if (usrInput.equalsIgnoreCase(question.getAnswer())) {
                correctAnswers++;
            }
        }
    }


}