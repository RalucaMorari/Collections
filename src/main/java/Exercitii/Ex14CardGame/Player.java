package Exercitii.Ex14CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> dealHand(Deck deck, int numersOfCards){
        List<String> cardDeck = deck.getDeckCards();
        List<String> handCards = cardDeck.subList(cardDeck.size()-numersOfCards, cardDeck.size());

        return handCards;
    }
}
