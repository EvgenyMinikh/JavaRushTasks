package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/
public class Solution {
    private static long cntSearch;
    private static int N;
    private static int[] digitsMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;

    private static void genPows(int N) {
        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long pow) {
        cntSearch++;
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        int[] testMultiSet = new int[10];

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }

        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (digit == 10) {
            if (check(pow)) results.add(pow);
            return;
        }

        if (digit == 9) {
            digitsMultiSet[digit] = unused;
            search(digit + 1, 0, pow + unused * pows[digit][N]);
        } else {
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit + 1, unused - i, pow + i * pows[digit][N]);
            }
        }
    }

    public static long[] getNumbers(long Number) {
        int maxN = String.valueOf(Number).length();

        genPows(maxN);
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        cntSearch = 0;

        for (N = 1; N <= maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);

            search(0, N, 0);
        }

        Collections.sort(results);
        Iterator<Long> iter = results.iterator();
        while (iter.hasNext()) {
            long value = iter.next();
            if (value >= Number) {
                iter.remove();
            }
        }

        long[] result = new long[results.size()];

        for(int i = 0; i < results.size(); i++) {
            if ((results.get(i) != 0) && (results.get(i) <= Number))  {
                result[i] = results.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long Nr = Long.MAX_VALUE;
        long[] myArray = getNumbers(Nr);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
