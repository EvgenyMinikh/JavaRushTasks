package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String regexPatternToSplit = "\\s(?=\\d+\\s\\d+\\s\\d+)";
        String line;

        while ((line = reader.readLine()) != null) {
            String name = line.split(regexPatternToSplit)[0];
            String dateStr = line.split(regexPatternToSplit)[1];

            DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date date = format.parse(dateStr);
            //System.out.println(name + " " + date);
            PEOPLE.add(new Person(name, date));
        }

        reader.close();
    }
}
