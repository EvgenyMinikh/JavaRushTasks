package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int n = 20;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        reader.close();

        Arrays.sort(array);

        int maximum = array[n-1];
        int minimum = array[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
