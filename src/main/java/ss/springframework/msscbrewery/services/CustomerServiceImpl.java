package ss.springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import ss.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID custId) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).customerName("First").build();
    }
}
