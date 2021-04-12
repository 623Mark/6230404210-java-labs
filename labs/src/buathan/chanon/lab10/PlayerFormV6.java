/**
 * PlayerFormV6, program which Message display whether user changing
 * gender radio button(Male or Female)
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 11, 2021
 */


package buathan.chanon.lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PlayerFormV6 extends PlayerFormV5{
    public PlayerFormV6(String name) {
        super(name);
    }

    public static void createAndShowGUI() {
        PlayerFormV6 msw = new PlayerFormV6("Player Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
        msw.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    protected void addListener(){
        super.addListener();
        maleRadioButton.addActionListener(this);
        femaleRadioButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        StringBuffer resultBuffer = new StringBuffer();
        if (src == maleRadioButton) {
            //handleSubmitButton();
            JOptionPane.showMessageDialog(
                    this,
                    "Gender is updated to Male ",
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        } else if (src == femaleRadioButton) {
            JOptionPane.showMessageDialog(
                    this,
                    "Gender is updated to Female ",
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }
}
