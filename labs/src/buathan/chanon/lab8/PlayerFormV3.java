package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2
{
    protected String gameStr[] = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList gameList;
    //protected JScrollPane gameScrollPane;
    protected JPanel gamePanel, gameBetweenNotePanel, savedPreviousPanel;
    protected JLabel gameLabel;

    public PlayerFormV3(String title)
    {
        super(title);
    }

    public void addComponents()
    {
        super.addComponents();
        gameList = new JList(gameStr);
        //gameList.setVisibleRowCount(2);
        //gameScrollPane = new JScrollPane(gameScrollPane);
        gameLabel = new JLabel("Games:");
        gamePanel = new JPanel();

        gameBetweenNotePanel = new JPanel();
////
        gamePanel.setLayout(new GridLayout(0,2));
        gamePanel.add(gameLabel);
        gamePanel.add(gameList);
        //gamePanel.add(gameScrollPane);
//
        //
        savedPreviousPanel = new JPanel();
        savedPreviousPanel.add(genderPanel, BorderLayout.NORTH); //, BorderLayout.SOUTH);
        savedPreviousPanel.add(playerTypePanel, BorderLayout.SOUTH); //, BorderLayout.SOUTH);
        //savedPreviousPanel.add(gamePanel); //, BorderLayout.SOUTH);


/*        gameBetweenNotePanel.setLayout(new BorderLayout());
        gameBetweenNotePanel.add(gamePanel, BorderLayout.NORTH);
        //attachTopPanel.add(savedPreviousPanel, BorderLayout.NORTH);
        //bottomPanel.remove(playerTypePanel);
        //bottomPanel.add(playerTypePanel, BorderLayout.NORTH);
        bottomPanel.add(savedPreviousPanel, BorderLayout.NORTH);
        bottomPanel.add(gamePanel, BorderLayout.SOUTH);
        bottomPanel.remove(notePanel);
        gameBetweenNotePanel.add(notePanel);*/

        //bottomPanel.remove(genderPanel);
        //bottomPanel.remove(playerTypePanel);
        allPreviousPanel.remove(bottomPanel);

        allPreviousPanel.remove(buttonPanel);

        bottomPanel.add(savedPreviousPanel, BorderLayout.NORTH);
        bottomPanel.add(gamePanel, BorderLayout.CENTER);
        bottomPanel.add(notePanel, BorderLayout.SOUTH);
        allPreviousPanel.add(bottomPanel);


        //allPreviousPanel.add(playerTypePanel);
        //savedPreviousPanel.add(notePanel, BorderLayout.SOUTH);
       // attachTopPanel.add(gameBetweenNotePanel, BorderLayout.SOUTH);


        //bottomPanel.add(playerTypePanel, BorderLayout.NORTH);
    //    bottomPanel.add( contentBottomPanel, BorderLayout.CENTER); //, BorderLayout.SOUTH);
        //bottomPanel.add(gamePanel, BorderLayout.AFTER_LINE_ENDS);


//จำ        bottomPanel.add(gamePanel, BorderLayout.BEFORE_LINE_BEGINS);
 // จำ      bottomPanel.add(notePanel, BorderLayout.SOUTH);
       // gameBetweenNotePanel.add(gamePanel, BorderLayout.NORTH);
       // attachTopPanel.add(gameBetweenNotePanel, BorderLayout.SOUTH);

       //
       // buttonPanel.add(contentBottomPanel, BorderLayout.NORTH);

       // secondPanel.add(gamePanel, BorderLayout.WEST);
      //  contentBottomPanel.add(gamePanel, BorderLayout.NORTH);
      //  contentBottomPanel.add(buttonPanel, BorderLayout.SOUTH);
        //mainPanel.add(contentBottomPanel, BorderLayout.SOUTH);
        //allPreviousPanel.add(gamePanel);///, BorderLayout.SOUTH);



        ///
 /*     firstPanel = new JPanel(new BorderLayout());
        firstPanel.add(namePanel, BorderLayout.NORTH);
        firstPanel.add(nationalityPanel, BorderLayout.CENTER);
        firstPanel.add(dateBirthPanel, BorderLayout.SOUTH);

        secondPanel = new JPanel(new BorderLayout());
        secondPanel.add(genderPanel, BorderLayout.NORTH);

        middlePanel = new JPanel(new BorderLayout());
        middlePanel.add(firstPanel, BorderLayout.NORTH);
        middlePanel.add(secondPanel, BorderLayout.SOUTH);;*/

        ///
/*
        //allPreviousPanel.add(bottomPanel, BorderLayout.NORTH);
        allPreviousPanel.add(buttomPanel, BorderLayout.NORTH);
*/
//          allPreviousPanel.add(firstPanel, BorderLayout.NORTH);
//          allPreviousPanel.add(secondPanel, BorderLayout.CENTER);
//          allPreviousPanel.add(middlePanel, BorderLayout.CENTER);

        //mainPanel.add(middlePanel, BorderLayout.NORTH);
      //  mainPanel.add(gamePanel, BorderLayout.SOUTH);

            //contentBottomPanel.add(gamePanel, BorderLayout.CENTER);
            //allPreviousPanel.add(bottomPanel, BorderLayout.SOUTH);
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

