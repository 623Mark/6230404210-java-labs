package buathan.chanon.lab3;

import java.util.Scanner;

// GuessNumberGame, the game that's made by a simple rule.
// User can enter some number between (1-10) and the program could calculate random number via using random function.
// If it right user will give appreciate words with "Congratulations! That's correct" on the edge of the screen,
// if not a little change passage will come out as that could be. Also showing the remaining guess.

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 10, 2020
 */

public class GuessNumberGame {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;
        int randomNum = minNum + (int)( Math.random() * ( ( maxNum - minNum ) + 1 ) );
        int remainTry = 3;  // counter loop
        Scanner inputNum = new Scanner(System.in);

        // Scanner in loop
        while ( remainTry > 0 ){
            remainTry--;
            int inputNumGuessing;
            String welcomeGuessText = "Please enter a guess (1-10):";
            System.out.print(welcomeGuessText);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine(); // for avoid error as such NoSuchElementException by using multiple buffered in input
            // also using .hasNextLine to received String and convert to int via .nextInt()
            // ref: https://stackoverflow.com/questions/14720662/java-loop-user-input-from-scanner
            // ref: https://stackoverflow.com/questions/15398703/exception-in-thread-main-java-util-nosuchelementexception

                if ( inputNumGuessing == randomNum ) {
                    System.out.println("Congratulations! That's correct");
                    break;
                } else if ( inputNumGuessing > randomNum ) {
                    System.out.print("Please type a lower number! Number of remaining tries:" + remainTry);
                    System.out.println("");
                    continue;
                } else if ( inputNumGuessing < randomNum ) {
                    System.out.print("Please type a higher number! Number of remaining tries:" + remainTry);
                    System.out.println("");
                    continue;
                    // Therefore, the last "else if" can amend to "} else {" for the outsider case 1(==) 2(>)
                    // but considering that it's good to readable for others.
            }
        }
    }
}
