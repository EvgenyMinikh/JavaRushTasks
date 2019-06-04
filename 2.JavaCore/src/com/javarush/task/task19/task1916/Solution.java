package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {
        String fileName1 = "D:\\original.txt";
        String fileName2 = "D:\\edited.txt";
        ArrayList<String> original = fileReader(fileName1);
        ArrayList<String> edited = fileReader(fileName2);

        int max_len = original.size() > edited.size()? original.size() : edited.size();

        for (int i = 0; i < max_len; i++) {
            if (i == 0) {
                if (original.get(i).equals(edited.get(i))) {
                    System.out.println("SAME");
                } else {
                    edited.add(i,"*****");
                    System.out.println("REMOVED");
                }
            }
        }
    }

    public static ArrayList<String> fileReader(String fileName) throws Exception {
        ArrayList<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        while (br.ready()) {
            result.add(br.readLine());
        }

        br.close();
        return result;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
