package org.murismo.models;

import com.google.gson.annotations.SerializedName;

public class Attributes {
    @SerializedName("COLOR")
    public String color;
    @SerializedName("COST")
    public int cost;
    @SerializedName("Card_Code")
    public long cardCode;
    @SerializedName("NAME")
    public String name;
    @SerializedName("RARITY")
    public String rarity;
    @SerializedName("Set")
    public String set;
    @SerializedName("Type")
    public String type;
}
