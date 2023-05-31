import java.util.Scanner;
public class Procedure {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Write a number: ");
        int num1 = num.nextInt();
        System.out.println("Write a number: ");
        int num2 = num.nextInt();

        IsMultiple(num1, num2);

    }
    public static void IsMultiple (int num3, int num4) {
        if (num4 % num3 == 0) {
            System.out.println("number 2 is multiple of number 1");
        }else {
            System.out.println("number 2 is not multiple of number 1");
        }
    }
}
