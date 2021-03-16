package buathan.chanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV1 extends MySimpleWindow
{
    protected JPanel namePanel, nationalityPanel, dateBirthPanel, genderPanel
            ,genderRadioPanel , firstPanel, secondPanel, middlePanel, allPreviousPanel;
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
        firstPanel = new JPanel(new BorderLayout());
        firstPanel.add(namePanel, BorderLayout.NORTH);
        firstPanel.add(nationalityPanel, BorderLayout.CENTER);
        firstPanel.add(dateBirthPanel, BorderLayout.SOUTH);

        secondPanel = new JPanel(new BorderLayout());
        secondPanel.add(genderPanel, BorderLayout.NORTH);

        middlePanel = new JPanel(new BorderLayout());
        middlePanel.add(firstPanel, BorderLayout.NORTH);
        middlePanel.add(secondPanel, BorderLayout.SOUTH);;
        mainPanel.add(middlePanel, BorderLayout.NORTH);
        add(mainPanel);

        // All panel
        allPreviousPanel = new JPanel(new BorderLayout());
        allPreviousPanel.add(firstPanel, BorderLayout.NORTH);
        allPreviousPanel.add(middlePanel, BorderLayout.CENTER);
        allPreviousPanel.add(secondPanel, BorderLayout.CENTER);
        allPreviousPanel.add(buttomPanel, BorderLayout.SOUTH);
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