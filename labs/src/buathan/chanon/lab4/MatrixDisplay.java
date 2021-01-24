package buathan.chanon.lab4;

import java.util.Scanner;

public class MatrixDisplay {
    static int[][] matrix;
    static int rowDimension, columnDimension;
    static Scanner inputNum = new Scanner(System.in);

    public static void main(String[] args) {

        inputMatrix();
        showMatrix();

        showMatrixByRow();
        showMatrixByColumn();

        showMatrixByRowBackward();
        showMatrixByColumnBackward();

        showMatrixByRowZigzag();

    }

    public static void inputMatrix()
    {
        System.out.println("Enter number of row then number of column of a matrix:");
        rowDimension = inputNum.nextInt();
        columnDimension = inputNum.nextInt();
        while (rowDimension <= 0 || columnDimension <= 0)
        {
            System.out.println("Number of column and row must be positive.");
            rowDimension = inputNum.nextInt();
            columnDimension = inputNum.nextInt();
            }

        //
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

    public static void showMatrix()
    {
        //int matrix[][] = new int[rowDimension][columnDimension];
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

    public static void showMatrixByColumn()
    {
        System.out.print("Show matrix by columns : ");

        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                //int[][] matrixColumn = new int[j][i];
                //matrixColumn[j][i] = matrix[i][j];
                System.out.print( matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByRowBackward()
    {
        System.out.print("Show matrix by rows backward : ");
        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
        }
    }

    public static void showMatrixByColumnBackward()
    {
        System.out.print("Show matrix by column backward : ");
        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
        }
    }
    public static void showMatrixByRowZigzag()
    {
        System.out.print("Show matrix by rows zigzag : ");
        for (int i = 0; i < rowDimension; i++)
        {
            for (int j = 0; j < columnDimension; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
        }
    }
}

