package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>strings = new ArrayList<>();
        int n = 10;
        String st = null;
        int[] len = new int[n];
        int min = Integer.MAX_VALUE;
        int max = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            st = reader.readLine();
            strings.add(st);
            min = (st.length() < min)? st.length() : min;
            max = (st.length() > max)? st.length() : max;
            len[i] = st.length();
        }

        reader.close();

        for (int i = 0; i < n; i++) {
            if ((len[i] == min) || (len[i] == max)) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
