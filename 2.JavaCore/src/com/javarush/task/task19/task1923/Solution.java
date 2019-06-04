package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words)
                if (!word.matches("^\\D*$")) {
                    writer.write(word + " ");
                }

        }

        writer.close();
        reader.close();
    }
}
