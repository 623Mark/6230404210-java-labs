package buathan.chanon.lab11;

import buathan.chanon.lab10.*;

import javax.swing.*;
import java.awt.*;

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
}
