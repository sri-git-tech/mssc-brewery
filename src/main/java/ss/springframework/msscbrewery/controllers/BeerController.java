package ss.springframework.msscbrewery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ss.springframework.msscbrewery.services.BeerService;
import ss.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @Autowired
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId)
    {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody @Validated BeerDto beer)
    {
/*
        BeerDto saveDto = beerService.saveBeer(beer);
*/
/*        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "api/v1/beer".concat(beer.getId().toString()));*/
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
