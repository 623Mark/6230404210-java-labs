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

public class GuessNumberGameWindow extends JFrame implements ActionListener
{
    JFrame frame;

    FlowLayout frameLayout = new FlowLayout();
    JPanel controls, compsToExperiment, nextRowComps;


    //JPanel topButtonPanel, lowerButtonPanel;
    JLabel welcomeLabel, resultLabel;
    JButton button1, button2,button3, button4, button5, button6, button7, button8, button9, button10;
    JTextField congratzTF;

    // Get image from getResource, save it in object icon_ and used it in JButton.
    GuessNumberGameWindow()
    {
        //topButtonPanel = new JPanel(new BorderLayout());
        //lowerButtonPanel = new JPanel(new BorderLayout());

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
        frame = new JFrame("GuessNumberGameWindow Version 1");

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

        congratzTF = new JTextField(20);

        // Set color, size of texts using html.
        welcomeLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Please guess by clicking at the number: </font></html>");
        resultLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Result </font></html>");


        //frame.setLayout(new FlowLayout());
        controls = new JPanel();
        compsToExperiment = new JPanel();
        nextRowComps = new JPanel();

        frameLayout.setAlignment(FlowLayout.TRAILING);
        controls.setLayout(new FlowLayout());

        frame.add(welcomeLabel, BorderLayout.NORTH);
        compsToExperiment.add(button1);
        compsToExperiment.add(button2);
        compsToExperiment.add(button3);
        compsToExperiment.add(button4);
        compsToExperiment.add(button5);
        // ^ จดไว้ค่อยลบ กันลืมตรงนี้ทำให้สั้นลงได้นะ compTo.add(new JButton(icon1);
        compsToExperiment.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT
        );
        //frame.add(compsToExperiment);
/*
        nextRowComps.add(button6);
        nextRowComps.add(button7);
        nextRowComps.add(button8);
        nextRowComps.add(button9);
        nextRowComps.add(button10);
        nextRowComps.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT
        );

        frame.add(resultLabel);
        frame.add(congratzTF);
        pane.add();*/
        /*ButtonGroup group = new ButtonGroup();
        group*/

        //controls.add()

        //topButtonPanel.add(button1);
        //frame.add

/*

        frame.add(topButtonPanel, BorderLayout.CENTER);*/

        //button1.setBorder(BorderFactory.createEmptyBorder(4, 4, 2, 20));

/*        */


/*        frame.add(topButtonPanel, BorderLayout.CENTER);
        frame.add(lowerButtonPanel, BorderLayout.CENTER);*/




        //------
        // Add action on image Jbuttons whenever user clicks.
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

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Action event whenever user click the 'number image button' it'll result in guessing the random numbers.
    public void actionPerformed(ActionEvent event) {

        int randomNum = 0;
        randomNum = (int)(Math.random() * 10) + 1;

        if (event.getSource() == button1 && 1 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button2 && 2 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button3 && 3 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button4 && 4 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button5 && 5== randomNum ) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button6 && 6 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button7 && 7 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button8 && 8 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button9 && 9 == randomNum) {
            congratzTF.setText("Congratulations!");

        } else if (event.getSource() == button10 && 10 == randomNum) {
            congratzTF.setText("Congratulations!");
        }

    }

    public static void main(String[] args)
    {
        new GuessNumberGameWindow();
    }
}