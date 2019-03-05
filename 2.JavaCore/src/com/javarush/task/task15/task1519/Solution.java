package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = "";

        while (true) {
            st = reader.readLine();
            if (st.toLowerCase().equals("exit")) {break;}

            if (st.contains(".")) {
                try {
                    double num = Double.parseDouble(st);
                    print(num);
                    continue;
                } catch (NumberFormatException e) {
                    print(st);
                    continue;
                }
            }

            try {
                int num = Integer.parseInt(st);
                if (num > 0 && num < 128) {
                    print((short) num);
                    continue;
                }

                if (num <= 0 || num >= 128) {
                    print((int) num);
                }
            } catch (NumberFormatException e) {
                print(st);
            }
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
