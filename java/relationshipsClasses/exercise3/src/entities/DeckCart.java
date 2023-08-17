package entities;

import java.util.HashMap;

public class DeckCart {
    private HashMap<Integer, Cart> deckCard;

    public DeckCart(HashMap<Integer, Cart> deckCard) {
        this.deckCard = deckCard;
    }

    public HashMap<Integer, Cart> getDeckCard() {
        return deckCard;
    }

    public void setDeckCard(HashMap<Integer, Cart> deckCard) {
        this.deckCard = deckCard;
    }
}
