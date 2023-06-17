package org.murismo.models;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class Deck {

    @SerializedName("SB")
    public Boolean isSideboard;

    @SerializedName("DECK_CARDS")
    public List<DeckCard> deckCards;

    public List<Card> cardList() {

        var cards = new HashMap<String, Card>();

        for (var card : deckCards) {
            var c = cards.getOrDefault(
                    card.attributes.name,
                    new Card(card.attributes.name, 0, card.attributes.type)
            );
            c.incrementQuantity(card.quantity);
            cards.put(card.attributes.name, c);
        }
        return cards.values().stream().toList();
    }
}
