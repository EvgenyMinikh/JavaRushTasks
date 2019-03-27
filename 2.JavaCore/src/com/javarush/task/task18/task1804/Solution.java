package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(fileName);
        HashMap<Integer, Integer> map = new HashMap<>();

        while (fis.available() > 0) {
            int ch = fis.read();
            int value = map.get(ch) == null ? 0 : map.get(ch);
            value++;
            map.put(ch, value);
        }
        fis.close();

        int min = Collections.min(map.values());
        String result = "";

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                result = result + " " + entry.getKey();
            }
        }

        System.out.println(result.trim());
    }
}
