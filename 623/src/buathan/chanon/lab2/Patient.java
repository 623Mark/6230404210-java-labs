package buathan.chanon.lab2;

//  This Patient program represent the details about patient as following <name><age><country>

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: December 28, 2020
 */

public class Patient {
    public static void main(String[] args){
        if (args.length != 3){
            System.err.println("Patient <patient name><patient age><country>");
        } else {
            String patientName = args[0], patientAge = args[1], patientCountry = args[2];
            /*
             My curiosity is could it be better to use the less code in our code?
             or is it readable and easy too organize if separated each variables.
            */

            // Format string
            //System.out.printf("Patient's name is %s \n Patient's age is %s \n and just come from %s", patientName, patientAge, patientCountry);
            System.out.println("Patient's name is " + patientName);
            System.out.println("Patient's age is " + patientAge);
            System.out.println(patientName+" comes from " + patientCountry);
        }

    }
}
