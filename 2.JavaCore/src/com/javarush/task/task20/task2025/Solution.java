package com.javarush.task.task20.task2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        ArrayList<Long> Results = new ArrayList<>();
        long digit = 1;

        while (digit < N) {
            long sum = 0;
            ArrayList<Byte> numerals = new ArrayList<>();
            String digitString = String.valueOf(digit);
            byte M = (byte) digitString.length();

            for(int index = 0; index < M; index++) {
                numerals.add((byte)Character.digit(digitString.charAt(index), 10));
            }

            for (byte num : numerals) {
                sum += Math.pow(num, M);
                if (sum > digit) {
                    break;
                }
            }

            if (sum > digit) {
                digit++;
                continue;
            }

            if (sum == digit) {
                Results.add(digit);
                System.out.println(digit);
            }

            digit++;
        }

        long[] result = new long[Results.size()];
        for(int i = 0; i < Results.size(); i++) {
            result[i] = Results.get(i);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the number: ");
//        long N = Long.parseLong(reader.readLine());
        long N = Long.MAX_VALUE;
        getNumbers(N);
//        System.out.println(String.valueOf(N).length());
    }
}
