package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        String fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine(); //"d:\\words.txt";
        //String fileName = "d:\\words.txt";
        LinkedHashSet<String> set = new LinkedHashSet<>();
        ArrayList<String> list = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName))
        ) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                for (String word : words) {
                    set.add(word);
                    list.add(word);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            StringBuilder word = new StringBuilder(iter.next());
            String stWord = word.toString();
            String reversedWord = word.reverse().toString();

            if (list.contains(reversedWord)) {
                result.add(new Pair(reversedWord, stWord));
                list.remove(reversedWord);
                list.remove(stWord);
            }
        }

        for (Pair pair : result) {
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {}

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
