package buathan.chanon.lab4;

import java.util.Scanner;

public class testGuessNum4 {

    static int correctNum;
    static int minNum = 0;
    static int maxNum = 0;
    //    static int remainTry = 3;
    static int newRemainTry;
    static int[] guesses;
    static int numGuesses = 0;
    static int x = 0;
    static int y =0;
    static Scanner inputSpecificGuess = new Scanner(System.in);

    static Scanner userScanner = new Scanner(System.in);
    static Scanner inputTryNumber = new Scanner(System.in);
    static Scanner inputNum = new Scanner(System.in);
    static int inputNumGuessing;
    public static void main(String[] args) {

        while (true) {
            if (configGame())
                break;
        }

        while (true) {
            genAnswer();
            playGames();
            if (true) {
                questionEndGame();
                //continue;
            } else {
                break;
            }
        }
    }

    public static boolean questionEndGame() {

        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"+ "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");

        String userInput = userScanner.nextLine();
        while (true) {
            if (userInput.equals("y")) {
                y =0;
                return true;
            } else if (userInput.equals("q")) {
                System.exit(0);
            } else if (userInput.equals("a")) {
                showGuesses();
                return true;
            } else if (userInput.equals("g")) {
                specificGuess();
                return true;
            } else {
                questionEndGame();
            }
            return true;
        }
    }

    public static void showGuesses() {
//        int[] specificArray = new int[inputNumGuessing];
//        int[] specificRange = new int[remainTry];
        int i, saveArray;
        for (i = 0; i < x ;i++ )
        {
            //saveArray = specificArray[i];
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
        questionEndGame();
    }

    public static void specificGuess() {
        // int inputNumGuessing[] = new int[1];
        int z = 0;
        //int z = inputSpecificGuess.nextInt();
        //int userInputSpecificGuess = 0;
        for (numGuesses = 0; numGuesses < x  ; numGuesses++)
        {
            System.out.println("Enter which guess in the range (1-" + x + ")");
            z = inputSpecificGuess.nextInt();
            if ( z < 1 || z > x) {
                specificGuess();
            } else{
                System.out.println("Guess number " + z + " is " + guesses[z-1]);
                break;
            }
        }

    }

    public static boolean configGame() {
        System.out.print("Enter the min and the max value:");
        Scanner inputRangeNumber = new Scanner(System.in);

        int firstConfigNum, secondConfigNum, tryConfigNum;
        firstConfigNum = inputRangeNumber.nextInt();
        secondConfigNum = inputRangeNumber.nextInt();

        System.out.print("Enter the number of tries:");
        tryConfigNum = inputTryNumber.nextInt();
        y = tryConfigNum;

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
        int c = 1;
        newRemainTry = c;
        guesses = new int[y];
        while (y != 0) {

            String welcomeGuessText = "Please enter a guess ("+minNum+"-"+maxNum+"):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            //inputNum.hasNextLine();

            if ( (inputNumGuessing > maxNum) || (inputNumGuessing < minNum) ) {
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                continue;
            }

            y--;
            if (inputNumGuessing == correctNum) {
                System.out.println("Congratulations! That's correct");
                guesses[x] = inputNumGuessing;
                x++;
                break;

            } else if ( (inputNumGuessing > correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum) ) {
                guesses[x] = inputNumGuessing;
                x++;
                System.out.print("Please type a lower number! Number of remaining tries:" + y);
                System.out.println("");
                continue;

            } else if ( (inputNumGuessing < correctNum) && (inputNumGuessing <= maxNum || inputNumGuessing >= minNum)) {
                guesses[x] = inputNumGuessing;
                x++;
                System.out.print("Please type a higher number! Number of remaining tries:" + y);
                System.out.println("");
                continue;

            }

        }
    }

}
