package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        String file1 = sc.next();
        String file2 = sc.next();

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos1 = new FileOutputStream(file1);
        FileOutputStream fos2 = new FileOutputStream(file2);

        if (fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            int count = fis.read(buffer);


            int firstPart = count / 2 + count % 2;
            int secondPart = count - firstPart;

            fos1.write(buffer, 0, firstPart);
            fos2.write(buffer, firstPart, secondPart);

        }

        fos1.close();
        fos2.close();
        fis.close();
    }
}
