package guru.springframework.vgbeerservice.services.brewing;

import guru.springframework.vgbeerservice.config.JmsConfig;
import guru.springframework.vgbeerservice.domain.Beer;
import guru.springframework.vgbeerservice.events.BrewBeerEvent;
import guru.springframework.vgbeerservice.repositories.BeerRepository;
import guru.springframework.vgbeerservice.services.inventory.BeerInventoryService;
import guru.springframework.vgbeerservice.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BrewingService {
    private final BeerRepository beerRepository;
    private final BeerInventoryService beerInventoryService;
    private final JmsTemplate jmsTemplate;
    private final BeerMapper beerMapper;

    @Scheduled(fixedRate = 5000) //every 5 seconds
    public void checkForLowINventory(){
        List<Beer> beers = beerRepository.findAll();

            beers.forEach(beer -> {
                Integer invQOH = beerInventoryService.getOnhandInventory(beer.getUpc());
                log.debug("Min Onhand is: "+beer.getMinOnHand());
                log.debug("Inventory is: "+invQOH);

                //if(beer.getMinOnHand() >= invQOH){
                    jmsTemplate.convertAndSend(JmsConfig.BREWING_REQUEST_QUEUE, new BrewBeerEvent(beerMapper.beerToBeerDto(beer)));
                //}
            });
    }
}
