package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> hash = new HashSet<>(Arrays.asList("арбуз",
                "банан", "вишня", "груша", "дыня", "ежевика", "женьшень",
                "земляника", "ирис", "картофель"));

        for (String st : hash) {
            System.out.println(st);
        }
    }
}
