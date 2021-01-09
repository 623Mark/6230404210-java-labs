package buathan.chanon.lab3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;
        int randomNum = minNum + (int)( Math.random() * ( ( maxNum - minNum ) + 1 ) );
        System.out.print("Please enter a guess (1-10):");
        //String welcomeMessage = "Please enter a guess (1-10):";

        int remainTry = 2;
        while (remainTry != 0){
            int inputNumGuessing;
            Scanner inputNum = new Scanner(System.in);
            inputNumGuessing = inputNum.nextInt();
                if ( inputNumGuessing == randomNum ) {
                    System.out.println("Congratulations! That's correct");
                } else if ( inputNumGuessing > randomNum) {
                    System.out.print("Please type a lower number! Number of remaining tries:" + remainTry);
                } else {
                    System.out.print("Please type a higher number! Number of remaining tries:" + remainTry);
        }
            remainTry--;
                ++remainTry;
    inputNum.close();
        }
    }
}
