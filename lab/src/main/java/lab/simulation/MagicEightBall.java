package main.java.lab.simulation;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class MagicEightBall extends Game{

    private static String[] answers;

    public MagicEightBall() {

        answers = new String[] {
                "As I see it, yes.",
                "My reply is no.",
                "Cannot predict now.",
                "Concentrate and ask again.",
                "Don’t count on it.",
                "Most likely.",
                "My sources say no.",
                "Most likely."
        };
    }

    public static void startGame() throws InterruptedException {
        double alpha = ThreadLocalRandom.current().nextDouble(1);
        System.out.println("\n");
        System.out.println(answers[(int)Math.floor(alpha * answers.length)]);


        System.out.println("Magic 8-ball Game.");
        if (getRepeatAnswer() == 1) {
            startGame();
        }
    }
}
