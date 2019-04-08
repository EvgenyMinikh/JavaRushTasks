package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        HashMap<Character, Integer> map = new HashMap<>();

        while ((line = br.readLine()) != null) {
            for (char ch : line.toCharArray()) {

                if (map.containsKey(ch)) {
                    int value = map.get(ch);
                    value ++;
                    map.put(ch, value);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        br.close();

        SortedSet<Character> keys = new TreeSet<>(map.keySet());

        for (Character key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}
