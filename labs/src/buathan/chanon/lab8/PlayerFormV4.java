package buathan.chanon.lab8;

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3
{
    // new open save // in config v
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

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        newMI = new JMenuItem("New", iconOpen);
        openMI = new JMenuItem("Open", iconNew);
        saveMI = new JMenuItem("Save", iconSave);
        exitMI = new JMenuItem("Exit");

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
        colorMenu = new JMenu("Color");
        redMI = new JMenuItem("Red");
        greenMI = new JMenuItem("Green");
        blueMI = new JMenuItem("blue");

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
