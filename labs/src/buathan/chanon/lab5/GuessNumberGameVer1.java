/**
 * GuessNumberGame version 1, the program using OOP --- getter setter
 * The program received input from class called TestGuessNumberGame
 * The program random number which is correctNum initialized it and let's user guess the number besides,
 * the program having maxTries, minNum, maxNum include in guessing.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 2, 2020
 */


package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if not give any parameter.
    public GuessNumberGameVer1()
    {
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if give value in parameter as ; minNum, maxNum.
    public GuessNumberGameVer1(int minNum, int maxNum)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if give value in parameter as ; minNum, maxNum, maxTries.
    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // Setter
    public void setMinNum(int minNum)
    {
        this.minNum = minNum;
        return;
    }

    public void setMaxNum(int maxNum)
    {
        this.maxNum = maxNum;
        return;
    }

    public void setMaxTries(int numOfGames)
    {
        this.maxTries = numOfGames;
        return;
    }

    // Getter
    public int getMinNum()
    {
        return minNum;
    }

    public int getMaxNum()
    {
        return maxNum;
    }

    public int getMaxTries()
    {
        return maxTries;
    }

    // Method calculate condition which user guess in game.
    public void playGame()
    {

        for (int i = 0; i < maxTries; i++)
        {
            System.out.print("Please enter a guess (1-10):");
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();
            if ( inputNumGuessing == this.correctNum)
            {
                System.out.println("Congratulations! That's correct");
                System.exit(0);
            } else if (inputNumGuessing < this.correctNum && numOfGames > 0)
            {
                System.out.println("Please type a higher number! Number of remaining tries: " + numOfGames--);

            } else if (inputNumGuessing > this.correctNum && numOfGames > 0)
            {
                System.out.println("Please type a lower number! Number of remaining tries: " + numOfGames--);

            } else if (numOfGames < 0)
            {
                return;
            }
        }

    }

    // Convert Object to String, also I did used format string.
    @Override
    public String toString()
    {
        return  String.format("Guess number with min as %s max number as %s max number of tries as " + this.maxTries, this.minNum, this.maxNum);
    }

    public static int getNumOfGames()
    {
        return numOfGames;
    }
}
