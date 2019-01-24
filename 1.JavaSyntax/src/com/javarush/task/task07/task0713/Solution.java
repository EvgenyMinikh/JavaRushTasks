package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> numsOther = new ArrayList<>();
        int n = 20;
        int number = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(reader.readLine());
            numbers.add(number);

            if ((number % 3 != 0) && (number % 2 != 0)) {
                numsOther.add(number);
                continue;
            }

            if (number % 3 == 0) {nums3.add(number);}
            if (number % 2 == 0) {nums2.add(number);}
        }

        reader.close();

        printList(nums3);
        printList(nums2);
        printList(numsOther);
    }

    public static void printList(List<Integer> list) {
        for (Integer st: list) {
            System.out.println(st);
        }
    }
}
