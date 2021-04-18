package main.java.lab.simulation;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Listener extends Game {

    public static void startGame() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        printInputFormat();

        int number = input.nextInt();
        while (number < 1 || number > 3) {
            System.out.println("Wrong number.\n");
            number = input.nextInt();
        }
        switch (number) {

            case 1:
                YesOrNo yesOrNoGame = new YesOrNo();
                yesOrNoGame.startGame();
                break;

            case 2:
                MagicEightBall magicEightBall = new MagicEightBall();
                magicEightBall.startGame();
                break;

            case 3:
                sayGoodbye();
                return;
        }


        System.out.println("Main menu.");
        if (getRepeatAnswer() == 1) {
            startGame();
        }
        sayGoodbye();
    }

    public static void sayGoodbye() throws InterruptedException {
        System.out.println("\nHave a good day!");
        sleep(2000);
    }

    private static void printInputFormat() {
        System.out.println("\nPlease enter the number:");
        System.out.println("1 - Yes or No");
        System.out.println("2 - Magic 8-ball");
        System.out.println("3 - Exit\n");
    }

    public static void main(String[] args) throws InterruptedException {
        startGame();
    }
}
