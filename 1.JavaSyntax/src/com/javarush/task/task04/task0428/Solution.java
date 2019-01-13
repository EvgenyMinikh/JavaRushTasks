package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        System.out.println(getNumberOfPositive(nums));
        reader.close();

    }

    private static int getNumberOfPositive(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {result ++;}
        }

        return result;
    }
}
