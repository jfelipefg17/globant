package basicJava.excerciseBasicJava;

import java.util.Scanner;

/**
 * Create an application that through a function converts an amount of euros
 * entered by keyboard to another currency, these can be dollars, yen or
 * pounds.
 * The function will have as parameters, the amount of euros and the currency
 * to be converted that will be a string, this will not return any value and
 * will show a message indicating the change (void). Currency exchange is:
 * * 0.86 pounds is a 1 €
 * * 1.28611 $ is a 1 €
 * * 129.852 yen is a 1 €
 * */
public class ConvertsAmount {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        System.out.println("how many amount do you want to change ?");
        double amount = num1.nextInt();
        System.out.println("Do you want to change your euros to yen, pound or dollars ?");
        String currency = read.nextLine();

        exchange(amount, currency);

    }

    public static void exchange(double amount, String currency) {
        switch (currency) {
            case "yen":
                System.out.println("you have " + amount * 129.852 + " yens");
                break;
            case "pound":
                System.out.println("you have " + amount * 0.86 + " pounds");
                break;
            case "dollars":
                System.out.println("you have " + amount * 1.2861 + " dollars");
                break;
            default:
                System.out.println("we are sorry, we dont know that currency");

        }
    }


}
