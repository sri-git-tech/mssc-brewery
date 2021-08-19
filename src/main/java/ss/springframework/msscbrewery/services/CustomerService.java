package ss.springframework.msscbrewery.services;

import ss.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID custId);
}
