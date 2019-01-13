package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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
        System.out.println(nums[1]);
        reader.close();
    }
}
