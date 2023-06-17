package org.murismo.models;

public class Card {
    private final String name;
    private Integer quantity;
    private final String type;

    public Card(String name, Integer quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public void incrementQuantity(Integer quantity) {
        this.quantity += quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}


