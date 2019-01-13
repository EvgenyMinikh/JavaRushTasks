package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        getQuadrant(a, b);
        reader.close();
    }

    private static void getQuadrant(int a, int b) {
        if (a > 0) {
            if (b > 0) {
                System.out.println(1);
                return;
            }

            if (b < 0) {
                System.out.println(4);
                return;
            }
        }

        if (a < 0) {
            if (b > 0) {
                System.out.println(2);
                return;
            }

            if (b < 0) {
                System.out.println(3);
                return;
            }
        }
    }
}
