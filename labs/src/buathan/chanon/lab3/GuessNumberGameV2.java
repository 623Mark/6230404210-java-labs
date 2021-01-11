/**
 GuessNumberGameV2 the improve program from the GuessNumberGame
 The program will generate number between 1-10 and let's the user input the number by guessing.
 If valid the program showing "Congrat" comment, if any chance you wrong the program'll give a hint.
 The program generate number using subroutine genAnswer()
*/

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 10, 2020
 */
package buathan.chanon.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int remainTry = 3; // counter loop

    public static void main(String[] args) {
        genAnswer();
        playGame();
    }

    // Subroutine with using Math.random() to generated number and using * (maxNum - minNum) for set scope between max and min nums.
    public static void genAnswer() {
        correctNum = minNum + (int) ( Math.random() * ( ( maxNum - minNum ) + 1 ) );
    }

    // looping by using while { counterLoop >0 || using counterLoop-- for decreasing( counterLoop = counterLoop - 1 )  }
    public static void playGame() {
        Scanner inputNum = new Scanner( System.in );
        while ( remainTry > 0 ) {
            remainTry--;
            int inputNumGuessing;
            String welcomeGuessText = "Please enter a guess (1-10):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine(); // avoid exception error, NoSuchElementException dealt by stack loop scanner

            // conditions for comparable numberUserGuessing and correctNum( from program generate via genAnswer() )
            if ( inputNumGuessing == correctNum ) {
                System.out.println( "Congratulations! That's correct" );
                break; // if user guess is valid, exit the loop.
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

