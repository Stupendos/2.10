package Service;

import java.util.List;
import java.util.Map;

public interface BasketService {

    String addItemsById(List<Integer> itemsId, ItemsService itemsService);

    Map<Integer, String> getItems();
}
