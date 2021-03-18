/**
 * PlayerFormV1, the program which add "panel" of name, nationality, dateBirth, gender
 * which gender be the choice button using JRadioButton
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

public class PlayerFormV1 extends MySimpleWindow
{
    protected JPanel namePanel, nationalityPanel, dateBirthPanel, genderPanel
            ,genderRadioPanel , topPanel, attachTopPanel, middlePanel, allPreviousPanel;
    protected JLabel nameLabel, nationalityLabel, dateBirthLabel, genderLabel;
    protected JRadioButton maleRadioButton, femaleRadioButton;
    protected JTextField nameTF, nationalityTF, dateBirthTF;
    protected ButtonGroup buttonGroup = new ButtonGroup();

    public PlayerFormV1(String simplePlayerFormV1)
    {
        super(simplePlayerFormV1);
    }

    @Override
    protected void addComponents()
    {
        super.addComponents();
        nameLabel = new JLabel("Name:");
        nameTF = new JTextField("", 15);
        nameTF.setEditable(true);
        namePanel = new JPanel(new GridLayout(0,2));

        namePanel.add(nameLabel);
        namePanel.add(nameTF);

        nationalityLabel = new JLabel("Nationality:");
        nationalityTF = new JTextField("", 15);
        nationalityTF.setEditable(true);
        nationalityPanel = new JPanel(new GridLayout(0, 2));

        nationalityPanel.add(nationalityLabel);
        nationalityPanel.add(nationalityTF);

        dateBirthLabel = new JLabel("Date of Birth (eg.,31-01-1990):");
        dateBirthTF = new JTextField("", 15);
        dateBirthTF.setEditable(true);
        dateBirthPanel = new JPanel(new GridLayout(0, 2));

        dateBirthPanel.add(dateBirthLabel);
        dateBirthPanel.add(dateBirthTF);

        // JRadio Button
        // Female JRadioButton set true to give program default select whenever user run
        genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female", true);
        genderRadioPanel = new JPanel(new GridLayout(0,2));
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);

        genderRadioPanel.add(maleRadioButton);
        genderRadioPanel.add(femaleRadioButton);
        genderPanel = new JPanel(new GridLayout(0, 2));
        genderPanel.add(genderLabel);
        genderPanel.add(genderRadioPanel);

        // Positions
        topPanel = new JPanel(new BorderLayout());
        topPanel.add(namePanel, BorderLayout.NORTH);
        topPanel.add(nationalityPanel, BorderLayout.CENTER);
        topPanel.add(dateBirthPanel, BorderLayout.SOUTH);

        attachTopPanel = new JPanel(new BorderLayout());
        attachTopPanel.add(genderPanel, BorderLayout.NORTH);

        middlePanel = new JPanel(new BorderLayout());
        middlePanel.add(topPanel, BorderLayout.NORTH);
        middlePanel.add(attachTopPanel, BorderLayout.SOUTH);;
        mainPanel.add(middlePanel, BorderLayout.NORTH);
        add(mainPanel);

        // All panel
        allPreviousPanel = new JPanel(new BorderLayout());
        allPreviousPanel.add(topPanel, BorderLayout.NORTH);
        allPreviousPanel.add(middlePanel, BorderLayout.CENTER);
        allPreviousPanel.add(attachTopPanel, BorderLayout.CENTER);
        allPreviousPanel.add(buttonPanel, BorderLayout.SOUTH);
        setContentPane(allPreviousPanel);

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
        PlayerFormV1 msw = new PlayerFormV1("Player Form V1");
        msw.addComponents();
        msw.setFrameFeatures();
    }

}