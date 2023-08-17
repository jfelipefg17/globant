package service;

import entities.Cart;

import java.util.HashMap;
import java.util.Map;

public class ServiceDeck {

    HashMap<Integer, Cart> deckCarts = new HashMap<>();

    public HashMap createDeck () {

        int aux = 0;

        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i !=9) {
                aux ++;
                deckCarts.put(aux, new Cart(i, "espadas"));
            }
        }
        aux = 0;
        for (int h = 1; h <= 12; h++) {
            if (h != 8 && h !=9) {
                aux ++;
                deckCarts.put(aux+10, new Cart(h, "bastos"));;
            }
        }
        aux = 0;
        for (int s = 1; s <= 12; s++) {
            if (s != 8 && s !=9) {
                aux ++;
                deckCarts.put(aux+20, new Cart(s, "copas"));
            }
        }
        aux = 0;
        for (int n = 1; n <= 12; n++) {
            if (n != 8 && n !=9) {
                aux ++;
                deckCarts.put(aux+30, new Cart(n, "oros"));
            }
        }
        return deckCarts;
    }

    public void printDeck() {
        for ( Map.Entry<Integer, Cart> entry : deckCarts.entrySet() ) {
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }
    }

}
