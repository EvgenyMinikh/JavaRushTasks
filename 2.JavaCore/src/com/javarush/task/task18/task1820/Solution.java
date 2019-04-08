package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        FileWriter fileWriter = new FileWriter(fileName2);

        String line;
        String result = "";

        while ((line = fileReader.readLine()) != null) {
            int num = Math.round(Float.parseFloat(line));
            result = result + " " + String.valueOf(num);
        }

        fileWriter.write(result.trim());
        fileReader.close();
        fileWriter.close();
    }
}
