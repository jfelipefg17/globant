package basicJava;
import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int cont = 0;
        int sum = 0;

        do {

            System.out.println("Write a number");
            int num1 = num.nextInt();
            sum = sum + num1;
            cont ++;

        }while(cont <= 5);
        System.out.println("your sum is: " + sum);
    }
}
