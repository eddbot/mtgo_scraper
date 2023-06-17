package org.murismo.models;


import com.google.gson.annotations.SerializedName;

public class DeckCard {
    @SerializedName("CARD_ATTRIBUTES")
    public Attributes attributes;
    @SerializedName("Quantity")
    public Integer quantity;


}
