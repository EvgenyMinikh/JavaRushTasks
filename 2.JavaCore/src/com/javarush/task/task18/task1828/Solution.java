package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {return;}

        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        //String fileName = "d:\\1.txt";

        String operationCode = args[0];

        switch (operationCode) {
            case "-c" : {
                String productName = args[1];
                productName = String.format("%-" + 30 + "s", productName);

                String price = args[2];
                price = String.format("%-" + 8 + "s", price);

                String quantity = args[3];
                quantity = String.format("%-" + 4 + "s", quantity);

                int nextId = getNexID(getItemsFromFile(fileName));
                addItemToFile(nextId, productName, price, quantity, fileName);
                break;
            }

            case "-d" : {
                String productID = args[1];
                removeItemFromFile(productID, fileName);
                break;
            }

            case "-u" : {
                String id = args[1];
                id = String.format("%-" + 8 + "s", id);

                String productName = args[2];
                productName = String.format("%-" + 30 + "s", productName);

                String price = args[3];
                price = String.format("%-" + 8 + "s", price);

                String quantity = args[4];
                quantity = String.format("%-" + 4 + "s", quantity);

                updateItemInFile(id, productName, price, quantity, fileName);
                break;
            }
        }
    }

    public static void updateItemInFile(String productID, String productName, String price, String quantity, String fileName) throws Exception {
        ArrayList<Item> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = "";

        while ((line = br.readLine()) != null) {
            String id = line.substring(0, 8);

            if (id.equals(productID)) {
                items.add(new Item(Integer.parseInt(id.trim()), productName, price, quantity));
                continue;
            }

            String prodName = line.substring(8, 38);
            String prc = line.substring(38, 46);
            String qnt = line.substring(46, 50);

            items.add(new Item(Integer.parseInt(id.trim()), prodName, prc, qnt));
        }
        br.close();

        FileWriter fw = new FileWriter(fileName);

        for (Item it : items) {
            fw.write(it.toString());
        }
        fw.close();
    }

    public static void removeItemFromFile(String productID, String fileName) throws Exception {
        productID = String.format("%-" + 8 + "s", productID);

        ArrayList<Item> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = "";

        while ((line = br.readLine()) != null) {
            String id = line.substring(0, 8);

            if (id.equals(productID)) {
                continue;
            }

            String prodName = line.substring(8, 38);
            String prc = line.substring(38, 46);
            String qnt = line.substring(46, 50);

            items.add(new Item(Integer.parseInt(id.trim()), prodName, prc, qnt));
        }
        br.close();


        FileWriter fw = new FileWriter(fileName);

        for (Item it : items) {
            fw.write(it.toString());
        }
        fw.close();
    }

    public static void addItemToFile(int id, String productName, String price, String quantity, String fileName) throws Exception {
        String strID = String.format("%-" + 8 + "s", id);
        String result = "\r\n" + strID + productName + price + quantity;
        FileWriter fw = new FileWriter(fileName, true);
        fw.write(result);
        fw.close();
    }

    public static ArrayList<Item> getItemsFromFile(String fileName) throws Exception {
        ArrayList<Item> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = "";

        while ((line = br.readLine()) != null) {
            int id = Integer.parseInt(line.substring(0, 8).trim());
            String prodName = line.substring(8, 38);
            String prc = line.substring(38, 46);
            String qnt = line.substring(46, 50);

            items.add(new Item(id, prodName, prc, qnt));
        }

        br.close();
        return items;
    }

    public static int getNexID(ArrayList<Item> items) {
        int nextId = 0;

        for (Item it : items) {
            if (it.getId() > nextId) {
                nextId = it.getId();
            }
        }

        nextId++;
        return nextId;
    }

    public static class Item {
        private int id;
        private String productName;
        private String price;
        private String quantity;

        public Item(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            String strID = String.format("%-" + 8 + "s", this.id);
            String result = strID + this.productName + this.price + this.quantity + "\r\n";
            return result;
        }
    }
}
