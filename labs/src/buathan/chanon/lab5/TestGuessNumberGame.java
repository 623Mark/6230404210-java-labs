package buathan.chanon.lab5;

public class TestGuessNumberGame
{

    //static class TestGuessNumberGenerator {
        public static void main(String[] args) {
            testConstructors();
        }
    //}
    public static void testSetterGetterMethods()
    {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first number game is");
        System.out.println(gng);
        // ชื่อตัวแปรของอาจารย์ ยังไม่มี ver1 รึถ้าเราใช้ common sense ก็น่าจะให้ตัวรับ parameter  (int, int) เป็น อ๊ะเปล่า
        //System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames() );

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

}
