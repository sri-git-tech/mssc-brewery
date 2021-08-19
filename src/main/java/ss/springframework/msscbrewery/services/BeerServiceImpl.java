package ss.springframework.msscbrewery.services;


import org.springframework.stereotype.Service;
import ss.springframework.msscbrewery.web.model.BeerDto;
import ss.springframework.msscbrewery.web.model.BeerStyleEnum;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().beerName("Beer1").beerStyle(BeerStyleEnum.ALE).price(new BigDecimal(2.99)).upc(323232L).build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beer) {
        return BeerDto.builder().beerName("Beer1").beerStyle(BeerStyleEnum.ALE).price(new BigDecimal(2.99)).upc(323232L).build();
    }
}
