package guru.springframework.vgbeerservice.services;

import guru.springframework.vgbeerservice.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
