package basicJava;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = 11;
        while (!(num1 >= 0 && num1 <= 10)) {
            System.out.println("ride your grade");
            num1 = num.nextInt();
        }
    }
}
