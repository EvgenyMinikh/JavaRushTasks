package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        System.out.printf("%s: %s: %s", className, methodName, s);
    }
}
