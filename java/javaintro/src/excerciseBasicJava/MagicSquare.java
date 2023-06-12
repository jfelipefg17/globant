package excerciseBasicJava;

import java.util.Scanner;

/**
 * A magic square 3 x 3 is a matrix 3 x 3 formed by numbers from 1 to 9 where
 * the sum of its rows, columns and diagonals are identical. Create a program
 * that allows you to enter a square by keyboard and determine if this square
 * is magic or not. The program must check that the numbers entered are
 * correct, that is, between 1 and 9.
 * <p>
 * 2 7 6
 * 9 5 1 > 15
 * 4 3 8
 * ^     \
 * 15     15
 */
public class MagicSquare {
    public static void main(String[] args) {
        Scanner nun = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for ( int i = 0; i <= 2; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                System.out.println("Write a number");
                int num1 = nun.nextInt();
                matrix[i][j] = num1;
            }
        }
        for ( int i = 0; i <= 2; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                System.out.print(" [" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
        check(matrix);
    }

    public static void check(int[][] matrix) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for ( int i = 1; i <= 1; i++ ) {
            for ( int j = 0; j <= 2; j++ ) {
                sum1 = sum1 + matrix[i][j];
            }
        }

        for ( int j = 0; j <= 2; j++ ) {
            sum2 = sum2 + matrix[j][0];
        }


        for ( int i = 0; i <= 2; i++ ) {
            int j = 0;
            sum3 = sum3 + matrix[i][j];
            j = j + 1;
        }

        if (sum1 == sum2 && sum2 == sum3) {
            System.out.println("it is a magic square");
        } else {
            System.out.println("it is not a magic square");
        }
    }
}
