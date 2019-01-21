package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 20;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 20; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
            if (i < n/2) {
                array1[i] = intArray[i];
            } else {
                array2[i - n/2] = intArray[i];
            }
        }

        reader.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}
