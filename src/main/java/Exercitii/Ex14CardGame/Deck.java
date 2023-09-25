package Exercitii.Ex14CardGame;

import java.util.*;

public class Deck {
    private List<String> suit;
    private List<String> rank;
    private List<String> deckCards;

    public Deck(List<String> suit, List<String> rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public List<String> getSuit() {
        return suit;
    }

    public void setSuit(List<String> suit) {
        this.suit = suit;
    }

    public List<String> getRank() {
        return rank;
    }

    public void setRank(List<String> rank) {
        this.rank = rank;
    }

    public List<String> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(List<String> deckCards) {
        this.deckCards = deckCards;
    }

    public List<String> GenerateDeck(List<String> suite, List<String> ranks) {
        List<String> deckCards = new ArrayList<>();
        for (String suit: suite ){
            for(String rank: ranks){
                deckCards.add(suit + " de " + rank);
            }
        }
            return deckCards;
    }

    public void shuflleDeck() {
        Collections.shuffle(this.deckCards);
    }
}

