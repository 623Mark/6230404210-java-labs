/**
 * MySimpleWindow, the program which created the simple window for adding components further future according to my GUI works.
 * The program add 2 buttons, reset and submit
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

public class MySimpleWindow extends JFrame {

    protected static String resetButtonAsString = "Reset";
    protected static String submitButtonAsString = "Submit";
    protected JPanel mainPanel, buttonPanel;
    protected JButton resetButton;
    protected JButton submitButton;

    public MySimpleWindow(String simpleTitle)
    {
        super(simpleTitle);
    }


    protected void addComponents() {
        this.mainPanel = new JPanel();
        this.buttonPanel = new JPanel();
        add(this.mainPanel);

        this.resetButton = new JButton(resetButtonAsString);
        this.submitButton = new JButton(submitButtonAsString);
        this.buttonPanel.add(this.resetButton);
        this.buttonPanel.add(this.submitButton);
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.AFTER_LAST_LINE);
    }

    protected void setFrameFeatures() {
        pack();                                 // set the size of initial program to 0*0
        setVisible(true);                       // set the program to be visible
        setLocationRelativeTo(null);            // set the program single dimensionless point (the top left corner of the window), which is what it will center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void createAndShowGUI()
    {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            //@Override
            public void run() {
                createAndShowGUI();
            }
        });


    }
}
