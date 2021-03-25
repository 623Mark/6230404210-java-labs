package buathan.chanon.lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessNumberGameWindow implements ActionListener
{
    JFrame frame;
    JPanel topButtonPanel, lowerButtonPanel;
    JLabel welcomeLabel, resultLabel;
    JButton button1, button2,button3, button4, button5, button6, button7, button8, button9, button10;
    JTextField congratzTF;
    GuessNumberGameWindow()
    {
        topButtonPanel = new JPanel(new BorderLayout());
        lowerButtonPanel = new JPanel(new BorderLayout());

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
        /*button3 = new JButton("Image Button",
                new ImageIcon("c:\\smile.jpg"));
        button1.setMnemonic('Y');
        button2.setMnemonic('N');*/
        congratzTF = new JTextField(20);

        welcomeLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Please guess by clicking at the number: </font></html>");
        // frame.add(new JLabel("<html>Text color: <font color='red'>red</font></html>"));
        // <span style='font-size:20px'>
        resultLabel = new JLabel("<html><font color='blue'><span style='font-size:20px'> Result </font></html>");
        frame.setLayout(new FlowLayout());
        //topButtonPanel.add(button1);
        //frame.add

/*        topButtonPanel.add(button1, BorderLayout.EAST);
        topButtonPanel.add(button2, BorderLayout.NORTH);
        topButtonPanel.add(button3, BorderLayout.EAST);
        topButtonPanel.add(button4, BorderLayout.EAST);
        topButtonPanel.add(button5, BorderLayout.EAST);

        lowerButtonPanel.add(button6, BorderLayout.LINE_START);
        lowerButtonPanel.add(button7, BorderLayout.EAST);
        lowerButtonPanel.add(button8);
        lowerButtonPanel.add(button9);
        lowerButtonPanel.add(button10);*/


        frame.add(welcomeLabel, BorderLayout.NORTH);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(resultLabel);
        frame.add(congratzTF);

/*        frame.add(topButtonPanel, BorderLayout.CENTER);
        frame.add(lowerButtonPanel, BorderLayout.CENTER);*/


        //frame.setText(nameField.getText());


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
    public void actionPerformed(ActionEvent event) {
        //textfield.setText("Congratulations!");
        int randomNum = 0;
        randomNum = (int)(Math.random() * 10) + 1;

/*        if (event.getSource() == button1) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button2) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button3) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button4) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button5) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button6) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button7) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button8) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button9) {
            congratzTF.setText("Congratulations!");
        } else if (event.getSource() == button10) {
            congratzTF.setText("Congratulations!");
        }*/
        //event.getSource() == diceNumber;
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