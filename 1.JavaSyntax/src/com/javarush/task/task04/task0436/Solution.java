package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        String ss = "";

        for (int i = 0; i < n; i++) {
            ss += "8";
        }

        for (int i = 0; i < m; i++) {
            System.out.println(ss);
        }
    }
}
