package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream((new Scanner(System.in)).next());
        byte[] file2 = readFile();
        byte[] file3 = readFile();

        fos.write(file2, 0, file2.length);
        fos.write(file3, 0, file3.length);

        fos.close();
    }

    public static byte[] readFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        FileInputStream fis = new FileInputStream(fileName);

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();

        return buffer;
    }
}
