package org.murismo.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Results {
    public String id;
    public String eventType;
    @SerializedName("event_name")
    public String eventName;
    public Date date;
    @SerializedName("decks")
    public List<Player> players;
}
