
/**
 *  TestInterfaceAsType, the program which
 *
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 14, 2021
 *
 *
 */

package buathan.chanon.lab7;
import buathan.chanon.lab6.*;
import java.util.ArrayList;

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




public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame g1, DiceGame g2) {


        return 0;
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>();
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4, "h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));
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
