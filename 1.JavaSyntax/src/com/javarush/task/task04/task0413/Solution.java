package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if ((num < 1) || (num > 7)) {
            System.out.println("такого дня недели не существует");
        } else {
            System.out.println(week[num - 1]);
        }
        reader.close();
    }
}