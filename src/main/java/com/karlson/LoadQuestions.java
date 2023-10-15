package com.karlson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kristian Karlson
 */
public class LoadQuestions {

    // todo BufferedReader
    public List<List<String>> readLine() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("questions/test.csv"))) {
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

