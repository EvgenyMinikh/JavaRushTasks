package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 15;
        int even = 0;
        int odd = 0;
        int[] intArray = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());

            if ((i % 2 == 0)) {
                even += intArray[i];
            } else {
                odd += intArray[i];
            }
        }

        String result = (even > odd) ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);
    }
}
