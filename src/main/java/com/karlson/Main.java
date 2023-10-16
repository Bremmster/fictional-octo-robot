package com.karlson;

import com.karlson.questions.LoadQuestions;
import com.karlson.questions.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristian Karlson
 */
public class Main {
    public static void main(String[] args) {

        LoadQuestions loadQuestions = new LoadQuestions();
        System.out.println("Visar obehandlad CSV");
        System.out.println(loadQuestions.fileReader());

        System.out.println("Ska formatera frågor rätt som objekt");
        List<List<String>> csvQuestionList = loadQuestions.fileReader();
        List<Question> questions = new ArrayList<>();
        for (List<String> csvString : csvQuestionList) {
            Question question = new Question.QuestionBuilder()
                    .setQuiz(csvString.get(0))
                    .setAnswer(csvString.get(1))
                    .setOptionA(csvString.get(2))
                    .setOptionB(csvString.get(3))
                    .setOptionC(csvString.get(4))
                    .setOptionD(csvString.get(5))
                    .build();
            questions.add(question);
        }

        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i).toString());
        }
    }


}
