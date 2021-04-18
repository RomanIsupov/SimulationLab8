package main.java.lab.simulation;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public abstract class Game {

    public static void startGame() throws InterruptedException { }

    public static int getRepeatAnswer() {
        System.out.println("Do you want to repeat? Please enter the number:");
        System.out.println("1 - Yes, I want.");
        System.out.println("2 - No.\n");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number != 1 && number != 2) {
            System.out.println("Incorrect input format.\n");
            number = input.nextInt();
        }
        return number;
    }
}
