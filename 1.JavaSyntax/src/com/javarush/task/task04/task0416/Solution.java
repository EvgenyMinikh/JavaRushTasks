package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double min = Double.parseDouble(reader.readLine());
        double num = min % 5;

        System.out.println(getColor(num));

        reader.close();
    }

    private static String getColor(double num) {
        if (num >= 0 && num < 3) return "зеленый";
        if (num >= 3 && num < 4) return "желтый";
        if (num >= 4 && num < 5) return "красный";
        return null;
    }
}