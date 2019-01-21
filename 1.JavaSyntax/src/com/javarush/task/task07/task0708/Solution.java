package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        String st = "";
        int[] len = new int[5];
        int max = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            st = reader.readLine();
            strings.add(st);
            max = (st.length() > max)? st.length() : max;
            len[i] = st.length();
        }

        reader.close();

        for (int i = 0; i < 5; i++) {
            if (len[i] == max) {
                System.out.println(strings.get(i));
            }
        }
    }
}
