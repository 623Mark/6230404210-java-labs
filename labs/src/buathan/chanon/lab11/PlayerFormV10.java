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

public class PlayerFormV10 extends PlayerFormV9 {
    public PlayerFormV10(String name)
    {
        super(name);
    }

    public static void createAndShowGUI() {
        PlayerFormV10 msw = new PlayerFormV10("Player Form V10");
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
}