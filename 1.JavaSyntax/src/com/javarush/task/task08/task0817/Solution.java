package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> lst = new ArrayList<String>(map.values());
        int count;

        for (String st : lst) {
            count = 0;

            for (String st2 : lst) {
                if (st.equals(st2)) {
                    count++;
                }

                if (count == 2) {
                    removeItemFromMapByValue(map, st);
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
