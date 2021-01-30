package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected int numOfGames = 0;

    public GuessNumberGameVer1()
    {
        minNum = 1;
        maxNum = 10;
        correctNum = minNum + (int) ( Math.random() * ((maxNum - minNum) + 1) );
        maxTries = 3;
        numOfGames += 1;
        return;
    }

    public GuessNumberGameVer1(int minNum, int maxNum)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        // or; numOfGuess++ if want to.
        numOfGames += 1;
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries)
    {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        numOfGames += 1;
    }

    // set
    public void setMinNum()
    {
        this.getMinNum();
        return;
    }

    public void setMaxNum()
    {
        this.getMaxNum();
        return;
    }

    public void setMaxTries(int numOfGames)
    {
        this.getMaxTries();
        return;
    }

    // get
    public int getMinNum()
    {
        //this.GuessNumberGame();
        this.setMinNum();
        return minNum;
    }

    public int getMaxNum()
    {
        //this.GuessNumberGame();
        this.setMaxNum();
        return maxNum;
    }

    public int getMaxTries()
    {
        //this.GuessNumberGame();
        return maxTries;
    }

    public void playGame()
    {
        System.out.println("GuessNumberGame with min number as 1, max number as 10, max number of tries as 3");
        System.out.print("Please enter a guess (1-10):");

        for (int i = 0; i < maxTries; i++)
        {
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();
            if ( inputNumGuessing == correctNum)
            {
                System.out.println("ที่ไว้เขียน แม๊นแล่ว // Congratulations! That's correct");
            } else if (inputNumGuessing > correctNum)
            {
                System.out.println("ไว้เขียน ยังเดาไม่ถูกนะนิ // Please type a higher number! Number of remaining tries: +พวก maxtries ต่อ");
                continue;
            }
        }

    }

    @Override
    public String toString()
    {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static int getNumOfGames()
    {
        //this.numOfGames = numOfGames;
        int numOfGames = 0; // wait thy said return
        //return numOfGames;
        return numOfGames;
    }

    // TestConstruct
    public static void TestGuessNumberGenerator()
    {
        testConstructors();
    }

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

    public static void testSetterGetterMethods()
    {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first numver game is");
        System.out.println(gng);
        // ชื่อตัวแปรของอาจารย์ ยังไม่มี ver1 รึถ้าเราใช้ common sense ก็น่าจะให้ตัวรับ parameter  (int, int) เป็น อ๊ะเปล่า
        //System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames() );

    }

    //
    public static void main(String[] args) {

    }
}
