package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName1));
        String line = "";
        String stPattern = "\\bworld\\b";
        Pattern pattern = Pattern.compile(stPattern);
        int counter = 0;
        while ((line = fr.readLine())!= null) {
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()) {
                counter++;
            }
        }

        System.out.println(counter);
        fr.close();
    }
}
