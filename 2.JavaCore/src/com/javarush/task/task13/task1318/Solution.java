package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            FileInputStream stream = new FileInputStream(fileName);
            int i = -1;

            while((i = stream.read()) != -1) {
                System.out.print((char)i);
            }

            stream.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}