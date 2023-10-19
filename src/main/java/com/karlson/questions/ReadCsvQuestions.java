package com.karlson.questions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final String FILE_TO_READ = "questionnaire/test.csv";
    private static final Logger LOGGER = LogManager.getLogger(ReadCsvQuestions.class);

    /**
     * @return list of CSV formatted strings
     */

    public List<List<String>> fileReader() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_TO_READ))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.charAt(0) == '#') continue;
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            LOGGER.error("Error reading from CSV file");
        }
        return records;
    }
}

