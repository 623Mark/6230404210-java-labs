package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2
{
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

        gamePanel.setLayout(new GridLayout(0, 2));
        gamePanel.add(gameLabel);
        gamePanel.add(gameList);

        //
        savedPreviousPanel = new JPanel();
        savedPreviousPanel.setLayout((new GridLayout(2, 2)));
        savedPreviousPanel.add(genderPanel); //, BorderLayout.NORTH); //, BorderLayout.SOUTH);
        savedPreviousPanel.add(playerTypePanel); //, BorderLayout.CENTER); //, BorderLayout.SOUTH);
        savedPreviousPanel.add(gamePanel); //, BorderLayout.SOUTH);

////
        allPreviousPanel.remove(bottomPanel);

        //allPreviousPanel.remove(buttonPanel);

        bottomPanel.add(savedPreviousPanel, BorderLayout.NORTH);
        bottomPanel.add(gamePanel, BorderLayout.CENTER);
       bottomPanel.add(notePanel, BorderLayout.SOUTH);
        //bottomPanel.add(notePanel, BorderLayout.CENTER);
        //bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

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

