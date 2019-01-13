package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
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
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("положительное четное число");
                return;
            }
            else {
                System.out.println("положительное нечетное число");
                return;
            }
        }

        if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("отрицательное четное число");
                return;
            }
            else {
                System.out.println("отрицательное нечетное число");
                return;
            }
        }
        else {
            System.out.println("ноль");
        }
    }
}
