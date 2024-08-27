package NespressoAPP.service;

import java.util.Scanner;

public class CoffeeMakerService {
    Scanner num = new Scanner(System.in);


    public int fullFillingCM (int capMax) {
        return capMax;
    }
    public int fillingCM () {
        System.out.println("how many coffee do you want to fill, remember the coffee maker have ");
        return num.nextInt();
    }
    public int emptyCM() {
        return 0;
    }
    public int serveCup(int capActual ) {
        capActual = capActual - 10;
        return capActual;
    }
}
