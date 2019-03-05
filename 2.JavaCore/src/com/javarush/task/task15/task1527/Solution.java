package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        String url = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        url = reader.readLine();
        Pattern pattern = Pattern.compile("(?<=[\\?&])(.+?)(?=[&=])");
        Matcher matches = pattern.matcher(url);
        String result = "";
        boolean isObjPresented = false;

        while (matches.find()) {
            result = result + " " + matches.group(1);
            if (matches.group(1).equals("obj")) {isObjPresented = true;}
        }

        System.out.println(result.trim());

        if (isObjPresented) {
            pattern = Pattern.compile("(?<=obj=)(.+)(?=[&])");
            matches = pattern.matcher(url);
            matches.find();
            String param = matches.group(1);

            try {
                double num = Double.parseDouble(param);
                alert(num);
            } catch (Exception e){
                alert(param);
            }
        }

        reader.close();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
