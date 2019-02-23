package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fis));

        String line = "";
        ArrayList<Integer> list = new ArrayList<>();

        while ((line = fileReader.readLine()) != null) {
            Integer num = Integer.parseInt(line);

            if (num % 2 == 0) {
                list.add(num);
            }
        }

        Collections.sort(list);

        for (Integer num : list) {
            System.out.println(num);
        }

        fis.close();
        fileReader.close();
    }
}
