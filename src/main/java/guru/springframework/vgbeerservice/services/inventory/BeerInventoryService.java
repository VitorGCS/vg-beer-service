package guru.springframework.vgbeerservice.services.inventory;

import java.util.UUID;

public interface BeerInventoryService {

    /*Integer getOnhandInventory(UUID beerId);*/

    Integer getOnhandInventory(String upc);
}
