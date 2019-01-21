package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        reader.close();

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(intArray[i]);
        }
    }
}

