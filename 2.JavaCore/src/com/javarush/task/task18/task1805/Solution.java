package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(fileName);
        TreeSet<Integer> byteSet = new TreeSet<>();

        while (fis.available() > 0) {
            int ch = fis.read();
            byteSet.add(ch);
        }
        fis.close();

        String result = "";

        for (Integer num : byteSet) {
            result = result + " " + num;
        }

        System.out.println(result.trim());
    }
}
