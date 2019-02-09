package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date userDate = new Date(date);
        String numberOfDays = new SimpleDateFormat("D").format(userDate);
        return Integer.parseInt(numberOfDays) % 2 == 0 ? false : true;
    }
}
