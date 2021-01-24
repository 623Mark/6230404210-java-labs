/**
    The GuessNumberGameV4, the program which provide user for having more option; end game questions asking for doing something as below.
    after end game user can using follow words;
    user type "a" for "see all the answer that user guesses, which save in array[] as guesses[]".
    user type "g" for "specific playing guess number program in range; which range is from minNum(always keep at 1) to maxNum(from answerNum user guesses, save in array)".
*/

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 24, 2020
 */

package buathan.chanon.lab4;

import java.util.Scanner;

public class GuessNumberGameV4 {

    static int correctNum;
    static int minNum = 0;
    static int maxNum = 0;
    static int newRemainTry;
    static int[] guesses;
    static int numGuesses = 0;
    static int inputNumArray = 0;
    static int counterTryLoop =0;

    // I may use one scanner in advantage, but my condolence I'm using it for keep considering what this scanner used for.
    static Scanner userScanner = new Scanner(System.in);
    static Scanner inputTryNumber = new Scanner(System.in);
    static Scanner inputNum = new Scanner(System.in);
    static int inputNumGuessing;
    static Scanner inputSpecificGuess = new Scanner(System.in);

    public static void main(String[] args) {

        // looping boolean
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
                // this method used for keep asking "If want to play again" while user not input "q" for exit the program
                questionEndGame();

            } else {
                break;
            }
        }
    }

    public static boolean questionEndGame()
    {

        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"+ "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        // Scanner all the line assume that user only input in this one line.
        String userInput = userScanner.nextLine();
        while (true)
        {
            // check user input
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
            } else {
                questionEndGame();
            }
            return true;
        }
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
        // saveSpecificNum which is constraint that keep condition "number which user input in array would not out of array",
        // but if out of array then loop this method asking user again.
        int saveSpecificNum = 0;
        for (numGuesses = 0; numGuesses < inputNumArray; numGuesses++)
        while (true)
        {
            System.out.println("Enter which guess in the range (1-" + inputNumArray + ")");
            saveSpecificNum = inputSpecificGuess.nextInt();
            if ( saveSpecificNum < 1 || saveSpecificNum > inputNumArray)
            {
                showSpecific();

            } else {
                System.out.println("Guess number " + saveSpecificNum + " is " + guesses[saveSpecificNum - 1]);
                break;
            }
        }
    }

    public static boolean configGame()
    {
        // boolean that always return true; which use to while loop the method and returning the new constant of variable that user input.
        // declare variable first, second, try; all var used to comparable two numbers that user inputRange(program sorting the higher number as maxNum, and lower as minNum)
        System.out.print("Enter the min and the max value:");
        Scanner inputRangeNumber = new Scanner(System.in);

        int firstConfigNum, secondConfigNum, tryConfigNum;
        firstConfigNum = inputRangeNumber.nextInt();
        secondConfigNum = inputRangeNumber.nextInt();

        System.out.print("Enter the number of tries:");
        tryConfigNum = inputTryNumber.nextInt();
        counterTryLoop = tryConfigNum;

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
        // random the right guess answer method
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public static void playGames()
    {
        playGame();
    }

    public static void playGame ()
    {
        // declare array above as static int guesses[] so what we need now is to initialize the array
        // size of guesses array is "counterTryLoop" which received the number of all the guesses that user try
        int remainCounter = 1;
        newRemainTry = remainCounter;
        guesses = new int[counterTryLoop];
        while (counterTryLoop != 0)
        {
            // check range which is not decreasing counterTryLoop
            String welcomeGuessText = "Please enter a guess ("+ minNum +"-"+ maxNum +"):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            //inputNum.hasNextLine();

            if ( (inputNumGuessing > maxNum) || (inputNumGuessing < minNum) )
            {
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                continue;
            }

            // decreasing loop
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
