package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        getQuery(map);
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }

            if (result.length() == 0) {
                result.append(String.format("%s = '%s'",entry.getKey(), entry.getValue()));
            } else {
                result.append(String.format(" and %s = '%s'", entry.getKey(), entry.getValue()));
            }
        }

        return result.toString();
    }
}
