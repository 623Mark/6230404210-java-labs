/**
 * PlayerFormV8, add listeners to the Menu items which is Open, Save, Exit icon.
 * and actionEvent to color, size as sub-menu for use to change the text field using color and
 * change the size of Notes: as user click the size sub-menu.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 12, 2021
 */

package buathan.chanon.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class PlayerFormV8 extends PlayerFormV7 {
    protected JFileChooser fileChoose;
    protected JTextArea logArea;
    private static final String newline = "\n";

    public PlayerFormV8(String name) {
        super(name);
    }

    public void addComponents() {
        super.addComponents();
        fileChoose = new JFileChooser();
        logArea = new JTextArea(5,20);
        logArea.setMargin(new Insets(5,5,5,5));
    }

    // Adding mnemonic keys and accelerator keys
    protected void addKeys() {
        openMI.setMnemonic(KeyEvent.VK_O);
        saveMI.setMnemonic(KeyEvent.VK_S);
        exitMI.setMnemonic(KeyEvent.VK_X);

        openMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

    }

    @Override
    protected void addListener() {
        super.addListener();

        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);

        redMI.addActionListener(this);
        greenMI.addActionListener(this);
        blueMI.addActionListener(this);

        size16MI.addActionListener(this);
        size20MI.addActionListener(this);
        size24MI.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        // Handling Menus
        /*
        Firstly, Handling Open Icon to open the file which will show the name
        of the file which we want to open.
        */
        if (e.getSource() == openMI) {
            int returnVal = fileChoose.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChoose.getSelectedFile();
                logArea.append("Opening: " + file.getName() + "." + newline);
                JOptionPane.showMessageDialog(this,"Open file" + file.getName(),
                        "Message" , JOptionPane.INFORMATION_MESSAGE, javaIcon);
            } else {
                logArea.append("Open command cancelled by user." + newline);
                JOptionPane.showMessageDialog(this,"Open command cancelled by user" ,
                        "Message" , JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
            logArea.setCaretPosition(logArea.getDocument().getLength());

        // Handling Save Icon.
        } else if (e.getSource() == saveMI) {
            int returnVal = fileChoose.showSaveDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChoose.getSelectedFile();
                logArea.append("Saving: " + file.getName() + "." + newline);
                JOptionPane.showMessageDialog(this,"Saving file " + file.getName(),
                        "Message" , JOptionPane.INFORMATION_MESSAGE, javaIcon);
            } else {
                logArea.append("Save command cancelled by user." + newline);
                JOptionPane.showMessageDialog(this,"Save command cancelled by user" ,
                        "Message" , JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
            logArea.setCaretPosition(logArea.getDocument().getLength());
        }

        // Handling Exit icon.
        if (e.getSource() == exitMI) {
            System.exit(0);
        }

        if(e.getSource() == redMI){
            changeColor(Color.RED);
        } else if(e.getSource() == greenMI){
            changeColor(Color.GREEN);
        } else if(e.getSource() == blueMI){
            changeColor(Color.BLUE);

        } else if(e.getSource() == size16MI){
            changeSize(16);
        } else if(e.getSource() == size20MI){
            changeSize(20);
        } else if(e.getSource() == size24MI){
            changeSize(24);
        }

    }

    // Handling menu changing font colors
    protected void changeColor(Color colour){
        nameTF.setForeground(colour);
        nationalityTF.setForeground(colour);
        dateBirthTF.setForeground(colour);
    }

    // Handling text size from TextField which include name, nation, date of birth.
    protected void changeSize(int size){
        Font text = new Font("Serif", Font.PLAIN, size);
        noteTextArea.setFont(text);
    }

    public static void createAndShowGUI() {
        PlayerFormV8 msw = new PlayerFormV8("Player Form V8");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
        msw.addListener();
        msw.addKeys();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
