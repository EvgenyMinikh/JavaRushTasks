package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name, nums[2], nums[1], nums[0]);
        reader.close();
    }
}
