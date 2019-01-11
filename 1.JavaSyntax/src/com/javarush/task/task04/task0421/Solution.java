package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        compare(name1, name2);
    }

    private static void compare(String name1, String name2) {
        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
            return;
        }

        if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
