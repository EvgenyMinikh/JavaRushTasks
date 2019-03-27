package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.next();
        String file2 = sc.next();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            byte[] new_buffer = new byte[count];

            for(int i = count - 1; i >= 0; i--) {
                new_buffer[i] = buffer[count - i - 1];
            }
            outputStream.write(new_buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
