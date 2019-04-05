package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        FileReader fr = new FileReader(fileName);
        int counter = 0;
        int ch;

        while ((ch = fr.read()) != -1) {
            char Ch = Character.toLowerCase((char) ch);
            byte num = (byte) Ch;
            if (num <= 122 && num >= 97) {
                counter++;
            }
        }

        System.out.println(counter);
        fr.close();
    }
}
