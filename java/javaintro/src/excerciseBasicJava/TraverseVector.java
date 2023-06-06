package excerciseBasicJava;

import java.util.Scanner;

/**
 * Traverse a vector of integers N counting how many numbers are 1 digit,
 * how many 2 digits, (up to 5 digits).
 * */
public class TraverseVector {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] array = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("write a number");
            int num1 = num.nextInt();
            array[i] = num1;
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.print("[" + array[i] + "]");
        }

        System.out.println("");
        System.out.println("");

        one(array);
        two(array);

    }
    public static void one(int[] array) {
        int cont = 0;
        for (int i = 0; i < 10 ; i++) {
            if (array[i] + 1 <= 10 ) {
                cont ++;
            }
        }
        System.out.println("the array have " + cont + " numbers with two or more digit");
        System.out.println("");


    }

    public static void two(int[] array) {
        int cont = 0;
        for (int i = 0; i < 10 ; i++) {
            if (array[i] + 1 < 11 ) {
                cont ++;
            }
        }
        System.out.println("the array have " + cont + " numbers with one digit");
        System.out.println("");

    }
}
