package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread() {
            @Override
            public void run() {
                while (true) {
                }
            }
        });

        threads.add(new MyThread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        });

        threads.add(new MyThread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        System.out.println("Ура");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                }
            }
        });

        threads.add(new MyThreadMessage());

        threads.add(new MyThread() {
            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int result = 0;

                String st = "";
                while (true) {
                    try {
                        st = reader.readLine();
                        if (st.equals("N")) {
                            break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    result += Integer.parseInt(st);
                }

                System.out.println(result);
            }
        });
    }

    public static void main(String[] args) {
    }

    public static class MyThread extends Thread {

    }

    public static class MyThreadMessage extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
}