package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);

        reader.close();
    }


    public static int min(int a, int b, int c, int d, int e) {

        int[] args = new int[5];

        args[0] = a;
        args[1] = b;
        args[2] = c;
        args[3] = d;
        args[4] = e;

        int result = args[0];

        for (int i = 1; i < args.length; i++) {
            result = (result < args[i])? result : args[i];
        }

        return result;
    }
}
