package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        Scanner sc = new Scanner(System.in);
        long len = 0;
        while (true) {
            try {
                FileInputStream fs = new FileInputStream(sc.next());
                len = fs.available();
                fs.close();
            } catch (Exception e) {}

            if (len < 1000) {
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
