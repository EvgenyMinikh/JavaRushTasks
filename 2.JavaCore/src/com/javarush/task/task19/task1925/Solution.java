package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fr = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName2));

        String result = "";
        String line;

        while (fr.ready()) {
            line = fr.readLine();
            String[] splittedWords = line.split(" ");

            for(String word : splittedWords) {
                if (word.length() > 6) {
                    result = result + "," + word;
                }
            }
        }

        fr.close();

        fw.write(result, 1, result.length() - 1);
        fw.close();
    }
}
