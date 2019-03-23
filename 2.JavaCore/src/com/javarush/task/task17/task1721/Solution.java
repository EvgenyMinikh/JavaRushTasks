package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        allLines = readData();
        forRemoveLines = readData();
        try {
            (new Solution()).joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            allLines.removeAll(forRemoveLines);
        }
    }

    public static List<String> readData() {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            BufferedReader fr = new BufferedReader(new FileReader(fileName));
            String line = "";

            while ((line = fr.readLine()) != null) {
                result.add(line);
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
