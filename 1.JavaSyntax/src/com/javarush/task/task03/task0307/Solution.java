package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        z1.name = "1";
        Zerg z2 = new Zerg();
        z2.name = "2";
        Zerg z3 = new Zerg();
        z3.name = "3";
        Zerg z4 = new Zerg();
        z4.name = "4";
        Zerg z5 = new Zerg();
        z5.name = "5";

        Protoss p1 = new Protoss();
        p1.name = "11";
        Protoss p2 = new Protoss();
        p2.name = "21";
        Protoss p3 = new Protoss();
        p3.name = "31";

        Terran t1 = new Terran();
        t1.name = "12";
        Terran t2 = new Terran();
        t2.name = "23";
        Terran t3 = new Terran();
        t3.name = "33";
        Terran t4 = new Terran();
        t4.name = "343";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
