package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
        public int intVar;
        public double doubleVar;
        public Double DoubleVar;
        public boolean booleanVar;
        public Object ObjectVar;
        public Exception ExceptionVar;
        public String StringVar;

    public static void main(String[] args) {
        Solution A = new Solution();

        System.out.println(A.intVar);
        System.out.println(A.doubleVar);
        System.out.println(A.DoubleVar);
        System.out.println(A.booleanVar);
        System.out.println(A.ObjectVar);
        System.out.println(A.ExceptionVar);
        System.out.println(A.StringVar);
    }
}
