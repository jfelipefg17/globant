package basicJava;
import java.util.Scanner;
public class IfElse {
    public static void main (String [] args) {

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("ingrese un numero entero ");
        int num11 = num1.nextInt();
        System.out.println("ingrese un numero entero ");
        int num22 = num2.nextInt();

        if ((num11 == 25) && (num22 == 25)) {

            System.out.println("both are 25");
        }else if (num11 == 25) {
            System.out.println("first number is 25");
        }else if (num22 == 25){
            System.out.println("second number is 25");
        } else {
            System.out.println("none is 25");
        }


    }
}
