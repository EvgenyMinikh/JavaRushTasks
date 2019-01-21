package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stArray = new String[10];
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {
            stArray[i] = reader.readLine();
            intArray[i] = stArray[i].length();
        }

        reader.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[i]);
        }
    }
}
