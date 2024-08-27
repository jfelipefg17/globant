package basicJava;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [][] array = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("write a number");
                int num1 = num.nextInt();
                array[i][j] = num1;
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("[" + array[i][j] + "]");

            }
            System.out.println("");
        }
    }
}
