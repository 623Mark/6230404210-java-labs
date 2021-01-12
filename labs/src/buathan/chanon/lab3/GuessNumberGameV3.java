package buathan.chanon.lab3;

import java.io.PrintWriter;
import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int remainTry = 3;
    static Scanner userScanner = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         // tl;dr >>>> first| config range for user >> Enter the min and the max value:(minNum) (maxNum)
         // config tries >> Enter the number of tries:(remainTry)
         // if user put nums outside range >> The guess number must be in the range (minNum) and (maxNum)
         // if remaining try alr out, ask >> If want to play again? type 'y' to continue or 'q' to quit:(newInstance check input from keyboard)
         */

        while (true) {
            if ( configGame() )
                break;
        }

        while (true) {
            genAnswer();
            playGames();

            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            String userInput = userScanner.nextLine();
            if ( !( userInput.equals("y") ) ) {
                break;
            }
        }
        userScanner.close();
    }


    public static boolean configGame() {
        System.out.print("Enter the min and the max value:");
        Scanner inputRangeNumber = new Scanner(System.in);
        int firstNum, secondNum;
        firstNum = inputRangeNumber.nextInt();
        secondNum = inputRangeNumber.nextInt();
        //Scanner input = userScanner.nextLine();
        //int[] numbers = convertStringArrayToIntArray( input.split(", "));
        //int numbers = Integer.parseInt();
        //while(userScanner.hasNext()) {
          //System.out.println(userScanner.nextInt());
          //break;
        //}
        if (firstNum > secondNum) {
            //replaceFirstNum = firstNum.replace(maxNum, firstNum);
            maxNum = firstNum;
            minNum = secondNum;
            return true;
            //System.out.println(replaceFirstNum);

            //System.out.println(secondNum);

        } else if (firstNum < secondNum) {
            minNum = firstNum;
            maxNum = secondNum;
            return true;
        }
        //int my = Integer.parseInt(String[] numbers);
        //System.out.println(userScanner);
        System.out.print("Enter the number of tries:");
        //input3 = userScanner.nextLine();

    return true;
    }

    public static void genAnswer() {
        correctNum = minNum + (int) ( Math.random() * ( ( maxNum - minNum ) + 1 ) );
    }

    public static void playGames() {
        Scanner inputNum = new Scanner( System.in );
        while ( remainTry > 0 ) {
            remainTry--;
            int inputNumGuessing;
            String welcomeGuessText = "Please enter a guess (1-10):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine();

            if ( inputNumGuessing == correctNum ) {
                System.out.println( "Congratulations! That's correct" );
                break;
            } else if ( inputNumGuessing > correctNum ) {
                System.out.print( "Please type a lower number! Number of remaining tries:" + remainTry );
                System.out.println("");
                continue;
            } else if ( inputNumGuessing < correctNum ) {
                System.out.print( "Please type a higher number! Number of remaining tries:" + remainTry );
                System.out.println("");
                continue;
            }
        }
    }
}
