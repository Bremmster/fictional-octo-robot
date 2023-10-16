package com.karlson.questions;

import java.util.ArrayList;
import java.util.List;

public class LoadQuestions {

    private ReadCsvQuestions readCsvQuestions;
    private List<List<String>> csvQuestionList;

    public LoadQuestions(ReadCsvQuestions readCsvQuestions) {
        this.readCsvQuestions = readCsvQuestions;
        this.csvQuestionList = readCsvQuestions.fileReader();
    }

    public List<Question> load() {
        List<Question> questions = new ArrayList<>();
        return makeQuestionObj(questions);
    }

    private List<Question> makeQuestionObj(List<Question> questions) {
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
        return questions;
    }
}
