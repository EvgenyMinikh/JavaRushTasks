package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 5;
        ArrayList<String> stList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            stList.add(reader.readLine());
        }

        reader.close();

        stList.remove(2);

        for (int i = n-2; i >= 0; i--) {
            System.out.println(stList.get(i));
        }
    }
}


