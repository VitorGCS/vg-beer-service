package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 6250354039832317427L;

    private BeerDto beerDto;
}
