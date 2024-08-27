package basicJava;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println(" ");
            System.out.println("ride a number ");
            int num1 = num.nextInt();
            System.out.print(num1 + " ");

            for (int j = 1; j <= num1; j++ ) {
                System.out.print("*");
            }

        }
    }
}
