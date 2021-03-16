package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {

    protected static String resetButtonAsString = "Reset";
    protected static String submitButtonAsString = "Submit";
    protected static String simpleTitle;
    protected JFrame mainFrame;
    protected JPanel mainPanel, buttomPanel;
    protected JButton resetButton;
    protected JButton submitButton;


    //String simpleTitle;
    public MySimpleWindow(String simpleTitle)
    {
        super(simpleTitle);
    }


    protected void addComponents() {
        this.mainPanel = new JPanel();
        this.buttomPanel = new JPanel();
        add(this.mainPanel);

        this.resetButton = new JButton(resetButtonAsString);
        this.submitButton = new JButton(submitButtonAsString);
        this.buttomPanel.add(this.resetButton);
        this.buttomPanel.add(this.submitButton);
        setLayout(new BorderLayout());
        add(buttomPanel, BorderLayout.AFTER_LAST_LINE);
    }

    protected void setFrameFeatures() {

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
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
