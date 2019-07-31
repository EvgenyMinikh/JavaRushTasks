package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/
public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error) {
                    System.out.println("Нельзя дальше работать");
                    return;
                }

                if (e instanceof Exception) {
                    System.out.println("Надо обработать");
                    return;
                }

                if (e instanceof Throwable) {
                    System.out.println("Поживем - увидим");
                }
            }
        });
    }

    @Override
    public void run() {
        System.out.println("Thread started");
        int d = 1 / 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

    }
}
