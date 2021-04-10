package buathan.chanon.lab10;

import buathan.chanon.lab8.PlayerFormV4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerFormV5 extends PlayerFormV4
    implements ActionListener
{

    //private static String frameTitle = "PersonFormV5";
    public static ImageIcon javaIcon;

    public PlayerFormV5(String frameTitle)
    {
        super(frameTitle);
    }

/*    protected void createDialogFromV5() {
        icon = new ImageIcon(getClass().getResource("javaICON.png"));

        String message = "";

        String name = "Name is " + this.nameTF.getText();

        String nationality =  "Nationality is " + this.nationalityTF.getText();

        String dob = "Date of Birth : " + this.dateBirthTF.getText();

        String note = "Note : " + this.noteTextArea.getText();

        message = String.join(" ", name, nationality, dob, note);

        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE, icon);*/


    //}

    protected void  handleSubmitButton() {
        String gender = "";
        if (maleRadioButton.isSelected())
        {
            gender += "male";
        } else if (femaleRadioButton.isSelected()) {
            gender += "female";
        }

        javaIcon = new ImageIcon(getClass().getResource("savedImage/javaICON.png"));
        JOptionPane.showMessageDialog(null,
                nameTF.getText() + " has nationality as " +
                nationalityTF.getText() + ", birthdate as " +
                dateBirthTF.getText() + ", gender as " +
                gender + ", player type as " +
                playerTypeCombo.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE

        );
    }

/*    protected void setValues() {
        nameTF.setText("Manee");
        nationalityTF.setText("Thai");
        dateBirthTF.setText("31-01-2000");

    }*/

    protected void clearValues() {
        this.nameTF.setText("");
        this.nationalityTF.setText("");
        this.dateBirthTF.setText("");
        this.noteTextArea.setText("");
    }

    protected void addListeners() {
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

/*    @Override
    protected void initComponent() {
        //super.initComponent();
        icon = new ImageIcon(getClass().getResource("javaICON.png"));
    }*/

    //@Override
/*    protected void initComponents() {
        //this.initComponents();
        setValues();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {

       // resultBuffer = new StringBuffer();
/*        if (src == submitButton) {
            handleSubmitButton();
        } else if (src == resetButton) {
            handleResetButton();
        } else if (src instanceof  JTextField) {
            JTextField tf = (JTextField) src;
            handleTextField(tf);
        }*/
        Object src = e.getSource();
        StringBuffer resultBuffer = new StringBuffer();
        if ( src == submitButton) {
            handleSubmitButton();
        } else if ( src == this.resetButton) {
            clearValues();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PlayerFormV5 msw = new PlayerFormV5("PlayerFormV5");
        //PlayerFormV5.setValues();
        //PlayerFormV5.initComponents();
        msw.addListeners();
        msw.addComponents();
        //PlayerFormV5.addMenus();
        //PlayerFormV5.setFrameFeatures();
    }


}

