package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer3 extends GuessNumberGameVer2
{

    protected Scanner saveNewInput = new Scanner(System.in);
    /*
    protected String saveNewCommandInput = saveNewInput.nextLine();
    if ( saveNewCommandInput.equals)
    {

    }


     */

    public void askNewCommand()
    {
        System.out.println("Type 'v' to see average or 'm' to see minimum or" +
                " 'x' to see maximum of all your guesses");
        String saveNewCommandInput = saveNewInput.nextLine();
        if (saveNewCommandInput.equals("v"))
        {
            guessAverage();
        } else if ( saveNewCommandInput.equals("m"))
        {
            guessMin();
        } else if ( saveNewCommandInput.equals("x"))
        {
            guessMax();
        } else {
            askNewCommand();
        }

    }

    public void guessAverage()
    {
    //v

        System.out.println("Average = " );
        askNewCommand();
    }

    public void guessMin()
    {
    //m

        System.out.println("Min =" );
        askNewCommand();
    }

    public void guessMax()
    {
        //x
        System.out.println("Max =");
        askNewCommand();
    }
}
