/**
 * PlayerFormV7, programs which using ListSelectionListener
 * to display the message showing dialog received from such that
 * the user can select multiple interval selections
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 11, 2021
 */

package buathan.chanon.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;

public class PlayerFormV7 extends PlayerFormV6 implements ListSelectionListener {
    ListSelectionModel listModels;

    public PlayerFormV7(String name) {
        super(name);
    }

    public static void createAndShowGUI() {
        PlayerFormV7 msw = new PlayerFormV7("Player Form V7");
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
    // Using ListSelectionListener
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel listSelect = (ListSelectionModel) e.getSource();
        boolean listAdjust = e.getValueIsAdjusting();

        if (!listAdjust) {
            if (listSelect.isSelectionEmpty()) {
                JOptionPane.showMessageDialog(
                        this, "No game",
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon
                );
            } else {
                String emptyString = "";
                int min = listSelect.getMinSelectionIndex();
                int max = listSelect.getMaxSelectionIndex();

                for (int i = min; i <= max; i++) {
                    if (gameList.isSelectedIndex(i)) {
                        emptyString += gameList.getModel().getElementAt(i);
                    }
                    if (i == max) {
                        emptyString += " ";
                    } else {
                        emptyString += " , ";
                    }
                }
                JOptionPane.showMessageDialog(
                        this,
                        emptyString,
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
        }
    }

    protected void addListener() {
        super.addListener();
        listModels = gameList.getSelectionModel();
        listModels.addListSelectionListener(this);
    }
}

