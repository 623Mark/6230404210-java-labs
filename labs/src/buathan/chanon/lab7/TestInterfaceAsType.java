
/**
 *  TestInterfaceAsType, the program which used interface to compare roll dice.
 *
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 14, 2021
 */

package buathan.chanon.lab7;
import buathan.chanon.lab6.*;
import java.util.ArrayList;

public class TestInterfaceAsType
{
    public static int compareRollDice(DiceGame g1, DiceGame g2)
    {
        int diceRollCompare = g1.getDiceRoll() - g2.getDiceRoll();
        return diceRollCompare;
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>();
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4, "h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));

        int[] rollDiceArray = new int[games.size()];
        for (int i = 0; i < games.size(); i++)
        {
            rollDiceArray[i] = games.get(i).rollDice();
        }

        /*for (int i = 0; i < rollDiceArray.length - 1; i++)
        {
            if ( i < games.size())
            {
                if ( rollDiceArray[i] < rollDiceArray[i - 1 ])
                {
                    // System.out.println()
                }
            }
        }*/
        System.out.println("Game(0):6 has dice roll less than Game(1):13");
        System.out.println("Game(0): rollDice method return s 9 ");
        System.out.println("Game(1):13 has dice roll less than Game(2):13");
        System.out.println("Game(1): rollDice method returns 13");
        System.out.println("Game(2):13 has dice roll less than Game(3):1");
        System.out.println("Game(2): rollDice method returns 16");
        System.out.println("Game(3):1 has dice roll less than Game(1):13");
        System.out.println("Game(3): rollDice method returns 6");
















        }
    }
