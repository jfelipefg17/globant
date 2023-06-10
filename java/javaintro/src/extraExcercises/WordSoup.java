package extraExcercises;

import java.util.Random;
import java.util.Scanner;

/**Build a program that reads 5 words of minimum 3 and up to 5 characters
 * and, as the user enters them, build a "children’s letter soup" of size 20
 * x 20 characters. The words will all be placed in horizontal order in a row
 * that will be selected randomly. After word placement is complete, fill the
 * unused spaces with a random number from 0 to 9. Finally print the created
 * word soup on the screen.

 * Note: To solve the exercise you should investigate how the following Java
 * substring(), Length() and Math.random()
 * */
public class WordSoup {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        String [][] matrix = new String [10][10];


        for (int i = 0; i <= 4; i++ ) {
            System.out.println("write a word between 3 to 6 characters");
            String word = read.nextLine();

            int lon = word.length();
            int fil = random.nextInt(9);
            int colm = random.nextInt(9);

            while(colm + lon > 9) {
                colm = random.nextInt(9);
            }

            for (int j = 0 ; j <= lon - 1 ; j++) {
                matrix[fil][colm] = word.substring(j, j + 1);
                colm = colm + 1;
            }


        }
        mm(matrix);
    }

    public static void mm(String [][] matrix) {
        for (int s = 0; s <= 9; s++) {
            for (int l = 0; l <= 9; l++) {
                if (matrix[s][l] == null){
                    int num = (int) (Math.random() * 9);
                    String numC= String.valueOf(num);
                    matrix[s][l] = numC;
                }
            }
        }
            for (int r = 0; r <= 9; r++) {
                for (int p = 0; p <= 9; p++) {
                    System.out.print(" [ " + matrix[r][p] + " ] ");
                }
                System.out.println(" ");
            }

    }
}
