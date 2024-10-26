package Controller;

import Service.BasketService;
import Service.ItemsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;
    private final ItemsService itemsService;


    public BasketController(BasketService basketService, ItemsService itemsService) {
        this.basketService = basketService;
        this.itemsService = itemsService;
    }

    @GetMapping("/add")
    public String addItemsById(@RequestParam List<Integer> itemIds) {
        basketService.addItemsById(itemIds, itemsService);
        return "Товары с ID " + itemIds + " успешно добавлены в корзину.";
    }

    @GetMapping("/get")
    public Map<Integer, String> getItems() {
        return basketService.getItems();
    }

}
