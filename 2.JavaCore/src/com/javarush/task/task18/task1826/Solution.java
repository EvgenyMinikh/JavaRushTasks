package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        String operation = args[0];
        String inputFile = args[1];
        String outputFile = args[2];

        byte key = 1;
        if (operation.equals("-e")) {key = 1;}
        if (operation.equals("-d")) {key = -1;}

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        cypherFunction(key, buffer, fos);
        fos.close();
        fis.close();
    }

    public static void cypherFunction(byte key, byte[] data, FileOutputStream fos) throws Exception {
        for (int i = 0; i < data.length; i++) {
            data[i] += key;
        }

        fos.write(data);
    }

}
