package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String name = " ";
        String stId = " ";
        int id = 0;

        while (true) {
            stId = reader.readLine();
            if (stId.length() == 0) {
                break;
            }

            name = reader.readLine();
            if (name.length() == 0) {
                map.put("", Integer.parseInt(stId));
                break;
            }

            id = Integer.parseInt(stId);
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%d %s\n", entry.getValue(), entry.getKey());
        }
    }
}
