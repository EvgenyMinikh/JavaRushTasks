package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array.add(String.valueOf(i));
        }

        System.out.println(array.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(array.get(i));
        }
    }
}
