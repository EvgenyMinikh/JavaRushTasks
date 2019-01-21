package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>strings = new ArrayList<>();
        String st = "";
        int[] len = new int[5];
        int min = Integer.MAX_VALUE;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            st = reader.readLine();
            strings.add(st);
            min = (st.length() < min)? st.length() : min;
            len[i] = st.length();
        }

        reader.close();

        for (int i = 0; i < 5; i++) {
            if (len[i] == min) {
                System.out.println(strings.get(i));
            }
        }
    }
}
