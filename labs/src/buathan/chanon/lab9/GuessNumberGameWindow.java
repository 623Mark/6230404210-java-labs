/**
 * GuessNumberGameWindow, the program which random the numbers from (1-10), and show the images of each number as picture.
 * each images of random numbers has action which will result textfield as congratulation if user can guess the random number properly.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 26, 2021
 */

package buathan.chanon.lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessNumberGameWindow extends JFrame implements ActionListener {

    protected JPanel welcomePanel ,topPanel, midFirstPanel, midSecondPanel,lowerPanel, allPreviousPanel, resultPanel;
    protected JLabel welcomeLabel, resultLabel;
    protected JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    protected JTextField congratsTF;

    // Get image from getResource, save it in object icon_ and used it in JButton.
    protected GuessNumberGameWindow(String gngw) {
        super(gngw);
    }

    public void initComponents() {
        welcomePanel = new JPanel();
        topPanel = new JPanel(new BorderLayout());
        midFirstPanel = new JPanel();
        midSecondPanel = new JPanel();
        lowerPanel = new JPanel(new BorderLayout());
        allPreviousPanel = new JPanel(new BorderLayout());
        resultPanel = new JPanel();

        // Set color, size of texts using html.
        welcomeLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Please guess by clicking at the number: </font></html>");
        resultLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Result </font></html>");
        congratsTF = new JTextField(20);

        // Get images.
        ImageIcon icon1 = new ImageIcon(getClass().getResource("number1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("number2.png"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("number3.png"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("number4.png"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("number5.png"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("number6.png"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("number7.png"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("number8.png"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("number9.png"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("number10.png"));

        // Set images in each of JButtons.
        //frame = new JFrame("GuessNumberGameWindow Version 1");
        button1 = new JButton(icon1);
        button2 = new JButton(icon2);
        button3 = new JButton(icon3);
        button4 = new JButton(icon4);
        button5 = new JButton(icon5);

        button6 = new JButton(icon6);
        button7 = new JButton(icon7);
        button8 = new JButton(icon8);
        button9 = new JButton(icon9);
        button10 = new JButton(icon10);

    }

    public void addComponents()
    {
        this.initComponents();

        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();
        Box box3 = Box.createVerticalBox();
        Box box4 = Box.createVerticalBox();
        Box box5 = Box.createVerticalBox();
        Box box6 = Box.createVerticalBox();
        Box box7 = Box.createVerticalBox();
        Box box8 = Box.createVerticalBox();;
        Box box9 = Box.createVerticalBox();
        Box box10 = Box.createVerticalBox();

        box1.add(button1);
        box2.add(button2);
        box3.add(button3);
        box4.add(button4);
        box5.add(button5);
        box6.add(button6);
        box7.add(button7);
        box8.add(button8);
        box9.add(button9);
        box10.add(button10);

        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);
        resultPanel.add(resultLabel);
        resultPanel.add(congratsTF);

        topPanel.add(welcomePanel, BorderLayout.NORTH);
        midFirstPanel.add(box1);
        midFirstPanel.add(box2);
        midFirstPanel.add(box3);
        midFirstPanel.add(box4);
        midFirstPanel.add(box5);

        midSecondPanel.add(box6);
        midSecondPanel.add(box7);
        midSecondPanel.add(box8);
        midSecondPanel.add(box9);
        midSecondPanel.add(box10);

        allPreviousPanel.add(midFirstPanel, BorderLayout.NORTH);
        allPreviousPanel.add(midSecondPanel, BorderLayout.CENTER);
        lowerPanel.add(resultPanel, BorderLayout.SOUTH);
        //lowerPanel.add(congratsTF, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        add(allPreviousPanel, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);
    }

    // Add action on image Jbuttons whenever user clicks.
    public void addListener()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
    }

    // Action event whenever user click the 'number image button' it'll result in guessing the random numbers.
    @Override
    public void actionPerformed(ActionEvent event) {

        int randomNum = 0;
        randomNum = (int)(Math.random() * 10) + 1;

        if (event.getSource() == button1 && 1 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button2 && 2 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button3 && 3 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button4 && 4 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button5 && 5== randomNum ) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button6 && 6 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button7 && 7 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button8 && 8 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button9 && 9 == randomNum) {
            congratsTF.setText("Congratulations!");

        } else if (event.getSource() == button10 && 10 == randomNum) {
            congratsTF.setText("Congratulations!");
        }

    }

    public void setFrameFeature()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void createAndShowGUI() {
        GuessNumberGameWindow msw = new GuessNumberGameWindow("GuessNumberGameWindow Version 1");
        msw.addComponents();
        msw.setFrameFeature();
        msw.addListener();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}