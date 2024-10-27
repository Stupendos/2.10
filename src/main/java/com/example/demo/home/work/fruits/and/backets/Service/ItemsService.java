package com.example.demo.home.work.fruits.and.backets.Service;

import com.example.demo.home.work.fruits.and.backets.Items.Items;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemsService {
    private static final Map<Integer, Items> Items = new HashMap();

    static {
        Items.put(1, new Items(1,"Apple"));
        Items.put(2, new Items(2, "Banana"));
        Items.put(3, new Items(3, "Orange"));
        Items.put(4, new Items(4, "Pear"));
        Items.put(5, new Items(5, "Grape"));
        Items.put(6, new Items(6, "Pineapple"));
        Items.put(7, new Items(7, "Watermelon"));
    }

    public Items getProductById(Integer itemId) {
        return Items.computeIfAbsent(itemId, id -> new Items(id, "Новый предмет" + id));
    }

    public String getProductNameById(Integer itemId) {
        Items item = getProductById(itemId);
        return item.getName();
    }
}
