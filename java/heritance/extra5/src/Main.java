import services.ServiceRent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        ServiceRent s1 = new ServiceRent();

        s1.createRent();

        s1.printRents();

    }
}