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
        if ( args.length != 2 ) {
            System.err.println( "CamelCaseNaming : <First word> <Second word>" );
        } else {
            String firstArgs = args[0];
            String secondArgs = args[1];

            // Substring in Java, I also used [0,1] ([1] letter from the first string becomes UpperCase)
                                            // ^ start from 1 and end in next letter
            // and used (1) for skip counting the first one letter in contrast start (skip-1) and going on to the rest.
            String firstLetter = firstArgs.substring(0,1);
            String remainLetter = firstArgs.substring(1);
            String firstWord = firstLetter.toUpperCase() + remainLetter.toLowerCase();

            // Same things goes for args[1]
            String secondLetter = secondArgs.substring(0,1);
            String remainScLetter = secondArgs.substring(1);
            String secondWord = secondLetter.toUpperCase() + remainScLetter.toLowerCase();

            // concatenate which used + .
            System.out.println( "The first word is " + firstWord );
            System.out.println( "The second word is " + secondWord );
            System.out.println( "The concatenate with camel case is " + firstWord + secondWord );
        }
    }
}
