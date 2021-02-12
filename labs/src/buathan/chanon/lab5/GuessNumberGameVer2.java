/**
 * GuessNumberGame version 2,
 * The program add 2 new method -- showGuesses, showSpecific
 * The program having "showGuesses" as display the number which user guesses. ;by user type "g"
 * "showSpecific" as reflect what number tries which user guesses. ;by user type "a"
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 12, 2020
 */

package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected int[] guesses;
    protected int numGuess = 0;
    protected int MAX_GUESSES = 20;

    // Scanner, which used to receive input from Specific and command.
    protected Scanner inputSpecific = new Scanner(System.in);
    protected Scanner commandInput = new Scanner(System.in);
    protected static int inputNumArray = 0;

    public GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    @Override
    public void playGame() {
        // Override below values which use to set the value from the newest play every time, it has been run.
        numGuess = 0;
        MAX_GUESSES = 0;
        inputNumArray = 0;

        for (int i = maxTries - 1; i + 1 > 0; i--) {
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();

            if (inputNumGuessing == this.correctNum) {
                System.out.println("Congratulations! That's correct");
                // Saving Guess numbers in array member.
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                break;

            } else if (inputNumGuessing < this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                System.out.println("Please type a higher number! Number of remaining tries: " + i);

            } else if (inputNumGuessing > this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                System.out.println("Please type a lower number! Number of remaining tries: " + i);

                // If numOfGames have been -1 or less than 0 break the loop.
            } else if (numOfGames < 0) {
                break;
            }
        }
    }

    // showSpecific, display the single number position.
    public void showSpecific()
    {
        System.out.println("Enter which guess in the range (1-" + numGuess + ")");
        int scannerSpecific = inputSpecific.nextInt();
        int saveArraySpecificNum = guesses[scannerSpecific - 1];
        System.out.println("Guess number " + scannerSpecific + " is " + saveArraySpecificNum);

    }

    // showGuesses, display the numbers which user guessed from that round.
    public void showGuesses()
    {
        for (int i = 0; i < inputNumArray; i++)
        {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();

    }

    public void playGames()
    {
        playGame();
        // do while (condition) ;as it's true which always use to looping questionEndGame below.
        do {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"
                    + "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            String saveInput = commandInput.nextLine();


            if (saveInput.equals("q") || saveInput.equals("Q")) {
                System.exit(1);

            }   else if (saveInput.equals("y")) {
                playGames();

            }   else if (saveInput.equals("g")) {
                showSpecific();

            }   else if (saveInput.equals("a")) {
                showGuesses();

                }
            } while (true);

    }

}
