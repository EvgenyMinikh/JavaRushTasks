package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        String line;

        while (fr.ready()) {
            line = fr.readLine();
            char[] buffer = line.toCharArray();
            char[] resultArray = new char[buffer.length];

            for (int i = 0; i < buffer.length; i++) {
                resultArray[i] = buffer[buffer.length - i - 1];
            }

            for (char ch : resultArray) {
                System.out.print(ch);
            }

            System.out.println();
        }

        fr.close();
    }
}
