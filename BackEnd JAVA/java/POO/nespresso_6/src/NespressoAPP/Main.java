package NespressoAPP;

import NespressoAPP.entities.CoffeeMaker;
import NespressoAPP.service.CoffeeMakerService;

import java.util.Scanner;

/**
 * Nespresso Program. Develop a Coffee Maker class with the attributes
 * capacityMaxime (the maximum amount of coffee the coffee maker can
 * contain) and Actual (the current amount of coffee in the coffee
 * maker). Implement at least the following methods:
 *
 * Default or empty constructor.
 *
 * Constructor with maximum capacity and current quantity
 *
 * Getters and setters methods.
 *
 * Method of filling Fetera(): makes the current quantity equal to
 * the maximum capacity.
 *
 * ServirTaza(int) method: the size of an empty cup is requested, the
 * method receives the size of the cup and simulates the action of
 * serving the cup with the indicated capacity. If the current amount
 * of coffee "is not enough" to fill the cup, whatever is left is served. The method will inform the user if the cup was filled or not, and if it was not filled as soon as the cup was left.
 *
 * EmptyCafetera() method: sets the current amount of coffee to zero.d
 *
 * Method Add Coffee(int): the user is asked for a quantity of coffee,
 * the method is received and the amount of coffee is added to the
 * coffee maker.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        boolean n = true;
        int opt;
        CoffeeMakerService c = new CoffeeMakerService();
        CoffeeMaker cof1 = new CoffeeMaker(50,20);

        do {
            System.out.println("the actual capacity is :" + cof1.getCapActual());
            System.out.println("------------------------------------------------");
            System.out.println("the max capacity is :" + cof1.getCapMax());
            System.out.println("------------------------------------------------");
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("1. full fill coffee maker");
            System.out.println(" ");
            System.out.println("2. fill coffee maker");
            System.out.println(" ");
            System.out.println("3. empty coffee maker");
            System.out.println(" ");
            System.out.println("4. serve cup");
            System.out.println(" ");
            System.out.println("5. exit");
            opt = num.nextInt();
            switch (opt) {
                case 1:
                    cof1.setCapActual(c.fullFillingCM(cof1.getCapMax()));
                    break;
                case 2:
                    cof1.setCapActual(c.fillingCM());
                    break;
                case 3:cof1.setCapActual(c.emptyCM());
                    break;
                case 4:
                    cof1.setCapActual(c.serveCup(cof1.getCapActual()));
                    break;
                case 5:
                    n = false;
                    break;
                default:
                    System.out.println("you type a rong number");
                    System.out.println("do it again");
                    System.out.println(" ");
            }
        }while(n != false);
        System.out.println("------BYE-------");
    }
}