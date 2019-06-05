package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable {
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        System.out.println("Process running... Speed is " + this.speed);
        // do something here, doesn't matter what
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test.txt");

        Solution savedObject = new Solution(245);

        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(savedObject);
        fos.close();

        ObjectInputStream in = new ObjectInputStream(fis);
        Solution readObj = (Solution) in.readObject();
//        System.out.println(readObj);
        fis.close();
    }
}
