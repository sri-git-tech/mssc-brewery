package ss.springframework.msscbrewery.services;

import org.springframework.http.ResponseEntity;
import ss.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);
}
