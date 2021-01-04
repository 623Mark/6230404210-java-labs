package buathan.chanon.lab2;

// The CamelCaseNaming program which reflect programmer coding style that's (_^) which means the second letter must be
// Uppercase for easily readable which other can understand in instant.

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: December 29, 2020
 */

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length != 2)  {
            System.err.println("CamelCaseNaming : <First word> <Second word>");
        } else {
            String convertOne = args[0];
            String convertTwo = args[1];

            // Substring in Java, I also used [0,1] ([1] letter from the first string becomes UpperCase)
                                            // ^ start from 1 and end in next letter
            // and used (1) for skip counting the first one letter in contrast start (skip-1) and going on to the rest.
            String firstLetter = convertOne.substring(0,1);
            String remainLetter = convertOne.substring(1);
            String first = firstLetter.toUpperCase() + remainLetter.toLowerCase();

            // Did the same things to args[1]
            String secondLetter = convertTwo.substring(0,1);
            String remainScLetter = convertTwo.substring(1);
            String second = secondLetter.toUpperCase() + remainScLetter.toLowerCase();

            // concatenate which used + .
            System.out.println("The first word is " + args[0]);
            System.out.println("The second word is " + args[1]);
            System.out.println("The concatenate with camel case is " + first + second);
        }

    }
}
