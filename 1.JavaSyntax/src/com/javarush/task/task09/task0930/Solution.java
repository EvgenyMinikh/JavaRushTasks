package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        //isGreaterThan("1","4");
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                nums.add(Integer.parseInt(array[i]));
                array[i] = "1";
            } else {
                strs.add(array[i]);
                array[i] = "string";
            }
        }

        Collections.sort(strs);
        Collections.sort(nums);
        int numsLength = nums.size();

        for (int i = 0; i < numsLength / 2; i++) {
            int buff = nums.get(i);
            nums.set(i, nums.get(numsLength - 1 - i));
            nums.set(numsLength - 1 - i, buff);
        }

        Iterator<String> iter_st = strs.iterator();
        Iterator<Integer> iter_num = nums.iterator();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("1")) {
                array[i] = String.valueOf(iter_num.next());
            } else {
                array[i] = iter_st.next();
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
