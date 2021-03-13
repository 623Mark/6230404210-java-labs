package buathan.chanon.lab7;
import buathan.chanon.lab6.*;
import java.util.ArrayList;

public class TestGameUsingPolymorphism {
    public static void main(String[] args) {
        ArrayList<TestGames> myGameList = new ArrayList<TestGames>();
        DiceGame game1 = new DiceGame();
        DiceGame game2 = new DiceGame("h");
        GuessNumberGame game3 = new GuessNumberGame();
        DiceGame game4 = new DiceGame("l");
        GuessNumberGame game5 = new GuessNumberGame(1, 6, 1);

        myGameList.add(game1);
        myGameList.add(game2);
        myGameList.add(game3);
        myGameList.add(game4);
        myGameList.add(game5);
        //TestGameUsingPolymorphism myGame = myGameList.get(0);
        for (Object game : myGameList) {
            System.out.println(game);
            game1.playGame();
//           game2.playGame();
//            game3.playGame();
//            game4.playGame();
//            game5.playGame();
        }
    }
}

/*    ArrayList<TestGameUsingPolymorphism> myGameList = new ArrayList<TestGameUsingPolymorphism>();
    DiceGame game1 = new DiceGame();
    DiceGame game2 = new DiceGame("h");
    GuessNumberGame game3 = new GuessNumberGame();
    DiceGame game4 = new DiceGame("l");
    GuessNumberGame game5 = new GuessNumberGame(1, 6, 1);

        myGameList.add(game1);
                myGameList.add(game2);
                myGameList.add(game3);
                myGameList.add(game4);
                myGameList.add(game5);*/


/*    ArrayList<TestGames> game = new ArrayList<TestGames>(5);
    DiceGame game1 = new DiceGame();
    DiceGame game2 = new DiceGame("h");//game.add("h");
    GuessNumberGame game3 = new GuessNumberGame();
    DiceGame game4 = new DiceGame("l");
    GuessNumberGame game5 = new GuessNumberGame(1, 6, 1);
    */
/*        game.add();
                game.add("h");
                game.add();
                game.add("l");
                game.add(1, 6, 1);*/
//TestGames[] game = new TestGames[4];
/*
game[0] = new DiceGame();
       game[1] = new DiceGame("h");
       game[2] = new GuessNumberGame();
       game[3] = new GuessNumberGame(1, 6, 1);

 */