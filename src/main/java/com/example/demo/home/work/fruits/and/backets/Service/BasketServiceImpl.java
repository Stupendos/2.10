package com.example.demo.home.work.fruits.and.backets.Service;
import com.example.demo.home.work.fruits.and.backets.Basket.Basket;
import com.example.demo.home.work.fruits.and.backets.Items.Items;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(ItemsService itemsService) {
        this.basket = new Basket();
    }

    @Override
    public String addItemsById(List<Integer> itemsId, ItemsService itemsService) {
        for (Integer itemId : itemsId) {
            Items item = itemsService.getProductById(itemId);
            if (item != null) {
                basket.addItem(item.getId(), item.getName());
            }
        }
        return "Товары успешно добавлены в корзину";
    }

    @Override
    public Map<Integer, String> getItems() {
        return basket.getItems();
    }

}


