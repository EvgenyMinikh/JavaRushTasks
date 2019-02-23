package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        ArrayList<String> list = new ArrayList<>();
        String st = "";

        while (true) {
            st = reader.readLine();
            list.add(st+"\n");
            if (st.equals("exit")) {break;}
        }

        for (String line : list) {
            writer.write(line);
        }

        writer.close();
        reader.close();
    }
}
