package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new FileReader("d:\\11.txt"));
        PersonScannerAdapter psca = new PersonScannerAdapter(sc);
        psca.read();
        psca.close();
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] pcs = line.split(" ");

            String surname = pcs[0];
            String name = pcs[1];
            String middleName = pcs[2];
            String dateStr = String.format("%s %s %s", pcs[4], pcs[3], pcs[5]);
            DateFormat format = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
            Date date = null;

            try {
                date = format.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(name, middleName, surname, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
