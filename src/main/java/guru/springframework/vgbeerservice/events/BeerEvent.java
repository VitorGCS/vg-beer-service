package guru.springframework.vgbeerservice.events;

import guru.springframework.vgbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 6250354039832317427L;

    private final BeerDto beerDto;
}
