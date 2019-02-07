package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();

        map.put("1", "A");
        map.put("1", "B");
        map.put("1", "C");
        map.put("1", "A");
        map.put("2", "A");
        map.put("2", "F");
        map.put("3", "T");
        map.put("4", "H");
        map.put("5", "E");
        map.put("6", "A");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
