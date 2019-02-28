package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String[] allowedKeys = {"user", "loser", "coder", "proger"};
        List<String> allowedList = Arrays.asList(allowedKeys);
        boolean isInArray = true;

        while (isInArray)
        {
            key = reader.readLine();

            if (allowedList.contains(key)) {

                switch (key.toLowerCase()) {
                    case "proger" : {
                        person = new Person.Proger();
                        break;
                    }

                    case "coder" : {
                        person = new Person.Coder();
                        break;
                    }

                    case "loser" : {
                        person = new Person.Loser();
                        break;
                    }

                    case "user" : {
                        person = new Person.User();
                        break;
                    }
                }

                doWork(person); //вызываем doWork

            } else {
                break;
            }
        }
    }

    public static void doWork(Person person) {

        switch (person.getClass().getSimpleName()) {
            case "Proger" : {
                ((Person.Proger) person).enjoy();
                break;
            }

            case "Coder" : {
                ((Person.Coder) person).writeCode();
                break;
            }

            case "Loser" : {
                ((Person.Loser) person).doNothing();
                break;
            }

            case "User" : {
                ((Person.User) person).live();
                break;
            }
        }
    }
}
