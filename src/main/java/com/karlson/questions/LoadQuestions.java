package com.karlson.questions;

import java.util.ArrayList;
import java.util.List;

public class LoadQuestions {


    public List<Question> load(List<List<String>> csvForm) {
        List<Question> questions = new ArrayList<>();
        return makeQuestionList(csvForm, questions);
    }

    /**
     * @param csvForm   a List<List<String>> with formatted in csv
     *                  Question, (int) correct answer , answerA, answerB, answerC (optional), answerB (optional)
     * @param questions List to fill with questions
     * @return list filled with questions
     */
    private List<Question> makeQuestionList(List<List<String>> csvForm, List<Question> questions) {

        for (List<String> csvString : csvForm) {

            int size = csvString.size();
            Question question = questionFactory(size, csvString);

            if (question != null) {
                questions.add(question);
            }
        }
        return questions;
    }

    private Question questionFactory(int size, List<String> csvString) {
        Question question;
        switch (size) {
            case 4 -> {
                question = new Question.QuestionBuilder()
                        .setQuiz(csvString.get(0))
                        .setAnswer(csvString.get(1))
                        .setOptionA(csvString.get(2))
                        .setOptionB(csvString.get(3))
                        .build();
                return question;
            }

            case 5 -> {
                question = new Question.QuestionBuilder()
                        .setQuiz(csvString.get(0))
                        .setAnswer(csvString.get(1))
                        .setOptionA(csvString.get(2))
                        .setOptionB(csvString.get(3))
                        .setOptionC(csvString.get(4))
                        .build();
                return question;
            }

            case 6 -> {
                question = new Question.QuestionBuilder()
                        .setQuiz(csvString.get(0))
                        .setAnswer(csvString.get(1))
                        .setOptionA(csvString.get(2))
                        .setOptionB(csvString.get(3))
                        .setOptionC(csvString.get(4))
                        .setOptionD(csvString.get(5))
                        .build();
                return question;
            }
            default -> System.out.println("Error questions size out of bound");
        }
        return null;
    }
}
