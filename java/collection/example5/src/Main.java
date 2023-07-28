import service.ServiceCountry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean anw;
        Scanner boo = new Scanner(System.in);
        ServiceCountry s1 = new ServiceCountry();

        do {
            s1.addCountry();
            System.out.println("want add another country");
            anw = boo.nextBoolean();
        }while (anw);

        s1.printCountry();
        System.out.println("=============================");
        s1.orderAZ();
        System.out.println("=============================");
        do {
            s1.deleteCountry();
            System.out.println("want delete another country");
            anw = boo.nextBoolean();
        }while (anw);

        s1.printCountry();
    }
}