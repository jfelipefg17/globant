package basicJava;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int suma = 0;

        do {


            System.out.println("ingrese un numero");
            num2 = num.nextInt();
            if (num2 > 0 ) {
                suma = suma + num2;
            }else if (num2 == 0) {
                System.out.println("se detecto un 0 ");
                break;
            }
            num1 ++;
        } while (num1 <= 20 );
        System.out.println("la suma de todos los numeros ingresados es " + suma);
    }
}
