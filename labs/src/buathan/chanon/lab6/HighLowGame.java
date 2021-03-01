package buathan.chanon.lab6;


public class HighLowGame extends DiceGame implements HasRule, UseDice
{
    protected int numOfDice;

    HighLowGame()
    {

        gameName = "High-Low Game";
        numOfPlayers = 1;
        numOfDice = 3;

    }

    HighLowGame(int numOfDice)
    {
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice;

    }

    HighLowGame(int numOfDice, String answer)
    {
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice;
        this.answer = answer;
    }

    public int getNumOfDice()
    {
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice)
    {
        this.numOfDice = numOfDice;
    }

    public String gameRules()
    {
        return null;
    }

    public int rollDice()
    {
        diceRoll = 0;
        for (int i = 0; i < numOfDice ; i++)
        {
            double diceRollDouble = ((Math.random() * 6 ) +1);
            diceRoll += (int) diceRollDouble;
        }

        return 0;
    }

    @Override
    public void playGame()
    {
        {
            int rollDice = ( ( (numOfDice * 6 - numOfDice + 1) /2 ) + numOfDice - 1 );
            if (answer.equalsIgnoreCase("h"))
            {
                if (diceRoll > rollDice)
                {
                    System.out.println("Congratulation. You win.");
                }
                else
                {
                    System.out.println("Sorry, You lose.");
                }

            } else if (answer.equalsIgnoreCase("l"))
            {
                if (diceRoll <= rollDice)
                {
                    System.out.println("Congratulation. You win.");
                } else
                {
                    System.out.println("Sorry, You lose.");
                }
            }
        }
    }

    @Override
    public String toString()
    {
        return "Game name : " + gameName + ", Number of players : " + numOfPlayers
        + ", Dice Roll : " + diceRoll + ", Player's guess : " + answer
        + " Number of dice is " + numOfDice;
    }
}
