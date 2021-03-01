/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 22, 2021
 */

package buathan.chanon.lab6;

public class DiceGame extends Game
{
    protected int diceRoll;
    protected String answer;

    // Getters
    public int getDiceRoll() {
        return diceRoll;
    }
    public String getAnswer() {
        return answer;
    }

    // Setter
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Constructor
    // Non-argument, which running random diceRoll number which used in guess.
    // The answer for play's guess is set as "l" for answer low.
    DiceGame()
    {
        super("Dice Game", 1);
        this.answer = "l";
        diceRoll = (int) ((Math.random() * 6 ) +1);
    }

    // 1-argument, which running the same as constructor (non-argument)
    DiceGame(String answer)
    {
        super("Dice Game", 1);
        this.answer = answer;
        diceRoll = (int) ((Math.random() * 6 ) +1);
    }

    @Override
    public String toString() {
        return
        "Game Name : "+ gameName +", Number of players : " + numOfPlayers
                + ", Dice roll : " + diceRoll + ", Player's guess : " + answer;
    }

    public void playGame()
    {
        if (answer.equalsIgnoreCase("h")) {
            if (diceRoll > 3) {
                System.out.println("Congratulation. You win.");
            } else {
                System.out.println("Sorry, You lose.");
            }

        } else if (answer.equalsIgnoreCase("l")) {
            if (diceRoll <= 3) {
                System.out.println("Congratulation. You win.");
            } else {
                System.out.println("Sorry, You lose.");
            }
        }
    }
}
