/**
 * PlayerFormV3, the program which add "panel" of gamePanel
 * which gamePanel using JList to create it as a list box that we can choose one in it string, in time.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 18, 2021
 */

package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2
{
    // Create array that include texts of game, which using as game list
    protected String gameStr[] = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList gameList;
    protected JPanel gamePanel, gameBetweenNotePanel, savedPreviousPanel;
    protected JLabel gameLabel;

    public PlayerFormV3(String title)
    {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        gameList = new JList(gameStr);
        gameLabel = new JLabel("Games:");
        gamePanel = new JPanel();

        gameBetweenNotePanel = new JPanel();

        // Set layout for gamePanel
        gamePanel.setLayout(new GridLayout(0, 2));
        gamePanel.add(gameLabel);
        gamePanel.add(gameList);

        // Created savePreviousPanel as new object panel, and set layout for use to holding panel upward gamePanel
        savedPreviousPanel = new JPanel();
        savedPreviousPanel.setLayout((new GridLayout(2, 2)));
        savedPreviousPanel.add(genderPanel);
        savedPreviousPanel.add(playerTypePanel);

        // Remove the previous group of panel, to set the locations anew
        allPreviousPanel.remove(bottomPanel);

        // My logic, all panel in V2 becomes new panel using 1 Panel, which used .add and .remove the lower one(notePanel)
        // and add it after we set location in gamePanel
        bottomPanel.add(savedPreviousPanel, BorderLayout.NORTH);
        bottomPanel.add(gamePanel, BorderLayout.CENTER);
        bottomPanel.add(notePanel, BorderLayout.SOUTH);

        allPreviousPanel.add(bottomPanel);

    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI()
    {
        PlayerFormV3 msw = new PlayerFormV3("Player Form V3");
        msw.addComponents();
        msw.setFrameFeatures();
    }

}

