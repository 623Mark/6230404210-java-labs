package buathan.chanon.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int remainTry = 3;

    public static void main(String[] args) {
        genAnswer();
        playGame();
    }

    public static void genAnswer() {
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public static void playGame() {
        Scanner inputNum = new Scanner(System.in);
        while (remainTry > 0) {
            remainTry--;
            int inputNumGuessing;
            String welcomeGuessText = "Please enter a guess (1-10):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine();

            if (inputNumGuessing == correctNum) {
                System.out.println("Congratulations! That's correct");
                break;
            } else if (inputNumGuessing > correctNum) {
                System.out.print("Please type a lower number! Number of remaining tries:" + remainTry);
                System.out.println("");
                continue;
            } else if (inputNumGuessing < correctNum) {
                System.out.print("Please type a higher number! Number of remaining tries:" + remainTry);
                System.out.println("");
                continue;
            }
        }
    }
}

