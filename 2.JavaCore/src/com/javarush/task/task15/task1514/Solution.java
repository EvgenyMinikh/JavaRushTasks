package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put((double) 0, "000");
        labels.put((double) 1, "111");
        labels.put((double) 2, "222");
        labels.put((double) 3, "333");
        labels.put((double) 4, "444");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
