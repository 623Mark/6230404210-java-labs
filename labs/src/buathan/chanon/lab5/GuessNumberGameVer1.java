package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    public GuessNumberGameVer1()
    {
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = 3;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1 ) );
        numOfGames++;
    }

    // set
    public void setMinNum()
    {
        this.minNum = minNum;
        return;
    }

    public void setMaxNum()
    {
        this.maxNum = maxNum;
        return;
    }

    public void setMaxTries(int numOfGames)
    {
        this.maxTries = numOfGames;
        return;
    }

    // get
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

    public void playGame()
    {
        //System.out.println("GuessNumberGame with min number as 1, max number as 10, max number of tries as 3");
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
                //--numOfGames;
                System.out.println("Please type a higher number! Number of remaining tries: " + numOfGames--);
                //System.out.print("Please enter a guess (1-10):");
                //continue;
            } else if (inputNumGuessing > this.correctNum && numOfGames > 0)
            {
                //numOfGames--;
                System.out.println("Please type a lower number! Number of remaining tries: " + numOfGames--);
                //System.out.print("Please enter a guess (1-10):");
                //continue;
            } else if (numOfGames < 0)
            {
                return;
            }
        }

    }

    @Override
    public String toString()
    {
        return  String.format("Guess number with min as %s max number as %s max number of tries as " + this.maxTries, this.minNum, this.maxNum);
    }

    public static int getNumOfGames()
    {
        int numOfGames = 0;
        return numOfGames;
    }
}
