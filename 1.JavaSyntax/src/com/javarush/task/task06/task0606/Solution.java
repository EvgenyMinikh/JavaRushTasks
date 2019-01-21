package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            int num = ch - '0';
            if (num % 2 == 0) {
                even ++;
            } else {
                odd++;
            }
        }

        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
