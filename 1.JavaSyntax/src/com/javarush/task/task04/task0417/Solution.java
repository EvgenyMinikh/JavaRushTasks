package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        compareNums(a, b, c);
        reader.close();
    }

    private static void compareNums(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.printf("%d %d %d", a, b, c);
            return;
        }

        if (a == b) System.out.printf("%d %d",a, b);
        if (b == c) System.out.printf("%d %d",b, c);
        if (a == c) System.out.printf("%d %d",a, c);
    }
}