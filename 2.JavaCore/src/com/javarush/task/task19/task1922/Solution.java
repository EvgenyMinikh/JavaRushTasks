package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
//        words.add("файл");
//        words.add("вид");
//        words.add("В");
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName = rd.readLine();
        rd.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        int counter = 0;

        while ((line = reader.readLine()) != null) {
            for(String word : line.split(" ")) {
                if (words.contains(word)) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.println(line);
            }
            counter = 0;
        }

        reader.close();
    }
}
