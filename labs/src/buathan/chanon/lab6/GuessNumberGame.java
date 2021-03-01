/**
 * GuessNumberGame for lap 6 inherited class "Game" , the program using OOP --- getter setter
 * The program received input from class called TestGuessNumberGame
 * The program random number which is correctNum initialized it and let's user guess the number besides,
 * the program having maxTries, minNum, maxNum include in guessing.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 22, 2021
 */

package buathan.chanon.lab6;

import java.util.Scanner;

public class GuessNumberGame extends Game
{
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if not give any parameter.
    public GuessNumberGame()
    {
        super("Dice Game", 1);
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if give value in parameter as ; minNum, maxNum.
    public GuessNumberGame(int minNum, int maxNum)
    {
        super("Dice Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // Initialize minNum, maxNum, maxTries, correctNum and increment numOfGame if give value in parameter as ; minNum, maxNum, maxTries.
    public GuessNumberGame(int minNum, int maxNum, int maxTries)
    {
        super("Dice Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
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

    // Method calculate condition which user guess in game.
    public void playGame()
    {
        for (int i = maxTries - 1; i + 1 > 0 ; i--)
        {
            System.out.print("Please enter a guess ("+ minNum + "-" + maxNum +"):");
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();
            if ( inputNumGuessing == this.correctNum)
            {
                System.out.println("Congratulations! That's correct");
                break;

            } else if (inputNumGuessing < this.correctNum && numOfGames > 0)
            {
                System.out.println("Please type a higher number! Number of remaining tries: " + i);

            } else if (inputNumGuessing > this.correctNum && numOfGames > 0)
            {
                System.out.println("Please type a lower number! Number of remaining tries: " + i);

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
        return  String.format("Game name : " +gameName + ", Number of players : "
                + this.numOfPlayers + ", Min is " + this.minNum + ", Max is " + this.maxNum
                + ", Number of tries is " + this.maxTries);
                //"with min as %s max number as %s max number of tries as "
                //+ this.maxTries, this.minNum, this.maxNum);
    }

    public static int getNumOfGames()
    {
        return numOfGames;
    }
}

