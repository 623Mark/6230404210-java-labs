/**
 * PlayerFormV4, the program which add "Menu" to the program
 * which Menu include file, configMenu
 * In File,  using new, open, save, exit
 * In Config, using colorMenu, sizeMenu
 * In colorMenu, adding submenu having red, green, blue
 * In sizeMenu, adding size16, size20, size24
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 18, 2021
 */

package buathan.chanon.lab8;

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3
{
    // Created menu, using JMenuBar; JMenu; JMenuItem
    protected JMenuBar menuBar;
    protected  JMenu    fileMenu, configMenu,
                        colorMenu, sizeMenu; // having subMenus
    protected JMenuItem newMI, openMI, saveMI, exitMI,
                        redMI, greenMI, blueMI
                        , size16MI, size20MI, size24MI ;

    public PlayerFormV4(String simplePlayerFormV4)
    {
        super(simplePlayerFormV4);
    }

    @Override
    public void addComponents()
    {
        super.addComponents();

    }

    protected void addMenus() {
        // imageIcon
        ImageIcon iconOpen = new ImageIcon(getClass().getResource("openImage.png"));
        ImageIcon iconNew = new ImageIcon(getClass().getResource("newImage.png"));
        ImageIcon iconSave = new ImageIcon(getClass().getResource("saveImage.png"));

        // Texts in icon
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        newMI = new JMenuItem("New", iconNew);
        openMI = new JMenuItem("Open", iconOpen);
        saveMI = new JMenuItem("Save", iconSave);
        exitMI = new JMenuItem("Exit");

        // Add new, open, save to menu("File")
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);

        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        setJMenuBar(menuBar);
        addSubMenus();
    }

    protected void addSubMenus()
    {
        // Add color menu text, and other text of color sub menus
        colorMenu = new JMenu("Color");
        redMI = new JMenuItem("Red");
        greenMI = new JMenuItem("Green");
        blueMI = new JMenuItem("blue");

        // Add size menu text, and other text of size sub menus
        sizeMenu = new JMenu("Size");
        size16MI = new JMenuItem("16");
        size20MI = new JMenuItem("20");
        size24MI = new JMenuItem("24");

        colorMenu.add(redMI);
        colorMenu.add(greenMI);
        colorMenu.add(blueMI);

        sizeMenu.add(size16MI);
        sizeMenu.add(size20MI);
        sizeMenu.add(size24MI);

        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI()
    {
        PlayerFormV4 msw = new PlayerFormV4("Player Form V4");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }
}
