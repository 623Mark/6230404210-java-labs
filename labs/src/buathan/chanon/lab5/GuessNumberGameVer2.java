package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1
{
    protected int[] guesses;
    protected int numGuess = 0;
    protected int MAX_GUESSES = 20;

    //
    protected Scanner inputSpecific = new Scanner(System.in);
    protected static int inputNumArray = 0;
    protected static int inputNumGuessing;
    //
    public GuessNumberGameVer2()
    {
        super();
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum)
    {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries )
    {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    @Override
    public void playGame() {
        //System.out.print("Please enter a guess ("+ minNum + "-" + maxNum +"):");
        for (int i = maxTries - 1; i + 1 > 0; i--) {
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();
            if (inputNumGuessing == this.correctNum) {
                System.out.println("Congratulations! That's correct");
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                //System.exit(0);
                //break;
                break;
            } else if (inputNumGuessing < this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                System.out.println("Please type a higher number! Number of remaining tries: " + i);

            } else if (inputNumGuessing > this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                System.out.println("Please type a lower number! Number of remaining tries: " + i);

            } else if (numOfGames < 0) {
                break;
            }

        }
    }

    public void showSpecific()
    {
        /*
        System.out.println("Enter which guess in the range ("+ this.minNum +"-" + this.maxNum +")" );
        int saveSpecific = specificInput.nextInt();
        for (int i = 0; i < guesses.length; i++ )
        {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
        /*
                    if ( saveSpecificNum < 1 || saveSpecificNum > inputNumArray)
            {
                showSpecific();

            } else {
                System.out.println("Guess number " + saveSpecificNum + " is " + guesses[saveSpecificNum - 1]);
                questionEndGame();
            }
         */
        int saveSpecificNumber;
        for (numGuess = 0; numGuess < inputNumArray; numGuess++)
            while (true)
            {
                System.out.println("Enter which guess in the range ("+ minNum + "-" + maxNum + ")");
                saveSpecificNumber = inputSpecific.nextInt();
                if ( saveSpecificNumber < 1 || saveSpecificNumber > inputNumArray)
                {
                    showSpecific();

                } else {
                    System.out.println("Guess number " + saveSpecificNumber + " is " + guesses[saveSpecificNumber - 1]);
                    playGames();
                }
            }
    }

    public void showGuesses()
    {
        int saveSpecific = 0;
        for (int i = 0; i < inputNumArray; i++ )
        {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
        playGames();
    }

    public void playGames()
    {
        playGame();
        Scanner commandInput = new Scanner(System.in);
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"
                +"\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        String saveInput = commandInput.nextLine();

        if ( saveInput.equals("q") || saveInput.equals("Q"))
        {
            System.exit(1);
        } else {
            do {
                if (saveInput.equals("y"))
                {
                    playGames();
                }
                else if (saveInput.equals("g"))
                {
                    showSpecific();
                    break;
                }
                else if (saveInput.equals("a"))
                    showGuesses();
                    break;
                } while (!(saveInput.equals("q")));
            }
        }

}
