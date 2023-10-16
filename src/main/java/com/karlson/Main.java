package com.karlson;

import com.karlson.questions.LoadQuestions;
import com.karlson.questions.ReadCsvQuestions;

/**
 * @author Kristian Karlson
 */
public class Main {
    public static void main(String[] args) {

        // Read the CSV file make List<Question> and inject to app
        new App(new LoadQuestions().load(new ReadCsvQuestions().fileReader()));
    }
}
