package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandfatherName, null, null);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent_m;
        private Cat parent_f;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent_m, Cat parent_f) {
            this.name = name;
            this.parent_m = parent_m;
            this.parent_f = parent_f;
        }

        @Override
        public String toString() {
            String result = "The cat's name is " + name;

            if (parent_m == null) {
                result += ", no mother, ";
            } else {
                result += ", mother is " + parent_m.name;
            }

            if (parent_f == null) {
                result += " no father";
            } else {
                result += ", father is " + parent_f.name;
            }

            return result;
        }
    }
}
