package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(fileName);
        int counter = 0;

        while (fis.available() > 0) {
            int ch = fis.read();
            if (ch == (int)',') {
                counter++;
            }
        }

        System.out.println(counter);
        fis.close();
    }
}
