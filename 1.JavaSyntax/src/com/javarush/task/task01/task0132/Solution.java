package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String num = String.valueOf(number);
        int result = 0;

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            result += (int) Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return result;
    }
}