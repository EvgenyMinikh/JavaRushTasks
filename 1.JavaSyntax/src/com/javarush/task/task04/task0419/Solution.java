package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 4;
        int[] nums = new int[count];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(max(nums));
        reader.close();
    }

    private static int max(int[] nums) {
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {result = nums[i];}
        }

        return result;
    }
}
