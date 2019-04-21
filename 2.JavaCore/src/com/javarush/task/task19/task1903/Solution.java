package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
//        int phone = 12345678;
//        String pp = String.format("%010d", phone);
//        String pattern = "(\\d\\d\\d)(\\d\\d\\d)(\\d\\d)(\\d\\d)";
//        Pattern r = Pattern.compile(pattern);
//        Matcher matcher = r.matcher(pp);
//        String result = "";
//        matcher.find();
//        result = "(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4);
//        System.out.println(result);
    }

    public static class IncomeDataAdapter implements Contact, Customer {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getPhoneNumber() {
            String code = "+" + data.getCountryPhoneCode();
            String phoneNumber = String.format("%010d", data.getPhoneNumber());

            String pattern = "(\\d\\d\\d)(\\d\\d\\d)(\\d\\d)(\\d\\d)";
            Pattern r = Pattern.compile(pattern);
            Matcher matcher = r.matcher(phoneNumber);
            matcher.find();
            String result = code + "(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4);

            return result;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}