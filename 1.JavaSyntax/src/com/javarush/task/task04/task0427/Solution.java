package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        getResult(a);
        reader.close();
    }

    private static void getResult(int a) {
        if ((a < 1) || (a > 999)) {return;}

        String result = "";
        if (a < 10) {
            result = (isOdd(a))? "четное однозначное число" : "нечетное однозначное число";
            System.out.println(result);
            return;
        }

        if (a < 100) {
            result = (isOdd(a))? "четное двузначное число" : "нечетное двузначное число";
            System.out.println(result);
            return;
        }

        if (a < 1000) {
            result = (isOdd(a))? "четное трехзначное число" : "нечетное трехзначное число";
            System.out.println(result);
            return;
        }
    }

    private static boolean isOdd(int a) {
        return (a % 2 == 0)? true : false;
    }
}
