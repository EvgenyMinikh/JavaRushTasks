package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String s = "";

        while (true) {
            s = reader.readLine();
            if (s.equals("сумма")) {break;}

            result += Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
