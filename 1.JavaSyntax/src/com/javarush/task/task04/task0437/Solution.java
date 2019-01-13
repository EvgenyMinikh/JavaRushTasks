package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            String ss = "";

            for (int j = 1; j < i+1; j++) {
                ss += "8";
            }

            System.out.println(ss);
        }

    }
}
