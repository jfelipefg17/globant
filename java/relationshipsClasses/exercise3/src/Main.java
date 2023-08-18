
import entities.Card;
import service.ServiceDeck;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner num = new Scanner(System.in);
    static ServiceDeck sd = new ServiceDeck();


    public static void main(String[] args) {

        int opt;
        boolean ss = true;
        ArrayList < Card> deck = new ArrayList<>();

        sd.createDeck();

        do {
            System.out.println("/// WELCOME TO DE MENU ///");
            System.out.println();
            System.out.println("/// 1. Show deck ");
            System.out.println();
            System.out.println("/// 2. Mix deck  ");
            System.out.println();
            System.out.println("/// 3. Give cards ");
            System.out.println();
            System.out.println("/// 4. Show delivery cards ");
            System.out.println();
            System.out.println("/// 5. exit ");
            opt = num.nextInt();

            switch (opt) {
                case 1 :
                    sd.printDeck();
                    break;
                case 2 :
                    sd.shuffle();
                    break;
                case 3 :
                    System.out.println("how many cards you want ?");
                    int number = num.nextInt();
                    deck = sd.giveCard(number);
                    System.out.println();
                    if (deck == null) {
                        System.out.println("we dont have that many cards");
                        System.out.println(" try again ");
                    } else {
                        System.out.println("// this are your cards //");
                        for ( Card carta : deck ) {
                            System.out.println(carta.getNumber() + " / " + carta.getType());
                        }
                    }
                    deck.clear();
                    break;
                case 4 :
                    System.out.println("// this are the card we delivery to you");
                    sd.printDeckR();
                    break;
                case 5 :
                    ss = false;
                    break;
                default:
                    System.out.println("///////////////////////");
                    System.out.println("wrong answer try again");
                    System.out.println();
            }
        }while (ss);

    }
}