package buathan.chanon.lab3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int convertNumber;
        Scanner inputNum = new Scanner(System.in);

        int minNum = 1;
        int maxNum = 10;
        int randomFormula = minNum + (int)( Math.random() * ( ( maxNum - minNum ) + 1 ) );

// Please enter a guess (1-10):
// Please type a lower number! Number of remaining tries:

        int amount = 3;
        while (amount != 0);
        System.out.println("Please enter a guess (1-10):");
        convertNumber = inputNum.nextInt();
            /*
            if ( convertNumber == randomFormula ) {
                System.out.println("Congratulations! That's correct");
            } else {
                System.out.println("Please type a lower number! Number of remaining tries:");
            */
        switch (randomFormula){


        }
    }
}
