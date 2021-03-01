package buathan.chanon.lab6;

import java.util.ArrayList;
import java.util.Arrays;

interface UseBoard
{
    public void setUpBoard();
}

interface HasRule
{
    public String gameRules();
}

interface UseDice
{
    public int rollDice();
}

public class MonopolyGame extends DiceGame implements UseBoard ,HasRule, UseDice
{
    protected int cash[] = new int[8];
    final protected int numOfDice = 2;
    //ArrayList<Integer> arraylist = new ArrayList<Integer>();

    MonopolyGame()
    {
        this.gameName = "Monopoly Game";
        this.numOfPlayers = 2;
        //cash[] = 1500;
        //ArrayList<Integer> cash = new ArrayList<Integer>(1500);
        //cash.add(1500);
        for (int i = 0; i < numOfPlayers; i++)
        {
            //cash.set(i, 1500);
            cash[i] = 1500;
        }
    }

    MonopolyGame(int numOfPlayer)
    {
        this.gameName = "Monopoly Game";
        this.numOfPlayers = numOfPlayer;
        //ArrayList<Integer> cash = new ArrayList<Integer>(1500);
        for (int i = 0; i < numOfPlayers; i++)
        {
            //cash.set(i, 1500);
            cash[i] = 1500;
        }
    }

    public String getCash()
    {
        //String cash = "";
        String saveCash = "";
        for (int i = 0; i < numOfPlayers;i++)
        {
            //String saveCash += cash[i];
            //saveCash += " ";
            saveCash += cash[i] + " ";
        }

        return saveCash;
    }

    public void setCash(int[] cash)
    {
        this.cash = cash;
    }

    public void playGame() {
        //super.playGame();
        System.out.println("Playing Monopoly Game");
    }

    public void setUpBoard() {
        System.out.println("Setting up monopoly board");
    }

    public int rollDice()
    {
            diceRoll = 0;
            for (int i = 0; i < numOfDice ; i++)
            {
                double diceRollDouble = ((Math.random() * 6 ) +1);
                diceRoll += (int) diceRollDouble;
            }

        return diceRoll;
    }

    public String gameRules()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "Game name : " + gameName + ", Number of players : " + numOfPlayers;
    }
}



