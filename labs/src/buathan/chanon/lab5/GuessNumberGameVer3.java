package buathan.chanon.lab5;

import java.util.Arrays;

public class GuessNumberGameVer3 extends GuessNumberGameVer2
{
    protected double averageGuess = 0;
    //protected int useToDivide;

    protected double min = guesses[0];
    //protected double max = guesses[0];
    protected double sum = 0;
    //protected
    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries)
    {
        super(minNum, maxNum, maxTries);
    }

    @Override
    public void playGames() {
        numGuess = 0;
        MAX_GUESSES = 0;
        int i = 0;
        guesses[i] = 0 ;
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
        double averageNum;
        double averageGuess = 0;
        for (int i = 1; i < numGuess; i++)
        {
            averageGuess += guesses[i];
        }
        averageNum = averageGuess / numGuess ;
        System.out.println("Average = " + averageNum);
        System.out.println();



        /*
        for (double value : guesses) {
            //min = Math.min(value, min);
            //sum += Double.parseDouble(String.valueOf(guesses));
            sum += guesses[i];
        }
        double avg = sum / guesses.length;
        //return new double[] {min, max, avg};
         */
        //System.out.println("Average = " + avg);
    }


    /*
    double[] values = {2,3,4,5,6,7};

    double min = values[0];
    double max = values[0];
    double sum = 0;

    for (double value : values) {
    min = Math.min(value, min);
    max = Math.max(value, max);
    sum += value;
    }

    double avg = sum / values.length;

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
    System.out.println("Avg: " + avg);
    */
    public void guessMin()
    {
        Arrays.sort(guesses);

        int minValue = guesses[0];
        for(int i=1; i<guesses.length; i++){
            if( guesses[i] < minValue ){
                minValue = guesses[i];
            }
        }
        System.out.println("Minimum = " + guesses[1]);
        /*
        // for-each
        for (int value : guesses) {
            min = Math.min(value, min);
        }
        System.out.println("Min = " + min);
        System.out.println();

         */
        //return new double[] {min, max, avg};
        //Arrays.sort(guesses);
        //System.out.println("Minimum = " + guesses[1]);

        //System.out.println("Min =" );
        /*
        int sortMinNum = guesses[0];
        for (int i = 1; i < guesses.length ; i++)
        {
            if (guesses[i] < sortMinNum)
            {
                sortMinNum = guesses[i];
            }
        }
        System.out.print("Min = " + sortMinNum);

         */


    }

    public void guessMax()
    {
        Arrays.sort(guesses);
        //System.out.println("Minimum = " + guesses[0]);
        System.out.println("Maximum = " + guesses[guesses.length - 1]);
        /*
        int sortMaxNum = guesses[0];
        for (int i = 1; i < guesses.length; i++)
        {
            if (guesses[i] > sortMaxNum)
            {
                sortMaxNum = guesses[i];
            }
        }
        System.out.print("Max = " + sortMaxNum);

         */
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
