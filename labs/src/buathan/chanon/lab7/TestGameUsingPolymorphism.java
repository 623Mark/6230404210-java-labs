/**
 *  TestGameUsingPolymorphism, the program which used arrayList holding many objects and add parameter
 *  in each constructor as result received the same as TestGames in lab6
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 10, 2021
 */

package buathan.chanon.lab7;
import buathan.chanon.lab6.*;
import java.util.ArrayList;

public class TestGameUsingPolymorphism extends TestGames {

    public static void main(String[] args) {

        // ArrayList which <relatable> => Game as abstract class and I was edited scope of it, to be "public" as well.
        // If it wasn't *public abstract* it's unreachable.
        ArrayList<Game> myGameList = new ArrayList<Game>(0);
        myGameList.add( new DiceGame() );
        myGameList.add( new DiceGame("h") );
        myGameList.add( new GuessNumberGame() );
        myGameList.add( new DiceGame("l") );
        myGameList.add( new GuessNumberGame(1, 6, 1));

        // For-each objects (Game << abstract class) game << fixed variable that professor write down in the lab7.
        for (Game game : myGameList) {
            System.out.println(game);
            game.playGame();

        }
    }
}

//        DiceGame game1 = new DiceGame();
//        DiceGame game2 = new DiceGame("h");
//        GuessNumberGame game3 = new GuessNumberGame();
//        //DiceGame game4 = new DiceGame("l");
//        //GuessNumberGame game5 = new GuessNumberGame(1, 6, 1);
//
//        myGameList.add(game1);
//        myGameList.add(game2);
//        myGameList.add(game3);


/*    ArrayList<TestGames> game = new ArrayList<TestGames>(5);
    DiceGame game1 = new DiceGame();
    DiceGame game2 = new DiceGame("h");//game.add("h");
    GuessNumberGame game3 = new GuessNumberGame();
    DiceGame game4 = new DiceGame("l");
    GuessNumberGame game5 = new GuessNumberGame(1, 6, 1);
    */
