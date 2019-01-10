package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String[] season = {"Зима", "Зима",
                "Весна", "Весна", "Весна",
                "Лето", "Лето", "Лето",
                "Осень", "Осень", "Осень", "Зима"};
        System.out.println(season[month - 1].toLowerCase());
    }
}