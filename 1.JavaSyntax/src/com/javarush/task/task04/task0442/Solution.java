package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            result += a;

            if (a == -1) {break;}
        }

        System.out.println(result);
        reader.close();
    }
}
