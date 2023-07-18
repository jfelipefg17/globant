import entities.Calculator;
import services.ServiceCalculator;

import java.util.Scanner;

public class Main {

    static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        ServiceCalculator s1 = new ServiceCalculator();

        System.out.println("write the price");
        int n = num.nextInt();
        c1.setNum1(n);
        System.out.println("your price with discount is: " +s1.discount10(c1.getNum1()));


    }
}