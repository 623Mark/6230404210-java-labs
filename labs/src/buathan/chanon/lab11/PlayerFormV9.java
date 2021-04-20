/**
 * PlayerFormV9, program which Message display whether user not type any in textfield
 *
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 20, 2021
 */

package buathan.chanon.lab11;

import buathan.chanon.lab10.*;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.time.format.DateTimeFormatter;

import static java.awt.SystemColor.infoText;

public class PlayerFormV9 extends PlayerFormV8 {
    public PlayerFormV9(String name)
    {
        super(name);
    }

    public static void createAndShowGUI() {
        PlayerFormV9 msw = new PlayerFormV9("Player Form V9");
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
        protected void handleSubmitButton() {
            String gender = "";
            if (maleRadioButton.isSelected()) {
                gender += "male";
            } else if (femaleRadioButton.isSelected()) {
                gender += "female";
            }
            javaIcon = new ImageIcon(getClass().getResource("savedImage/javaICON.png"));

            if ( nameTF.getText().equals("") || nationalityTF.getText().equals("") || dateBirthTF.getText().equals(""))
                {
                    String infoText = "";
                    if (nameTF.getText().equals("")) {

                        infoText += "\nName is empty.";
                    }

                    if (nationalityTF.getText().equals("")) {

                        infoText += "\nNationality is empty.";
                    }

                    if (dateBirthTF.getText().equals("")) {

                        infoText += "\nBirthday is empty.";
                    }
                    JOptionPane.showMessageDialog
                            (
                                    this,
                            infoText, "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon
                            );
                }
                else {
                        if (nameTF.getText() != null && nationalityTF.getText() != null && dateBirthTF.getText() != null)
                        {
                            JOptionPane.showMessageDialog
                                    (
                                            this,
                                            nameTF.getText() + " has nationality as " +
                                                    nationalityTF.getText() + ", birthdate as " +
                                                    dateBirthTF.getText() + ", gender as " +
                                                    gender + ", player type as " +
                                                    playerTypeCombo.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon
                                    );
                        }
                    }
            }
}
