/* Generate random number and mand a guessing game.
 * And make a method genAns,playgame,configGame,showGuesses,showSpecific,guess_max,guess_min,guessAverage.
 * Author: Piyawat Phintong
 * ID : 6230402596-5
 * Sec : Lab 2 lac 1
 */
package buathan.chanon.lab4;
import java.util.Scanner;
public class testGuessNum5 {

    static int min,max,ans_num,round,round_contain,round_forloop,guesses_position,max_guesses = 0; //carrible
    static int minguess = 1;
    static int[] guesses;
    static Scanner get_min_in_put = new Scanner(System.in);
    static Scanner get_round_in_put = new Scanner(System.in);
    static Scanner retry = new Scanner(System.in);
    static void configGame()
    { //ask user how many tries and max/min answer that he/she want
        System.out.print("Enter the min and the max values:");
        int min_fake = get_min_in_put.nextInt(), max_fake = get_min_in_put.nextInt();
        if(min_fake>max_fake)//this function is to make min max always true
        {
            min = max_fake;
            max = min_fake;
        }
        else if(max_fake>min_fake)
        {
            max = max_fake;
            min = min_fake;
        }
        else
        {
            min = max_fake;
            max = max_fake;
        }
        System.out.print("Enter the number of tries:");
        round = get_round_in_put.nextInt();
        round_forloop =round;
    }
    static void showGuesses()//show all user guessed
    {
        for(int i = 0;i < guesses_position;i++)
        {
            System.out.print(guesses[i] + " ");
            if(i > guesses.length-1){
                System.out.print("\n");
            }
        }
    }
    static void showSpecific()//show specific guesses
    {
        System.out.println("Enter which guesses in the range" + "(" + minguess  + "-" + max_guesses +")" );
        while(true)
        {
            Scanner number2 = new Scanner(System.in);
            int Specificnumber = number2.nextInt();
            if(Specificnumber < minguess || Specificnumber > max_guesses){
                System.out.println("Enter which guesses in the range" + "(" + minguess + "-" + max_guesses +")" );
            }
            else
            {
                System.out.println("Guessnumber " + Specificnumber + " is "+ guesses[Specificnumber-1]);
                break;
            }
        }
    }
    static void guess_max()// get max value
    {
        int max_value = guesses[0];
        for(int i=1;i < guesses.length;i++)
        {

            if(guesses[i] > max_value)
            {
                max_value = guesses[i];
            }
        }
        System.out.println("Max = " + max_value);
    }
    static void guess_min() // get minimum value
    {
        int min_value = guesses[0];
        for(int i=1;i<guesses.length;i++){
            if(guesses[i] < min_value && i < round_contain)
            {
                min_value = guesses[i];
            }
        }
        System.out.println("Min = " + min_value);
    }
    static void guessAverage()
    {// get avg value
        double total_avg = 0;
        for(int i=0; i<guesses.length; i++){
            total_avg = total_avg + guesses[i];
        }
        total_avg = total_avg / round_contain;
        System.out.println("Average = " + total_avg);
    }
    static void genAnswer()
    { //generate random number
        double random_1 = Math.random()*((max-min)+1) + min; //use min max for make a random ans
        ans_num = (int)random_1;
    }
    static void  playgame()
    {   guesses = new int[round];
        // (int ans_num) is mean that this method is take variable (int ans_num) from outside the method and other.
        while (round_contain != round_forloop)//while loop that is guessing game.
        {
            System.out.print("Pleasee enter a guess " + "(" + min + "-" + max +")" );
            Scanner number1 = new Scanner(System.in);
            int number_in_put = number1.nextInt();//take input Scanner as int
            if (number_in_put == ans_num){
                round_contain = round_contain + 1;
                round_forloop = round_contain;
                max_guesses += 1;
                guesses[guesses_position] = number_in_put;
                guesses_position +=1;
                System.out.print("Congratulation! That's correct ");
            }
            else if(number_in_put > ans_num && number_in_put >= min && number_in_put <= max) //condition for > min and max<
            {
                round_contain = round_contain + 1;
                max_guesses += 1;
                guesses[guesses_position] = number_in_put;
                guesses_position +=1;
                System.out.println("Please try a lower number! number reaming tries:" + String.valueOf(round-round_contain));
            }
            else if(number_in_put < ans_num && number_in_put >= min && number_in_put <= max)
            {
                round_contain = round_contain + 1;
                max_guesses += 1;
                guesses[guesses_position] = number_in_put;
                guesses_position +=1;
                System.out.println("Please try a higher number! number reaming tries:" + String.valueOf(round-round_contain));
            }
            else if(number_in_put < min || number_in_put > max) //condition for min< and >max
            {
                System.out.println("The guess number must be in the range" + min + " and " + max);
            }
            if (round_forloop == round_contain) //conditon for out of tries
            {
                int x = 0;
                while (x == 0)
                {
                    System.out.println("\n" + "If want to play again? type 'y' to continue or 'q' to quit:");
                    System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play");
                    System.out.println("Type 'v' to see average or 'm' to see mininum or 'x' to see maximum of all your guesses");
                    String tryagain = retry.nextLine();
                    if(tryagain.equals("y") || tryagain.equals("Y"))
                    {
                        genAnswer();
                        round_contain = 0;
                        round_forloop = round;
                        guesses_position = 0;
                        max_guesses = 0;
                        x = 1;
                        guesses = new int[guesses.length];
                        guesses = new int[round];
                        playgame();


                    }
                    else if (tryagain.equals("a") || tryagain.equals("A"))
                    {
                        showGuesses();
                    }
                    else if(tryagain.equals("g") || tryagain.equals("G"))
                    {
                        showSpecific();
                    }
                    else if(tryagain.equals("v") || tryagain.equals("V"))
                    {
                        guessAverage();
                    }
                    else if(tryagain.equals("m") || tryagain.equals("M"))
                    {
                        guess_min();
                    }
                    else if(tryagain.equals("x") || tryagain.equals("X"))
                    {
                        guess_max();
                    }
                    else if(tryagain.equals("q") || tryagain.equals("Q"))
                    {
                        System.exit(2);
                    }
                }
            }
        }

    //System.out.println("Type 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses");
    }
    static void playGames()
    {
        playgame();
    }
    public static void main(String[] args)
    {
        configGame();
        genAnswer();
        playGames();
    }
}
