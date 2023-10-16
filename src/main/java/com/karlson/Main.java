package com.karlson;

import com.karlson.questions.LoadQuestions;
import com.karlson.questions.ReadCsvQuestions;
import com.karlson.questions.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristian Karlson
 */
public class Main {
    public static void main(String[] args) {
        // Read the CSV file and in preparation of injection a List<Question> to app
        LoadQuestions questions = new LoadQuestions(new ReadCsvQuestions().fileReader());

        new App(questions.load()); // inject the question list

    }


}
