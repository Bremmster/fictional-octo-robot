package com.karlson.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kristian Karlson
 */
public class ReadCsvQuestions {

    private final String fileToRead = "questions/test.csv";
// todo add contructor that inputs file location

    /**
     * @return list of CSV formatted strings
     */

    public List<List<String>> fileReader() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
}

