package Basket;

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
    public Map<Integer, String> getItems() {
        return getItems();
    }
}
