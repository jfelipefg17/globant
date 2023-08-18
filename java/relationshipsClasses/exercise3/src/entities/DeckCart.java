package entities;

import java.util.HashMap;

public class DeckCart {
    private HashMap<Integer, Card> deckCard;

    public DeckCart(HashMap<Integer, Card> deckCard) {
        this.deckCard = deckCard;
    }

    public HashMap<Integer, Card> getDeckCard() {
        return deckCard;
    }

    public void setDeckCard(HashMap<Integer, Card> deckCard) {
        this.deckCard = deckCard;
    }
}
