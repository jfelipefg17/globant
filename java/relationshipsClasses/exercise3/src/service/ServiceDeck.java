package service;

import entities.Card;

import java.util.ArrayList;
import java.util.Collections;

public class ServiceDeck {

    ArrayList<Card> deckCards = new ArrayList<>();
    ArrayList<Card> deck = new ArrayList<>();

    public void createDeck () {
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    deckCards.add(new Card(numero, palo));
                }
            }
        }
    }

    public void printDeck() {
        for ( Card carta : deckCards ) {
            System.out.println(carta.getNumber() + " / " + carta.getType());
        }
    }

    public void shuffle () {
        Collections.shuffle(deckCards);
    }

    public ArrayList giveCard (int n) {

        if (n < deckCards.size()) {
            for ( int i = 0; i < n; i++ ) {
                deck.add(deckCards.get(i)) ;
                deckCards.remove(i);
            }
            return deck;
        } else {
            return null;
        }

    }

    public void printDeckR() {
        for ( Card carta : deck ) {
            System.out.println(carta.getNumber() + " / " + carta.getType());
        }
    }

}
