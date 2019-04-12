package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();

        while (!fileName.equals("exit")) {
            ReadThread thread = new ReadThread(fileName);
            thread.start();

            fileName = sc.next();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            try {
                FileInputStream fis = new FileInputStream(this.fileName);
                int count = fis.available();
                byte[] buffer = new byte[count];
                fis.read(buffer);
                fis.close();

                int[] array = new int[256];

                for (byte num : buffer) {
                    array[num]++;
                }

                int ch = 0;
                int max_value = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] >= max_value) {
                        max_value = array[i];
                        ch = i;
                    }
                }

                resultMap.put(fileName, ch);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
