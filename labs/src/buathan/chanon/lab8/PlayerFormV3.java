package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2
{
    protected String gameStr[] = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList gameList;
    //protected JScrollPane gameScrollPane;
    protected JPanel gamePanel, contentBottomPanel;
    protected JLabel gameLabel;

    public PlayerFormV3(String title)
    {
        super(title);
    }

    public void addComponents()
    {
        super.addComponents();
        gameList = new JList(gameStr);
        //gameScrollPane = new JScrollPane(gameList);
        gameLabel = new JLabel("Games:");
        gamePanel = new JPanel();

        contentBottomPanel = new JPanel();

        gamePanel.setLayout(new GridLayout(0,2));
        gamePanel.add(gameLabel);
        //gamePanel.add(gameScrollPane);

        contentBottomPanel.setLayout(new BorderLayout());
/*
        //allPreviousPanel.add(bottomPanel, BorderLayout.NORTH);
        allPreviousPanel.add(buttomPanel, BorderLayout.NORTH);
*/
//          allPreviousPanel.add(firstPanel, BorderLayout.NORTH);
//          allPreviousPanel.add(secondPanel, BorderLayout.CENTER);
//          allPreviousPanel.add(middlePanel, BorderLayout.CENTER);

             mainPanel.add(middlePanel, BorderLayout.SOUTH);

        //contentBottomPanel.add(gamePanel, BorderLayout.NORTH);

    //1    contentBottomPanel.setLayout(new BorderLayout());
        //contentBottomPanel.add(gamePanel, BorderLayout.NORTH);
   //2     contentBottomPanel.add(buttomPanel, BorderLayout.SOUTH);
        //mainPanel.add(contentBottomPanel, BorderLayout.SOUTH);

//        allPreviousPanel.add(contentBottomPanel, BorderLayout.CENTER);
//        allPreviousPanel.add(buttomPanel, BorderLayout.SOUTH);
        //


/*        allPreviousPanel.add(bottomPanel, BorderLayout.CENTER);
        allPreviousPanel.add(buttomPanel, BorderLayout.SOUTH);*/

        //contentBottomPanel.setLayout(new BorderLayout());
        //contentBottomPanel.add(gameListPanel, BorderLayout.NORTH);
        //contentBottomPanel.add(buttomPanel, BorderLayout.SOUTH);
        //mainPanel.add(contentBottomPanel, BorderLayout.SOUTH);
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





/*    public static void main(String[] args)
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

}*/
