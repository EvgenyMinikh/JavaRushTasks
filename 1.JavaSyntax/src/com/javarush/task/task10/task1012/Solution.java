package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();

        for (Character c : alphabet) {
            chars.put(c, 0);
        }

        ArrayList<Character> wordChars = new ArrayList<>();

        for (String word : list) {
            for (char c : word.toCharArray()) {
                wordChars.add(c);
            }
        }

        for (Character cc : wordChars) {
            if (alphabet.contains(cc)) {
                int counter = chars.get(cc);
                chars.put(cc, counter + 1);
            }
        }

        Object[] keys = chars.keySet().toArray();
        //Arrays.sort(keys);

        for (Object ch : keys) {
            System.out.printf("%c %d\n", ch, chars.get(ch));
        }
    }

}
