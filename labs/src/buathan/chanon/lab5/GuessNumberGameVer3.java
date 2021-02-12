/**
 * GuessNumberGame version 3,
 * The program add 3 new method -- guessAverage, guessMin, guessMax
 * // guessAverage // by user type "v" the program will calculate the average number which from the sum of all number user input.
 * // guessMin // by user type "m" the program will sort the minimum number which from the array number that received by user input.
 * // guessMax  // by user type "x" the program will sort the maximum number which from the array number that recevied by user input.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 12, 2020
 */

package buathan.chanon.lab5;

import java.util.Arrays;

public class GuessNumberGameVer3 extends GuessNumberGameVer2
{
    static double averageGuess = 0;

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries)
    {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    // playGames method, which ask the user for alphabet command input.
    @Override
    public void playGames()
    {
        //averageGuess = 0;
        numGuess = 0;
        MAX_GUESSES = 0;
        playGame();
        // Looping question, if the user type other than we mentioned; the program will ask again.
        do {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"
                    + "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            System.out.println("Type 'v' to see average or 'm' to see minimum or" +
                    " 'x' to see maximum of all your guesses");
            String saveInput = commandInput.nextLine();


            if (saveInput.equals("q") || saveInput.equals("Q"))
            {
                System.exit(1);

            }   else if (saveInput.equals("y")) {
                playGames();

            }   else if (saveInput.equals("g")) {
                showSpecific();

            }   else if (saveInput.equals("a")) {
                showGuesses();

            }   else if (saveInput.equals("v")) {
                guessAverage();

            }   else if (saveInput.equals("m")) {
                guessMin();

            }   else if (saveInput.equals("x")) {
                guessMax();

            }
        } while (true);

    }

    // guessAverage, calculate average number which received from user guesses divide by tries.
    public void guessAverage()
    {
        for (int i = 0; i < numGuess; i++)
        {
            averageGuess += guesses[i];
        }
        averageGuess = averageGuess / numGuess ;
        System.out.println("Average = " + averageGuess);
        System.out.println();

    }

    // guessMin, sort the minimum number from array guesses.
    public void guessMin()
    {
        // ref: https://stackoverflow.com/questions/41078725/min-value-in-array-keeps-printing-0-java-but-no-zero-in-the-txt-file-as-a-num
        // https://stackoverflow.com/questions/10369724/finding-min-but-zero

        // By checking number if it's zero then the program will return true and looping again until it's false and received other numbers then zero.
        int minValue = Integer.MAX_VALUE;
        for (int checkUnusedZero : guesses)
        {
            minValue = (checkUnusedZero == 0) ? minValue : Math.min(minValue, checkUnusedZero);
        }
        System.out.println("Minimum = " + minValue);
        System.out.println();

    }

    // guessMax, sort the maximum number from array guesses.
    public void guessMax()
    {
        Arrays.sort(guesses);
        System.out.println("Maximum = " + guesses[guesses.length - 1]);
        System.out.println();

    }

    public static void main(String[] args)
    {
        testPlayGames();
    }

    public static void testPlayGames()
    {
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(5, 10, 4);
        gng.playGames();
    }
}
