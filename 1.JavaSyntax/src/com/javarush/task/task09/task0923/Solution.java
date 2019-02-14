package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();
        char[] chars = st.toCharArray();

        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> sogl = new ArrayList<>();

        for (char ch : chars) {
            if (ch == ' ') {continue;}

            if (isVowel(ch)) {
                glas.add(ch);
            } else {
                sogl.add(ch);
            }
        }

        listPrint(glas);
        listPrint(sogl);
    }

    public static void listPrint(ArrayList<Character> list) {
        String result = "";

        for (Character ch : list) {
            result = result + " " + ch;
        }

        System.out.println(result + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}