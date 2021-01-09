package buathan.chanon.lab3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;
        int randomNum = minNum + (int)( Math.random() * ( ( maxNum - minNum ) + 1 ) );
        int remainTry = 3;
        Scanner inputNum = new Scanner(System.in);

        while (remainTry > 0){
            remainTry--;
            int inputNumGuessing;
            String welcomeGuess = "Please enter a guess (1-10):";
            System.out.print(welcomeGuess);
            inputNumGuessing = inputNum.nextInt();
            inputNum.hasNextLine();

                if ( inputNumGuessing == randomNum ) {
                    System.out.println("Congratulations! That's correct");
                    break;
                } else if ( inputNumGuessing > randomNum) {
                    System.out.print("Please type a lower number! Number of remaining tries:" + remainTry);
                    System.out.println("");
                    continue;
                } else if ( inputNumGuessing < randomNum) {
                    System.out.print("Please type a higher number! Number of remaining tries:" + remainTry);
                    System.out.println("");
                    continue;
                } else if ( remainTry == 0) {
                    break;
            }
        }
    }
}
