package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 3;
        int[] nums = new int[count];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0 ; i--) {
            System.out.println(nums[i]);
        }

        reader.close();
    }
}
