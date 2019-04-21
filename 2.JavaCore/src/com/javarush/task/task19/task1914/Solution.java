package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        StringBuilder stringBuilder = new StringBuilder(result);
        String str = stringBuilder.toString();

        String pattern = "\\d+|[+\\-*]";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(str);

        matcher.find();
        int first = Integer.parseInt(matcher.group());

        matcher.find();
        String oper = matcher.group();

        matcher.find();
        int second = Integer.parseInt(matcher.group());

        switch (oper) {
            case "+": {
                System.out.printf("%d + %d = %d", first, second, first + second);
                break;
            }
            case "*": {
                System.out.printf("%d * %d = %d", first, second, first * second);
                break;
            }
            case "-": {
                System.out.printf("%d - %d = %d", first, second, first - second);
                break;
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

