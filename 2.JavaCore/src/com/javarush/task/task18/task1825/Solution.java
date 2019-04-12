package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listOfFiles = new ArrayList<>();

        String fileName = sc.next();
        String name = fileName.replaceAll("(.+)\\.part\\d+","$1");

        while (!fileName.equals("end")) {
            listOfFiles.add(fileName);
            fileName = sc.next();
        }

        sc.close();
        Collections.sort(listOfFiles);

        FileOutputStream fos = new FileOutputStream(name);

        for (String file : listOfFiles) {
            fileWriter(file, fos);
        }

        fos.close();
    }

    public static void fileWriter(String fileName, FileOutputStream fos) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        int count = fis.available();
        byte[] buffer = new byte[count];
        fis.read(buffer);
        fos.write(buffer);
        fis.close();
    }
}
