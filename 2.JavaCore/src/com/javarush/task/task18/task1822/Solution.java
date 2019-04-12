package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        sc.close();

        String ID = args[0];

        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = fr.readLine()) != null) {
            String id = line.split(" ")[0];

            if (id.equals(ID)) {
                System.out.println(line);
            }
        }

        fr.close();
    }
}
