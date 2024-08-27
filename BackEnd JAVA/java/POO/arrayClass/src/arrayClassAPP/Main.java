package arrayClassAPP;

import java.util.Arrays;
import java.util.Random;

/**
 *Perform a program in Java where two arrays are created: the first
 *  will be an array A of 50 real numbers, and the second B, an array
 *  of 20 numbers, also real. The program must initialize array A with
 *  random numbers and display it on the screen. Then array A must
 *  be sorted from lowest to highest and copy the first 10 numbers
 *  sorted to array B of 20 elements, and fill the last 10 elements
 *  with the value 0.5. Show the two resulting arrangements: the
 *  ordered of 50 elements and the combined of 20.
 *  */




public class Main {
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];


        llenarAleatoriamenteArreglo(arregloA);

        System.out.println("arreglo A: ");
        mostrarArreglo(arregloA);

        Arrays.sort(arregloA);

        // primeros 10 elementos
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }

        Arrays.fill(arregloB, 10, 20, 0.5);

        System.out.println("Arreglo A: ");
        mostrarArreglo(arregloA);

        System.out.println("Arreglo B: ");
        mostrarArreglo(arregloB);



    }

    private static void llenarAleatoriamenteArreglo(double[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(10);
        }
    }

    private static void mostrarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+ "|");

        }
        System.out.println("");
    }
}