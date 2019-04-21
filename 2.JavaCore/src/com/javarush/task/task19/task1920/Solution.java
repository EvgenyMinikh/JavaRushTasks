package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        TreeMap<String, Double> map = new TreeMap<>();
        String line = "";

        while ((line = reader.readLine()) != null) {
            String name = line.split(" ")[0];
            double value = Double.parseDouble(line.split(" ")[1]);

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + value);
            } else {
                map.put(name, value);
            }
        }

        double max = Collections.max(map.values());

        for(String key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println(key);
            }
        }

        reader.close();
    }
}
