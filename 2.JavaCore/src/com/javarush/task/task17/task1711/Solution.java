package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        LinkedList<String> arguments = new LinkedList<>(Arrays.asList(args));
        arguments.pop();

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    while (arguments.size() > 0) {
                        String name = arguments.pop();
                        String sex = arguments.pop();
                        String date = arguments.pop();

                        createPerson(name, sex, date);
                    }
                }
                break;
            }

            case "-u": {
                synchronized (allPeople) {
                    while (arguments.size() > 0) {
                        String id = arguments.pop();
                        String name = arguments.pop();
                        String sex = arguments.pop();
                        String date = arguments.pop();
                        System.out.printf("%s %s %s %s", id, name, sex, date);

                        updatePerson(id, name, sex, date);
                    }
                }
                break;
            }

            case "-d": {
                synchronized (allPeople) {
                    while (arguments.size() > 0) {
                        String id = arguments.pop();
                        deletePerson(id);
                    }
                }
                break;
            }

            case "-i": {
                synchronized (allPeople) {
                    while (arguments.size() > 0) {
                        String id = arguments.pop();
                        getPerson(id);
                    }
                }
                break;
            }
        }
    }

    public static void deletePerson(String strId) {
        int id = Integer.parseInt(strId);
        Person person = allPeople.get(id);

        person.setBirthDate(null);
        person.setSex(null);
        person.setName(null);

        allPeople.set(id, person);
    }

    public static void getPerson(String strId) {
        int id = Integer.parseInt(strId);
        Person person = allPeople.get(id);
        String sex = person.getSex().equals(Sex.MALE)? "м" : "ж";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String date = formatter.format(person.getBirthDate());

        String result = String.format("%s %s %s", person.getName(), sex, date);
        System.out.println(result);
    }

    public static void updatePerson(String strId, String name, String sex, String bd) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;

        try {
            date = format.parse(bd);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Sex sx = sex.equals("м")? Sex.MALE : Sex.FEMALE;
        int id = Integer.parseInt(strId);
        Person person = allPeople.get(id);
        person.setName(name);
        person.setSex(sx);
        person.setBirthDate(date);

        allPeople.set(id, person);
    }

    public static void createPerson(String name, String sex, String bd) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        try {
            Date date = format.parse(bd);

            switch (sex.toLowerCase()) {
                case "м" : {
                    allPeople.add(Person.createMale(name, date));
                    break;
                }

                case "ж": {
                    allPeople.add(Person.createFemale(name, date));
                    break;
                }
            }

            System.out.println(allPeople.size() - 1);
        } catch (ParseException e) {e.printStackTrace();}
    }
}
