package ss.springframework.msscbrewery.mappers;

import org.mapstruct.Mapper;
import ss.springframework.msscbrewery.domain.Beer;
import ss.springframework.msscbrewery.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}