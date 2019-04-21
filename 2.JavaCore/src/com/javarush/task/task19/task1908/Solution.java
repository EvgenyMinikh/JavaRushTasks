package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName2));
        String line = "";
        String stPattern = "\\b\\d+\\b";
        Pattern pattern = Pattern.compile(stPattern);

        while ((line = fr.readLine())!= null) {
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()) {
                fw.write(matcher.group() + " ");

            }
        }

        fw.close();
        fr.close();
    }
}
