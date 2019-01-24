package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int n = 10;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        reader.close();
        String st = list.get(0);

        for (int i = 1; i < n; i++) {
            if (list.get(i).length() < st.length()) {
                System.out.println(i);
                break;
            }

            st = list.get(i);
        }
    }
}

