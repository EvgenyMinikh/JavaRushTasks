package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("1, 2, 3, 4, 5, 6", ", ")));
    }

    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] result = new String[st.countTokens()];
        int i = 0;

        while (st.hasMoreTokens()) {
            result[i] = st.nextToken();
            i++;
        }
        return result;
    }
}
