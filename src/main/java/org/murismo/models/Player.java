package org.murismo.models;

import java.util.List;

public class Player {
    public String player;
    public List<Deck> deck;

    // it seems like the cards are split wtf!
    public Deck getMainDeck(){
        return deck.stream().filter(d -> !d.isSideboard).findFirst().orElseThrow();
    }

    public Deck getSideboard(){
        return deck.stream().filter(d -> d.isSideboard).findFirst().orElseThrow();
    }
}
