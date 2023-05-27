import java.util.Scanner;

public class IfElse2 {
    public static void main (String[] args) {

        Scanner num = new Scanner(System.in);
        int major = 0;

        System.out.println("write a number");
        int num1 = num.nextInt();
        System.out.println("write a number");
        int num2 = num.nextInt();
        System.out.println("write a number");
        int num3 = num.nextInt();

        if (num1 < num2) {
            major = num2;
            if (num2 < num3) {
                major = num3;
            }
        } else if (num1 > num3) {
            major = num1;
        }
        System.out.println(major);
    }
}
