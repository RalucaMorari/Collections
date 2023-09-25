package Exercitii.Ex14CardGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> suite = new ArrayList<>();
        List<String> ranks = new ArrayList<>();
        suite.add("trefla");
        suite.add("rosu");
        suite.add("negru");
        suite.add("caro");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("J");
        ranks.add("Q");
        ranks.add("K");
        ranks.add("A");
        Deck deck = new Deck(suite, ranks);

        deck.setDeckCards(deck.GenerateDeck(ranks, suite));
        System.out.println(deck.getDeckCards());

        Player player1 = new Player("Ionica Bostan");
        Player player2 = new Player("Costica Butucel");
        List<Player>players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        for(Player player : players){
            deck.shuflleDeck();
            List<String> playerCards = player.dealHand(deck, 5);
            System.out.println(playerCards);
        }
    }
}
