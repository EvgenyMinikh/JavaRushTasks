package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 3;
        int[] nums = new int[count];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        getNumber(nums);
        reader.close();
    }

    private static void getNumber(int[] nums) {
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {positive ++;}
            if (nums[i] < 0) {negative ++;}
        }

        System.out.printf("количество отрицательных чисел: %d\nколичество положительных чисел: %d", negative, positive);
    }
}
