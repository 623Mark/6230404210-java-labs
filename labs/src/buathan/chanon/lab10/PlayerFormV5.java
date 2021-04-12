/**
 * PlayerFormV5, add using ActionListener which program will used to
 * display Message such as users' Submit and Reset buttons. Which provide message as
 * sum up all of the information user selects in the current state.
 * * Submit button to shows the current information user selected/typed.
 * * Reset button to reset text fields(name, nation, date of birth).
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 11, 2021
 */

package buathan.chanon.lab10;

import buathan.chanon.lab8.PlayerFormV4;

import javax.swing.*;
import java.awt.event.*;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener, ItemListener {
    protected ImageIcon javaIcon;

    public PlayerFormV5(String name) {
        super(name);
    }

    protected void handleSubmitButton() {
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender += "male";
        } else if (femaleRadioButton.isSelected()) {
            gender += "female";
        }
        javaIcon = new ImageIcon(getClass().getResource("savedImage/javaICON.png"));
        JOptionPane.showMessageDialog
                        (
                null,
                nameTF.getText() + " has nationality as " +
                        nationalityTF.getText() + ", birthdate as " +
                        dateBirthTF.getText() + ", gender as " +
                        gender + ", player type as " +
                        playerTypeCombo.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon
                        );
    }

    protected void handleResetButton() {
        nameTF.setText("");
        nationalityTF.setText("");
        dateBirthTF.setText("");
    }

    public static void createAndShowGUI() {
        PlayerFormV5 msw = new PlayerFormV5("Player Form V5");
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

    // Using ActionListener
    protected void addListener() {
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        playerTypeCombo.addItemListener(this);
        javaIcon = new ImageIcon(getClass().getResource("savedImage/javaICON.png"));
        nameTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null,
                            "Name is updated to " + nameTF.getText(),
                            "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
                }
            }
        });
        nationalityTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null,
                            "Nationality is updated to " + nationalityTF.getText(),
                            "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
                }
            }
        });
        dateBirthTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null,
                            "Birthdate is updated to " + dateBirthTF.getText(),
                            "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        StringBuffer resultBuffer = new StringBuffer();
        if (src == submitButton) {
            handleSubmitButton();
        } else if (src == resetButton) {
            handleResetButton();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Object item = e.getItem();
            JOptionPane.showMessageDialog(
                    this,
                    "Player type is updated to "+ item.toString(),
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }
}

