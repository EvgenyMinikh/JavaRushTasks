package com.javarush.task.task08.task0815;

import java.io.IOException;
import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        String name;
        String secondName;

        for (int i = 0; i < 10; i++) {
            secondName = "Name" + i + "_" + i;
            name = "Name" + i;
            map.put(secondName, name);
        }

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int result = 0;
        for (String nm : map.values()) {
            if (nm.equals(name)) {
                result++;
            }
        }
        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int result = 0;
        for (String nm : map.keySet()) {
            if (nm.equals(lastName)) {
                result++;
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
