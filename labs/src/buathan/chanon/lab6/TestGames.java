/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 22, 2021
 */

package buathan.chanon.lab6;

public class TestGames
{
    public static void main(String[] args)
    {

        DiceGame game1 = new DiceGame();
        System.out.println(game1);
        game1.playGame();
        DiceGame game2 = new DiceGame("h");
        System.out.println(game2);
        game2.playGame();
        GuessNumberGame game3 = new GuessNumberGame();
        game3.playGame();
        System.out.println(game3);

        Game game4;
        //
        game4 = new DiceGame("l");
        System.out.println(game4);
        game4.playGame();
        game4 = new GuessNumberGame(1, 6, 1);
        System.out.println(game4);
        game4.playGame();

    }

}
