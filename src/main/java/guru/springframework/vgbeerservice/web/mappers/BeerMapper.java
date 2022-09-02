package guru.springframework.vgbeerservice.web.mappers;

import guru.springframework.vgbeerservice.domain.Beer;
import guru.springframework.vgbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
