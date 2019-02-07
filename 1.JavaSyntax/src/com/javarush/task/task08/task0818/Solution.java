package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        Random random = new Random();
        String name;
        int salary;

        for (int i = 0; i < 10; i++) {
            salary = random.nextInt(200) + 400;
            name = "Name" + i + "_" + i;
            map.put(name, salary);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() < 500 ) {
                iter.remove();
            }
        }
    }

    public static void mapPrint(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.printf("%s = %d\n", pair.getKey(), pair.getValue());
        }
        System.out.println("=====================");
    }

    public static void main(String[] args) {
/*        HashMap<String, Integer> map = createMap();
        mapPrint(map);
        removeItemFromMap(map);
        mapPrint(map); */
    }
}