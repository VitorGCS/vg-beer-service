package guru.springframework.vgbeerservice.services.inventory;

import guru.springframework.vgbeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnhandInventory() {
        Integer goh = beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);

        System.out.println("##########################################Number of beers/inventory: "+goh);
    }
}