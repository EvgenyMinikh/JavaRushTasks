package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();

        switch (st.toLowerCase()) {
            case "helicopter" : {
                result = new Helicopter();
                break;
            }

            case "plane" : {
                st = reader.readLine();
                result = new Plane(Integer.parseInt(st));
                break;
            }
        }

        reader.close();
    }
}
