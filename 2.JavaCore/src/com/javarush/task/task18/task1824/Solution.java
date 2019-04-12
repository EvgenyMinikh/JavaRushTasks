package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String fileName = "";
        ArrayList<FileInputStream> array = new ArrayList<>();
        try {
            while (true) {
                fileName = sc.next();
                FileInputStream fis = new FileInputStream(fileName);
                array.add(fis);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
            for (int i = 0; i < array.size(); i++) {
                array.get(i).close();
            }
        }
    }
}
