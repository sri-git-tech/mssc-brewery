package ss.springframework.msscbrewery.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ss.springframework.msscbrewery.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
