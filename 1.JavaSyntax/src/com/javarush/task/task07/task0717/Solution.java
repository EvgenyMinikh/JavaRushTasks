package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 10;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        reader.close();
        ArrayList<String> result = doubleValues(list);

        for(String s: result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();
        String st = null;

        for (int i = 0; i < list.size(); i++) {
            st = list.get(i);
            res.add(st);
            res.add(st);
        }
        return res;
    }
}
