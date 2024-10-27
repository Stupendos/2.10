package com.example.demo.home.work.fruits.and.backets.Basket;

import com.example.demo.home.work.fruits.and.backets.Items.Items;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Integer, String> basket;

    public Basket() {
        this.basket = new HashMap<>();
    }
    public void addItem(int itemId, String itemName) {
        basket.put(itemId, itemName);
    }
//    public Map<Integer, String> getItems(int itemId) {
//        return getItems(itemId);
//    }

    public Map<Integer, String> getItems() {
        return Map.copyOf(basket);
    }
}
