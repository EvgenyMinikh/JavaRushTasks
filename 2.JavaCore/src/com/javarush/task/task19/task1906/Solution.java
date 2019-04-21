package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileReader fr = new FileReader(fileName1);
        FileWriter fw = new FileWriter(fileName2);

        int counter = 1;

        while (fr.ready()) {
            char ch = (char) fr.read();
            if (counter % 2 == 0) {
                fw.write(ch);
            }

            counter++;
        }

        fr.close();
        fw.close();
    }
}
