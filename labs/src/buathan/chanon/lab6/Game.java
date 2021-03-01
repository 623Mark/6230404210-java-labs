/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: February 22, 2021
 */

package buathan.chanon.lab6;

abstract class Game
{
    protected String gameName;
    protected int numOfPlayers;

    // Getters
    public String getGameName()
    {
        return gameName;
    }
    public int getNumOfPlayers()
    {
        return numOfPlayers;
    }

    // Setters
    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
    public void setNumOfPlayers(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
    }

    // Constructors
    // Non-argument
    Game()
    {
        this.gameName = "unknown game";
        this.numOfPlayers = 0;
    }

    // 2's argument
    Game(String gameName, int numOfPlayers)
    {
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                '}';
    }

    // Abstract class
    public abstract void playGame();
}
