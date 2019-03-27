package com.javarush.task.task18.task1801;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        int max = 0;

        while (fis.available() > 0) {
            int ch = fis.read();
            if (ch > max) {
                max = ch;
            }
        }

        System.out.println(max);
        fis.close();
    }
}
