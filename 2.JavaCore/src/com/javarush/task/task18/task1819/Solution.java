package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.next();
        String fileName2 = sc.next();
//        String fileName1 = "d:\\1.txt";
//        String fileName2 = "d:\\2.txt";

        FileInputStream fis1 = new FileInputStream(fileName1);
        byte[] buffer1 = new byte[fis1.available()];
        fis1.read(buffer1);
        fis1.close();

        FileInputStream fis2 = new FileInputStream(fileName2);
        byte[] buffer2 = new byte[fis2.available()];
        fis2.read(buffer2);
        fis2.close();

        byte[] result = new byte[buffer1.length + buffer2.length];

        for (int i = 0; i < buffer2.length; i++) {
            result[i] = buffer2[i];
        }

        int bl = buffer2.length;

        for (int i = 0; i < buffer1.length; i++) {
            result[bl + i] = buffer1[i];
        }

        FileOutputStream fos = new FileOutputStream(fileName1);
        fos.write(result);
        fos.close();
    }
}
