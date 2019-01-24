package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] init = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(init));

        for (int i = 0; i < 3; i++) {
            list.add(2*i + 1,"именно");
        }

        for (String st: list) {
            System.out.println(st);
        }
    }
}
