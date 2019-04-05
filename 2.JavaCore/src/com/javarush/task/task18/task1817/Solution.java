package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        FileReader fr = new FileReader(fileName);
        int counter = 0;
        int spaceCounter = 0;
        int ch;

        while ((ch = fr.read()) != -1) {
            counter++;
            char Ch = Character.toLowerCase((char) ch);
            byte num = (byte) Ch;

            if (num == 32) {
                spaceCounter++;
            }
        }

        System.out.printf("%.2f",spaceCounter *100.0 / counter);
        fr.close();
    }
}
