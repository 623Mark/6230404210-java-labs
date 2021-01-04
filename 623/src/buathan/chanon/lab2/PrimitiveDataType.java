package buathan.chanon.lab2;

//  This program shows what Primitive data type used to store data as following.

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: December 28, 2020
 */

public class PrimitiveDataType {
    public static void main(String[] args) {
        byte myByte = 120;                          // Stores whole numbers from -128 to 127
        short myShort = 32000;                      // Stores whole numbers from -32,768 to 32,767
        int myNum = 2000000000;                     // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 9000000000000000l;             // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloatNum = 1.123456f;               // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myDouble = 1.12345678910;            // Stores fractional numbers. Sufficient for storing 15 decimal digits
        char myLetter = 'a';                        // Stores a single character/letter or ASCII values
        boolean myBool = true;                      // Stores true or false values
        // ref for all detail above from " https://www.w3schools.com/java/java_data_types.asp "
        // String myText = "Hello";
        
        // Represent the eight primitive data types in Java.
        System.out.println(myBool);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myNum);

        System.out.println(myFloatNum);
        System.out.println(myDouble);
        System.out.println(myLetter);
        System.out.println(myByte);

    }
}
