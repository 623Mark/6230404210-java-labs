/**
* DiceImageCanvas, the program which roll the dice and results as the images (1-6).
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 26, 2021
 */

package buathan.chanon.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiceImageCanvas extends JPanel {
    protected int diceNumber;
    protected Graphics2D g2d;
    protected Ellipse2D.Double circleCenter, circleTopRight, circleBottomLeft,
            circleTopLeft, circleBottomRight, circleLeftCenter, circleRightCenter;
    protected Rectangle2D.Double square;
    protected int width = 150, height = 150;
    protected int canvasWidth = 400, canvasHeight = 400;
    protected int circleWidth = 30, circleHeight = 30;
    protected int startSquareX = 125;
    protected int startSquareY = 40;
    protected int margin = 10;

    // Constructor
    public DiceImageCanvas(int diceNumber) {
        setSize(canvasWidth, canvasHeight);
        square = new Rectangle2D.Double(startSquareX, startSquareY, width, height);
        createCircles();
    }

    // Create circle(as dot) in each dice, using position by var.
    protected void createCircles() {
        circleCenter = new Ellipse2D.Double(startSquareX + (width/2) - (circleWidth/2), startSquareY + (height/2) - (circleHeight/2), circleWidth, circleHeight);
        circleTopLeft = new Ellipse2D.Double(startSquareX + margin , startSquareY + margin, circleWidth, circleHeight);
        circleTopRight = new Ellipse2D.Double(startSquareX + width - circleWidth -  margin, startSquareY + margin, circleWidth, circleHeight);

        circleBottomLeft = new Ellipse2D.Double(startSquareX + margin , startSquareY + margin*2 + height/2 + circleWidth/2, circleWidth, circleHeight);
        circleBottomRight = new Ellipse2D.Double(startSquareX - margin + width - circleWidth, startSquareY + margin*2 + height/2 + circleWidth/2, circleWidth, circleHeight);

        circleLeftCenter = new Ellipse2D.Double(startSquareX + margin, startSquareY +height/2 - margin, circleWidth, circleHeight);
        circleRightCenter = new Ellipse2D.Double(startSquareX - margin + width - circleWidth, startSquareY +height/2 - margin, circleWidth, circleHeight);
    }

    // Draw the circle in any case of dice roll(1-6), set the color to 'red'.
    protected void drawDiceNumber() {
        g2d.setColor(Color.RED);
        diceNumber = (int)(Math.random() * 6) + 1;
        switch (diceNumber) {

            case 1:

                g2d.fill(circleCenter);
                break;
            case 2:
                g2d.fill(circleTopRight);
                g2d.fill(circleBottomLeft);
                break;
            case 3:
                g2d.fill(circleTopRight);
                g2d.fill(circleCenter);
                g2d.fill(circleBottomLeft);
                break;
            case 4:
                g2d.fill(circleTopLeft);
                g2d.fill(circleTopRight);
                g2d.fill(circleBottomLeft);
                g2d.fill(circleBottomRight);
                break;
            case 5:
                g2d.fill(circleTopLeft);
                g2d.fill(circleTopRight);
                g2d.fill(circleBottomLeft);
                g2d.fill(circleBottomRight);
                g2d.fill(circleCenter);
                break;
            case 6:
                g2d.fill(circleTopLeft);
                g2d.fill(circleTopRight);
                g2d.fill(circleBottomLeft);
                g2d.fill(circleBottomRight);
                g2d.fill(circleLeftCenter);
                g2d.fill(circleRightCenter);
                break;

            //createCircles();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // call paintComponent of super class
        // cast graphics object to graphics2D object
        // call code to draw dice number

        super.paintComponent(g);
        g2d = (Graphics2D)g;
        g2d.setColor(Color.WHITE);
        g2d.fill(square);
        drawDiceNumber();
    }
}
