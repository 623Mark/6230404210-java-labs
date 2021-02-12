package buathan.chanon.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected int[] guesses;
    protected int numGuess = 0;
    protected int MAX_GUESSES = 20;

    //
    protected Scanner inputSpecific = new Scanner(System.in);
    protected Scanner commandInput = new Scanner(System.in);
    protected static int inputNumArray = 0;
    protected static int inputNumGuessing;

    //
    public GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    @Override
    public void playGame() {
        numGuess = 0;
        MAX_GUESSES = 0;
        inputNumArray = 0;

        for (int i = maxTries - 1; i + 1 > 0; i--) {
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            Scanner inputNum = new Scanner(System.in);
            int inputNumGuessing = inputNum.nextInt();

            if (inputNumGuessing == this.correctNum) {
                System.out.println("Congratulations! That's correct");
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                break;

            } else if (inputNumGuessing < this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                System.out.println("Please type a higher number! Number of remaining tries: " + i);

            } else if (inputNumGuessing > this.correctNum && numOfGames > 0) {
                guesses[inputNumArray] = inputNumGuessing;
                inputNumArray++;
                numGuess++;
                System.out.println("Please type a lower number! Number of remaining tries: " + i);

            } else if (numOfGames < 0) {
                break;
            }
        }
    }

    public void showSpecific() {
        System.out.println("Enter which guess in the range (1-" + numGuess + ")");
        int scannerSpecific = inputSpecific.nextInt();
        int saveArraySpecificNum = guesses[scannerSpecific - 1];
        System.out.println("Guess number " + scannerSpecific + " is " + saveArraySpecificNum);
        //playGames();
    }

    public void showGuesses() {
        for (int i = 0; i < inputNumArray; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
        //playGames();
    }

    public void playGames() {
        playGame();
        do {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:"
                    + "\nType 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            String saveInput = commandInput.nextLine();


            if (saveInput.equals("q") || saveInput.equals("Q")) {
                System.exit(1);

            }   else if (saveInput.equals("y")) {
                playGames();

            }   else if (saveInput.equals("g")) {
                showSpecific();

            }   else if (saveInput.equals("a")) {
                showGuesses();

                }
            } while (true);
        //} while (true);
        //while (!(saveInput.equals("q")));

        /*
            switch (saveInput) {
                case "q":
                    System.exit(1);

                case "y":
                    playGame();
                    break;

                case "g":
                    showSpecific();
                    break;

                case "a":
                    showGuesses();
                    break;
            }
        } while (true);

         */
    }

}
