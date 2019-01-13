package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int b = 1;

        while (b < 11) {
            String result = "";

            int a = 1;
            while (a < 11) {
                result = result + " " + a*b;
                a++;
                }

            System.out.println(result.trim());
            b++;
        }
    }
}
