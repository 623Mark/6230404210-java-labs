/**
 * PlayerFormV2, the program which add "panel" of playerType, notePanel
 * which playerType using comboBox
 * and  notePanel using JTextArea
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

public class PlayerFormV2  extends PlayerFormV1
{
    protected JPanel playerTypePanel, notePanel, bottomPanel;
    protected JLabel playerTypeLabel, noteLabel;
    protected JTextArea noteTextArea;
    protected JComboBox playerTypeCombo;

    public PlayerFormV2(String mySimplePlayerFormV2)
    {
        super(mySimplePlayerFormV2);
    }

    @Override
    public void addComponents()
    {
        super.addComponents();
        playerTypeLabel = new JLabel("Player Type:");
        String[] playerTypeStrings = {"Beginner", "Amateur", "Professional"};

        playerTypeCombo = new JComboBox(playerTypeStrings);
        playerTypeCombo.getSelectedItem();

        playerTypePanel = new JPanel(new GridLayout(0,2));
        noteLabel = new JLabel("Note:");
        noteTextArea = new JTextArea(3, 35);
        noteTextArea.setText("A game is structured form of play, usually undertaken for " +
                "entertainment or fun, and sometimes used as an educational tool.");
        noteTextArea.setLineWrap(true);
        noteTextArea.setWrapStyleWord(true);

        // Swing JComboBeatBox set first element as default selected
        playerTypeCombo.setSelectedIndex(1);

        // Positions
        notePanel = new JPanel(new BorderLayout());
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(noteTextArea, BorderLayout.SOUTH);
        playerTypePanel.add(playerTypeLabel);
        playerTypePanel.add(playerTypeCombo);

        bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(genderPanel, BorderLayout.NORTH);
        bottomPanel.add(playerTypePanel, BorderLayout.CENTER);
        bottomPanel.add(notePanel, BorderLayout.SOUTH);

        allPreviousPanel.add(bottomPanel, BorderLayout.CENTER);
        allPreviousPanel.add(buttonPanel, BorderLayout.SOUTH);

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
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }

}

