package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //...
        //String fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine(); //"d:\\words.txt";
        String fileName = "d:\\words.txt";
        ArrayList<String> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                for (String word : words) {
                    list.add(word);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);

        //StringBuilder result = getLine();
        //System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        System.out.println(words);
        return null;
    }
}
