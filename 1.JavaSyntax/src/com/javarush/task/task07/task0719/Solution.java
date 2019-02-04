package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int n = 10;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        reader.close();

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(n-i-1));
        }
    }
}
