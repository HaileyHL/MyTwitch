package com.hailey.jupiter.entity.request;

import com.hailey.jupiter.entity.db.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {

    @JsonProperty("favorite") //match "favorite" with "favoriteItem"
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
