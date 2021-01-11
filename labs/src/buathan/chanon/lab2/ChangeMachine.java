package buathan.chanon.lab2;

// The ChangeMachine program which represent how to input args from $Prompt$ and send user total cash in return.
// The program meant to return what bill used for all the cash which input.

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: December 29, 2020
 */

public class ChangeMachine {
    public static void main(String[] args) {
        
        // Condition if for args < 0 in other words (args can not becomes negative number).
        if (args.length != 4)  {
            
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
            
        } else {

            // Parsing String as args to Integer method.
            int oneCoin = Integer.parseInt(args[0]);
            int twoCoin = Integer.parseInt(args[1]);
            int fiveCoin = Integer.parseInt(args[2]);
            int tenCoin = Integer.parseInt(args[3]);

            // Calculate totalCash from coins we received from args method.
            int tenCash = tenCoin * 10;
            int fiveCash = fiveCoin * 5;
            int twoCash = twoCoin * 2;
            int oneCash = oneCoin;

            int totalCash = oneCash + twoCash + fiveCash + tenCash;

            // Calculate return cash method.
            int thousandCash = totalCash / 1000;
            int fiveHundredCash = ( totalCash % 1000 ) / 500;
            int oneHundredCash = ( ( ( totalCash % 1000 ) % 500 ) / 100 );
            int twentyCash = ( ( ( totalCash % 1000) % 500 ) % 100 ) / 20;
            int remainCash = ( ( ( totalCash % 1000) % 500 ) % 100 ) % 20;

            System.out.println("1-baht coins : " + oneCash);
            System.out.println("2-baht coins : " + twoCoin);
            System.out.println("5-baht coins : " + fiveCoin);
            System.out.println("10-baht coins : " + tenCoin);
            System.out.println("Total amount : " + totalCash);

            System.out.println("1,000-baht bill : " + thousandCash);
            System.out.println("500-baht bill : " + fiveHundredCash);
            System.out.println("100-baht bill : " + oneHundredCash);
            System.out.println("20-baht bill : " + twentyCash);
            System.out.println("Money remain : " + remainCash);
        }
    }
}
