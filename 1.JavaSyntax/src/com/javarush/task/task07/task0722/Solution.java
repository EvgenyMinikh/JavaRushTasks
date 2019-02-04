package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String st = reader.readLine();

        while (!st.equals("end")) {
            list.add(st);
            st = reader.readLine();
        }

        reader.close();

        for (String s: list) {
            System.out.println(s);
        }
    }
}