package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        int counter = 1;
        int result = 1;

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).equals(array.get(i+1))) {
                counter++;
                if (result <= counter) {result = counter;}
            } else {counter = 1;}
        }

        reader.close();
        System.out.println(result);
    }
}