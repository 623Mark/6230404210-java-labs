/**
 MatrixDisplay, the program which plays in 2-Dimensional matrix[row][column]
 The program display matrix that user input in variety of display(original matrix that user input)(sort by row)(sort by column)
 By that asides; (sort by row backward)(sort by column backward)(sort by zigzag)
 In this code, I may use code-block a lot for practically well-reading.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: January 24, 2020
 */

package buathan.chanon.lab4;

import java.util.Scanner;

public class MatrixDisplay
{
    static int[][] matrix;
    static int rowDimension, columnDimension;
    static Scanner inputNum = new Scanner(System.in);

    public static void main(String[] args)
    {

        inputMatrix();
        showMatrix();

        showMatrixByRow();
        showMatrixByColumn();

        showMatrixByRowBackward();
        showMatrixByColumnBackward();

        showMatrixByRowZigzag();

    }

    // scanner received int row and column numbers.
    public static void inputMatrix()
    {
        System.out.println("Enter number of row then number of column of a matrix:");
        rowDimension = inputNum.nextInt();
        columnDimension = inputNum.nextInt();

        // check if user input invalid array size as array[0][constant], array[constant][0], array[0][0]
        while (rowDimension <= 0 || columnDimension <= 0)
        {
            System.out.println("Number of column and row must be positive.");
            rowDimension = inputNum.nextInt();
            columnDimension = inputNum.nextInt();
            }

        // looping 2D matrix
        matrix = new int[rowDimension][columnDimension];
        System.out.println("Enter your matrix by row.");
        for (int i = 0; i < rowDimension; i++ )
        {
            for (int j = 0; j < columnDimension; j++)
            {
                matrix[i][j] = inputNum.nextInt();
            }
        }
    }

    // " " used for giving space to every int that loop in array
    // same goes for, println() as giving (\n)
    public static void showMatrix()
    {

        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showMatrixByRow()
    {
        System.out.print("Show matrix by rows : ");
        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    // as column I switch [i][j] and switch row/column condition in for loop
    public static void showMatrixByColumn()
    {
        System.out.print("Show matrix by columns : ");

            for (int i = 0; i < columnDimension; i++)
            {
                for (int j = 0; j < rowDimension; j++)
                {
                    System.out.print(matrix[j][i] + " ");
                }
            }
        System.out.println();
    }

    // as row backward, condition is the same as row but in system.out ;
    // -1 for not out of array, row and column index -i/ -j for decreasing
    public static void showMatrixByRowBackward()
    {
        System.out.print("Show matrix by rows backward : ");
        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print(matrix[rowDimension -1 -i][columnDimension -1 -j] + " ");
            }
        }
        System.out.println();
    }

    // as column backward, condition was initial as column/row - 1 for starting at  the last index
    // [j][i] same as by column, which is switch from by row
    public static void showMatrixByColumnBackward()
    {
        System.out.print("Show matrix by column backward : ");

        for (int i = columnDimension - 1 ; i >= 0 ; i--)
        {
            for (int j = rowDimension - 1 ; j >= 0 ; j--)
            {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    // Two for loops, one for forward scanning and second for backward scanning.
    public static void showMatrixByRowZigzag()
    {
        System.out.print("Show matrix by rows zigzag : ");
        try
        {
            for (int k = 0; k < rowDimension; k++)
            {
                for (int i = 0; i < columnDimension; i++)
                {
                    System.out.print(matrix[k][i] + " ");
                }

            k++;
            for (int i = columnDimension - 1; i > 0; i--)
            {
                System.out.print(matrix[k][i] + " ");
            }
        }
        // catch exception array out of bound which occur in line:151-156
            // after looping index column and row as it's mismatch ex 3 4, 4 3
        } catch (ArrayIndexOutOfBoundsException ignored)
            {
                System.out.println();
            }
    }
}

