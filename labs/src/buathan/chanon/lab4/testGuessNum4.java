package buathan.chanon.lab4;

import java.util.Scanner;

public class testGuessNum4 {
    private static final long serialVersionUID = -5116101128118950844L;

    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int remainTry = 3;
    static int newRemainTry;
    static int[] guesses;
    static int numGuesses = 0;

    static Scanner userScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            if (configGame())
                break;
        }

        while (true) {
            genAnswer();
            playGames();
            questionEndGame();

            }
        }

    public static boolean configGame() {
        System.out.print("Enter the min and the max value:");
        Scanner inputRangeNumber = new Scanner(System.in);

        int firstConfigNum, secondConfigNum, tryConfigNum;
        firstConfigNum = inputRangeNumber.nextInt();
        secondConfigNum = inputRangeNumber.nextInt();

        System.out.print("Enter the number of tries:");
        Scanner inputTryNumber = new Scanner(System.in);
        tryConfigNum = inputTryNumber.nextInt();
        remainTry = tryConfigNum;

        if (firstConfigNum > secondConfigNum) {
            maxNum = firstConfigNum;
            minNum = secondConfigNum;
            return true;

        } else if (firstConfigNum < secondConfigNum) {
            minNum = firstConfigNum;
            maxNum = secondConfigNum;
            return true;

        }
        return true;
    }

    public static void genAnswer () {

        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public static void playGames() {
        playGame();
    }

    public static void playGame () {
        newRemainTry = remainTry;
        Scanner inputNum = new Scanner(System.in);

        while (newRemainTry > 0) {

            int inputNumGuessing;

            String welcomeGuessText = "Please enter a guess ("+minNum+"-"+maxNum+"):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine();

            if ( (inputNumGuessing > maxNum) || (inputNumGuessing < minNum) ) {
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                continue;
            }

            newRemainTry--;
            if (inputNumGuessing == correctNum) {
                System.out.println("Congratulations! That's correct");
                break;

            } else if ( (inputNumGuessing > correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum) ) {
                System.out.print("Please type a lower number! Number of remaining tries:" + newRemainTry);
                System.out.println("");
                continue;

            } else if ( (inputNumGuessing < correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum)) {
                System.out.print("Please type a higher number! Number of remaining tries:" + newRemainTry);
                System.out.println("");
                continue;

            }
        }
    }

    public static void questionEndGame() {
        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");

            String userInput = userScanner.nextLine();
            if (userInput.equals("y")) {
                genAnswer();
                playGames();

            } else if (userInput.equals("q")) {
                break;
            } else if (userInput.equals("a")) {
                showGuesses();

            } else if (userInput.equals("g")) {
                specificGuess();

            } else {
                questionEndGame();
            }

            userScanner.close();
        }
    }

    public static void showGuesses() {
        //int[] guesses = new int[]newRemainTry;
        //for ()
        int[] guesses = {};
        for (numGuesses = 0; numGuesses < remainTry; numGuesses++ ) {
            System.out.print(guesses[numGuesses] + " ");
        }
    }

    public static void specificGuess() {
        System.out.println("Enter which guess in the range (1-" + remainTry +")");
        Scanner inputSpecificGuess = new Scanner(System.in);
        int userInputSpecificGuess =  inputSpecificGuess.nextInt();

        if ( userInputSpecificGuess < 1 || userInputSpecificGuess > remainTry ) {
            genAnswer();
            System.out.println("Guess number "+ userInputSpecificGuess + " is "+ remainTry );

        } else if ( userInputSpecificGuess >= 1 || userInputSpecificGuess < remainTry) {
            genAnswer();
            if ( userInputSpecificGuess == correctNum) {
                System.out.println("Guess number "+ userInputSpecificGuess + " is " + remainTry);
            }
        }
    }
}
