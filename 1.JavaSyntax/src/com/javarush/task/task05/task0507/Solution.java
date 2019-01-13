package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int counter = 0;

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {break;}
            counter ++;
            result += a;
        }

        System.out.println((double) result / counter);
        reader.close();
    }
}

