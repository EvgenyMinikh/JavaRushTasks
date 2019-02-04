package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<>();
        final Random random = new Random();

        while (set.size() < 20) {
            set.add(random.nextInt());
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator iter = set.iterator();

        while (iter.hasNext()) {
            int number = (int) iter.next();
            if (number > 10) {iter.remove();}
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
