/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 24, 2020
 */

package buathan.chanon.lab4;

import java.util.Scanner;

public class StudentGPA {
    static int MAX_NUMBER_OF_COURSE = 150;

    static int[] year = new int[MAX_NUMBER_OF_COURSE]; // int as year 1st to year 8th
    static int[] term = new int[MAX_NUMBER_OF_COURSE]; // 1 first term, 2 second term, 3 third summer
    static String[] courseName = new String[MAX_NUMBER_OF_COURSE]; // ex. EN811301
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSE]; // int 1 to 3
    static String[] grades = new String[MAX_NUMBER_OF_COURSE]; // A, B+, B, C+, C, D+, D, F

    static int numberOfCourse = 0;
    //static int counterLoop = 1;

    static Scanner inputInfo = new Scanner(System.in);

    public static void main(String[] args) {
        //questionUserToDo();
        first();
        inputGrades();
        showGPA();
    }

    public static void first() {
        System.out.println("Enter grades of student (year term name_course credit grade).");
        System.out.println("Finish when enter year with 0");
        return;
    }

    public static void inputGrades() {
        int yearInfo = inputInfo.nextInt();
    /*
        while (yearInfo >= 0) {
            continue;
        }
     */
        if (yearInfo == 0) {
            System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, 't' for GPA for specific term or 'q' to exit");
            String inputCommand = inputInfo.next();

            if (inputCommand.equals("o")) {
                inputGrades();

            } else if (inputCommand.equals("a")) {
                inputGrades();

            } else if (inputCommand.equals("t")) {
                inputGrades();

            } else if (inputCommand.equals("q")) {
                System.exit(0);

            } else {


                //termInfo = new int[MAX_NUMBER_OF_COURSE];
                for (numberOfCourse = 0; numberOfCourse < MAX_NUMBER_OF_COURSE; numberOfCourse++) {

                    //inputGrades.yearInfo[numberOfCourse] = inputInfo.nextInt();
                    term[numberOfCourse] = inputInfo.nextInt();
                    courseName[numberOfCourse] = inputInfo.next();
                    courseCredit[numberOfCourse] = inputInfo.nextInt();
                    grades[numberOfCourse] = inputInfo.next();

                            /*
                    System.out.println(year[numberOfCourse] + " ");
                    System.out.println(term[numberOfCourse] + " ");
                    System.out.println(courseName[numberOfCourse] + " ");
                    System.out.println(courseCredit[numberOfCourse] + " ");
                    System.out.println(grades[numberOfCourse] + " ");
                    */
                }
            }
        }
    }

        public static void loopArray() {

        }


        public static void showGPA() {
            System.out.println("Accumulated GPA is " + "3.0");
        }
    }

