package buathan.chanon.lab5;

public class GuessNumberGameVer3 extends GuessNumberGameVer2
{
    static double averageGuess = 0;
    static int useToDivide;

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries)
    {
        super(minNum, maxNum, maxTries);
    }

    @Override

    public void playGames() {
        playGame();
        do {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"
                    + "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            System.out.println("Type 'v' to see average or 'm' to see minimum or" +
                    " 'x' to see maximum of all your guesses");
            String saveInput = commandInput.nextLine();


            if (saveInput.equals("q") || saveInput.equals("Q")) {
                System.exit(1);

            }   else if (saveInput.equals("y")) {
                playGames();

            }   else if (saveInput.equals("g")) {
                showSpecific();

            }   else if (saveInput.equals("a")) {
                showGuesses();

            }   else if (saveInput.equals("v")) {
                guessAverage();

            }   else if (saveInput.equals("m")) {
                guessMin();

            }   else if (saveInput.equals("x")) {
                guessMax();

            }
        } while (true);

    }

    public void guessAverage()
    {
    //v

        //System.out.println("Average = " );
        for (int k = 1; k < guesses.length; k++)
        {
            averageGuess +=  guesses[k];
        }
        averageGuess = averageGuess / useToDivide;
        System.out.println(" Average = " + averageGuess);
        System.out.println();

    }

    public void guessMin()
    {
    //m

        //System.out.println("Min =" );
        int sortMinNum = guesses[0];
        for (int i = 1; i < guesses.length ; i++)
        {
            if (guesses[i] < sortMinNum)
            {
                sortMinNum = guesses[i];
            }
        }
        System.out.print("Min = " + sortMinNum);
        System.out.println();

    }

    public void guessMax()
    {
        //x
        //System.out.println("Max =");
        int sortMaxNum = guesses[0];
        for (int j = 1; j < guesses.length; j++)
        {
            if (guesses[j] > sortMaxNum)
            {
                sortMaxNum = guesses[j];
            }
        }
        System.out.print("Max = " + sortMaxNum);
        System.out.println();

    }

    public static void main(String[] args) {
        testPlayGames();
    }

    public static void testPlayGames()
    {
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(5, 10, 4);
        gng.playGames();
    }
}
