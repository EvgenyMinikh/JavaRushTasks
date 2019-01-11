package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (isExist(a, b, c)) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }

    private static boolean isExist(int a, int b, int c) {
        if (a + b <= c) return false;
        if (b + c <= a) return false;
        if (a + c <= b) return false;

        return true;
    }
}