package excerciseBasicJava;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.Scanner;

/**Perform a program that asks for two positive integers per keyboard and
 *  displays the following menu:
 *  MENU
 *  1. Add
 *  2. Subtract
 *  3. Multiply
 *  4.Divide 5.
 *  Exit
 *  Choose option:
 */
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner nun = new Scanner(System.in);

        System.out.println("write a number");
        int num1 = nun.nextInt();
        System.out.println("write a number");
        int num2 = nun.nextInt();
        System.out.println("* MENU");
        System.out.println("* 1. Add");
        System.out.println("* 2. Subtract");
        System.out.println("* 3. Multiply");
        System.out.println("* 4. Divide");
        System.out.println("*   exit");
        System.out.println("*    Choose option ");
        int opt = nun.nextInt();

        double result = menu(num1, num2, opt);
        System.out.println(result);
    }

    public static double menu(int num1, int num2, int opt) {
        double result = 0;
        switch (opt){
            case 1:
                result = num1 + num2;
            break;

            case 2:
                result = num1 - num2;
            break;

            case 3:
                result = num1 * num2;
            break;

            case 4:
                result = num1 / num2;
            break;

            default:
                System.out.println("you choose a wrong option");
                break;
        }
        return result;
    }
}
