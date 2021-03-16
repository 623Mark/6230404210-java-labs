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
        playerTypePanel.add(playerTypeLabel);
        playerTypePanel.add(playerTypeCombo);
        noteLabel = new JLabel("Note:");
        noteTextArea = new JTextArea(3, 20);
        noteTextArea.setText("A game is structured form of play, usually undertaken for " +
                "entertainment or fun, and sometimes used as an educational tool.");
        noteTextArea.setLineWrap(true);
        noteTextArea.setWrapStyleWord(true);


        // Swing JComboBeatBox set first element as default selected
        playerTypeCombo.setSelectedIndex(1);

        // Positions
        notePanel = new JPanel(new BorderLayout());
        notePanel.add(noteLabel, BorderLayout.WEST);
        notePanel.add(noteTextArea, BorderLayout.EAST);

        bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(playerTypePanel, BorderLayout.NORTH);
        bottomPanel.add(notePanel, BorderLayout.SOUTH);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);


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

