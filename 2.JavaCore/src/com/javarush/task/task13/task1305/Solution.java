package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
        String toString();
    }

    interface Dream {
        Hobby HOBBY = new Hobby();
    }

    public static class Hobby implements Desire, Dream {
        int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}