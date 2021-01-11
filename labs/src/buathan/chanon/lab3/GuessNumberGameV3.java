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
        String userInput = "";

        /**
         // tl;dr >>>> first| config range for user >> Enter the min and the max value:(minNum) (maxNum)
         // config tries >> Enter the number of tries:(remainTry)
         // if user put nums outside range >> The guess number must be in the range (minNum) and (maxNum)
         // if remaining try alr out, ask >> If want to play again? type 'y' to continue or 'q' to quit:(newInstance check input from keyboard)
         */

        while (true) {
            if (configGame())
                break;
        }

        while (true) {
            genAnswer();
            playGames();

            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            userInput = userScanner.nextLine();
            if ( !( userInput.equals("y") ) ) {
                break;
            }
        }
        userScanner.close();
    }


    public static boolean configGame() {
        String input1, input2, input3;
        int firstTemp, secondTemp ,tryTemp;

        System.out.print("Enter the min and the max value:");
        input1 = userScanner.nextLine();
        input2 = userScanner.nextLine();
        System.out.print("Enter the number of tries:");
        input3 = userScanner.nextLine();

        //Scanner minNumRange = new Scanner(System.in);
        //Scanner maxNumRange = new Scanner(System.in);

        //PrintWriter minNumInput = new PrintWriter(temp);

        //minNumRange.hasNextLine();


        //int minNum = Integer.parseInt(String.valueOf(minNumRange));
        //NumberFormatException
        try {
            firstTemp = Integer.parseInt(input1);
            secondTemp = Integer.parseInt(input2);
            tryTemp = Integer.parseInt(input3);
        } catch (NumberFormatException ex) {
            if ( firstTemp > secondTemp) {
                int firstTemp = userScanner.nextInt();
                return firstTemp;
            }
            System.out.println("The guess number must be in the range "+ );
        }



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
