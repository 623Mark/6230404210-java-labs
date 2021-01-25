
/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 24, 2020
 */

package buathan.chanon.lab4;

import java.util.Scanner;

public class GuessNumberGameV5 {

    static int correctNum;
    static int minNum = 0;
    static int maxNum = 0;
    static int newRemainTry;
    static int[] guesses;
    static int numGuesses = 0;
    static int inputNumArray = 0;
    static int counterTryLoop =0;

    //static int[] sortMinNum;
    //static int[] sortMaxNum;
    static double averageGuess = 0;
    static int useToDivide;

    static Scanner userScanner = new Scanner(System.in);
    static Scanner inputTryNumber = new Scanner(System.in);
    static Scanner inputNum = new Scanner(System.in);
    static int inputNumGuessing;
    static Scanner inputSpecificGuess = new Scanner(System.in);
    //static Scanner inputMinArray = new Scanner(System.in);
    //static Scanner inputMaxArray = new Scanner(System.in);


    public static void main(String[] args) {

        while (true)
        {
            if (configGame())
                break;
        }

        while (true)
        {
            genAnswer();
            playGames();
            if (true)
            {
                questionEndGame();

            } else {
                break;
            }
        }
    }

    public static boolean questionEndGame()
    {

        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"+ "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        System.out.println("Type 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses");
        String userInput = userScanner.nextLine();
        while (true)
        {
            if (userInput.equals("y"))
            {
                counterTryLoop =0;
                return true;

            } else if (userInput.equals("q"))
            {
                System.exit(0);

            } else if (userInput.equals("a"))
            {
                showGuesses();
                return true;

            } else if (userInput.equals("g"))
            {
                showSpecific();
                return true;

            } else if (userInput.equals("v"))
            {
                guessAverage();

            } else if (userInput.equals("m"))
            {
                guessMin();

            } else if (userInput.equals("x"))
            {
                guessesMax();

            } else {
                questionEndGame();
            }
            return true;

        }
    }


    public static void guessAverage()
    {
    //guesses = new int[guesses.length];
    for (int k = 1; k < guesses.length; k++)
        {
        averageGuess +=  guesses[k];
        /*
        for (int m = 1; m <= guesses.length - 1; m++)
            {
                averageGuess = averageGuess / useToDivide;
            }
        }
        */
        }
        averageGuess = averageGuess / useToDivide;
        System.out.println(" Average = " + averageGuess);
        System.out.println();
    }

    // initialize sortMinNum start using index 0 that < minNum and looping +1 ++
    public static void guessMin()
    {
        //guesses = new int[guesses.length];
        int sortMinNum = guesses[0];
        for (int i = 1; i < guesses.length ; i++)
        {
            if (guesses[i] < sortMinNum)
            {
                //sortMinNum = guesses.length;
                sortMinNum = guesses[i];
            }
        }
        System.out.print("Min = " + sortMinNum);
        System.out.println();
    }

    // initialize sortMaxNum start using index 0 and looping +1 ++
    public static void guessesMax()
        {
            //guesses = new int[guesses.length];
            //try {
            int sortMaxNum = guesses[0];
            for (int j = 1; j < guesses.length; j++)
            {
                if (guesses[j] > sortMaxNum)
                {
                    sortMaxNum = guesses[j];
                }
            }
            System.out.print("Max = " + sortMaxNum);
            System.out.println();
            //} catch (ArrayIndexOutOfBoundsException ignored) {

        }

    public static void showGuesses()
    {
        for (int i = 0; i < inputNumArray; i++ )
        {
            //saveArray = specificArray[i];
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
        questionEndGame();
    }

    public static void showSpecific()
    {
        int saveSpecificNum = 0;
        for (numGuesses = 0; numGuesses < inputNumArray; numGuesses++)
        while (true)
        {
            System.out.println("Enter which guess in the range (1-" + inputNumArray + ")");
            saveSpecificNum = inputSpecificGuess.nextInt();
            if ( saveSpecificNum < 1 || saveSpecificNum > inputNumArray)
            {
                showSpecific();

            } else{
                System.out.println("Guess number " + saveSpecificNum + " is " + guesses[saveSpecificNum -1]);
                break;
            }
        }
    }

    public static boolean configGame()
    {
        System.out.print("Enter the min and the max value:");
        Scanner inputRangeNumber = new Scanner(System.in);

        int firstConfigNum, secondConfigNum, tryConfigNum;
        firstConfigNum = inputRangeNumber.nextInt();
        secondConfigNum = inputRangeNumber.nextInt();

        System.out.print("Enter the number of tries:");
        tryConfigNum = inputTryNumber.nextInt();
        counterTryLoop = tryConfigNum;
        useToDivide = tryConfigNum;

        if (firstConfigNum > secondConfigNum)
        {
            maxNum = firstConfigNum;
            minNum = secondConfigNum;
            return true;

        } else if (firstConfigNum < secondConfigNum)
        {
            minNum = firstConfigNum;
            maxNum = secondConfigNum;
            return true;

        }
        return true;
    }

    public static void genAnswer ()
    {

        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public static void playGames()
    {
        playGame();
    }

    public static void playGame ()
    {
        int remainCounter = 1;
        newRemainTry = remainCounter;

        guesses = new int[counterTryLoop];
        //guesses = new int[guesses.length];
        //guesses = new int[useToDivide];
        while (counterTryLoop != 0)
        {

            String welcomeGuessText = "Please enter a guess ("+minNum+"-"+maxNum+"):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            //
            inputNum.hasNextLine();

            if ( (inputNumGuessing > maxNum) || (inputNumGuessing < minNum) )
            {
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                continue;
            }

            counterTryLoop--;
            if (inputNumGuessing == correctNum)
            {
                System.out.println("Congratulations! That's correct");
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                break;

            } else if ( (inputNumGuessing > correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum) )
            {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                System.out.print("Please type a lower number! Number of remaining tries:" + counterTryLoop);
                System.out.println("");
                continue;

            } else if ( (inputNumGuessing < correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum))
            {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                System.out.print("Please type a higher number! Number of remaining tries:" + counterTryLoop);
                System.out.println("");
                continue;

            }
        }
    }
}
