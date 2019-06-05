package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        System.out.println(new Solution(4));

        FileInputStream fis = new FileInputStream("D:\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test.txt");

        Solution savedObject = new Solution(25);

        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(savedObject);
        fos.close();

        ObjectInputStream in = new ObjectInputStream(fis);
        Solution readObj = (Solution) in.readObject();
        System.out.println(readObj);
        fis.close();
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
