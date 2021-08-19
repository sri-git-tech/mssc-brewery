package ss.springframework.msscbrewery.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ss.springframework.msscbrewery.services.CustomerService;
import ss.springframework.msscbrewery.web.model.BeerDto;
import ss.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{custId}")
    public ResponseEntity<CustomerDto> getBeer(@PathVariable UUID custId)
    {
        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }
}
