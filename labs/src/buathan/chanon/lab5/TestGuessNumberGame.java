/**
 * TestGuessNumberGame, the program using OOP --- getter setter
 * The program input integers which using in class called GuessNumberGameVer1
 * The program "TestGuessNumberGame" used to run as main program which value kept in this program itself and inherit/encapsulation class from GuessNumberGameVer1
 * Also it have 2 class as following : (1) testSetterGetterMethod and (2) testConstructors
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 2, 2020
 */


package buathan.chanon.lab5;

public class TestGuessNumberGame
{

    //static class TestGuessNumberGenerator {
        public static void main(String[] args) {
            testConstructors();
            testSetterGetterMethods();
        }
    //}

    // class testSetterGetter which start at initialize object and use fixed value to input via parameter.
    public static void testSetterGetterMethods()
    {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first number game is");
        System.out.println(gng);
        System.out.println( "Now, the number of games is " + GuessNumberGameVer1.getNumOfGames() );

        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 20);
        System.out.println("Creating another guess number game");
        System.out.println( "Now, the number of games is " + GuessNumberGameVer1.getNumOfGames() );

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new setting");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", max num is " + gng.getMaxNum()
        + ", and max tries is " + gng.getMaxTries());
    }

    // class TestCon which keep constructor methods using in "public class GuessNumberGameVer1()"
    public static void testConstructors()
    {

        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20, 5);

        System.out.println(gng1);
        gng1.playGame();

        System.out.println(gng2);
        gng2.playGame();

        System.out.println(gng3);
        gng3.playGame();
    }

}
