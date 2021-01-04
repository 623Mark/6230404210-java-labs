package buathan.chanon.lab2;
import java.lang.Math;

import java.math.BigDecimal;
import java.math.RoundingMode;

// The CircleCalculator showing the calculate which is from the area of circle, and perimeter.

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: December 29, 2020
 */

public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("CircleCalculator <radius of a circle>");
        } else {
            String inputRadius = args[0];
            float radius = Float.parseFloat(inputRadius);
            float circleArea = (float) (radius * radius * Math.PI);
            float perimeter = (float) (2 * radius * Math.PI);
            // from circle formula => 1. Circle Area = (Pi) * r * r  2. Circle Perimeter = 2 * (Pi) * r  ; r = radius
            // ref : ("%.2f", How to print a float with 2 decimal places in Java? Stackoverflow

            // Big decimal method with setScale used for print a float with 2(from setScale) decimal.
            BigDecimal bdArea = new BigDecimal(circleArea).setScale(2, RoundingMode.HALF_UP);
            double twoDecimalcircle = bdArea.doubleValue();

            BigDecimal bdPerimeter = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);
            double twoDecimalperimeter = bdPerimeter.doubleValue();

            System.out.println("An area of a circle with radius of " + radius + " is " + twoDecimalcircle);
            System.out.println("A circumference is " + twoDecimalperimeter);
        }
    }
}
