package main.java.lab.simulation;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class YesOrNo extends Game{

    private static final double YES_CHANCE = 0.5;

    public static void startGame() throws InterruptedException {
        double alpha = ThreadLocalRandom.current().nextDouble(1);
        if (alpha < YES_CHANCE) {
            System.out.println("\nYes");
        }
        else {
            System.out.println("\nNo");
        }


        System.out.println("Yes or No Game.");
        if (getRepeatAnswer() == 1) {
            startGame();
        }
    }
}
