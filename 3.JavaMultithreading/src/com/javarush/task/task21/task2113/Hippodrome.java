package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public Horse getWinner() {
        double max = 0;
        Horse winner = null;

        for (Horse horse : horses) {

            if (horse.getDistance() > max) {
                max = horse.getDistance();
                winner = horse;
            }
        }

        return winner;
    }

    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public static void main(String[] args) throws Exception {
        horses.add(new Horse("Horse 1", 3, 0));
        horses.add(new Horse("Horse 2", 3, 0));
        horses.add(new Horse("Horse 3", 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }


}
