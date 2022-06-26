package pl.urbanskilukasz.carRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanskilukasz.carRent.model.rental.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
}
