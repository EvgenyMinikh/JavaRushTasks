package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallon", df.parse("JUNE 2 1981"));
        map.put("Stal", df.parse("JUNE 3 1982"));
        map.put("Sta", df.parse("JUNE 4 1983"));
        map.put("St", df.parse("MARCH 1 1984"));
        map.put("Stall", df.parse("JUNE 5 1980"));
        map.put("S", df.parse("JUNE 6 1981"));
        map.put("Sone", df.parse("MAY 3 1981"));
        map.put("tall", df.parse("JUNE 9 1985"));
        map.put("Tallon", df.parse("JUNE 3 1989"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8 ) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}
