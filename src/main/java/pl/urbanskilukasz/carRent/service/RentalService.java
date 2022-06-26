package pl.urbanskilukasz.carRent.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanskilukasz.carRent.model.dto.RentalDto;
import pl.urbanskilukasz.carRent.model.rental.Rental;
import pl.urbanskilukasz.carRent.repository.CarRepository;
import pl.urbanskilukasz.carRent.repository.RentalRepository;
import pl.urbanskilukasz.carRent.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class RentalService {

    private final RentalRepository rentalRepository;
    private final UserRepository userRepository;
    private final CarRepository carRepository;

    private static final Long EMPTY_ID = null;

    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }

    public Rental findById(long id) {
        return rentalRepository.findById(id).orElseThrow();
    }


    public Rental createRental(RentalDto rentalDto ) {
        Rental rental = new Rental();
        rental.setId(EMPTY_ID);
        rental.setCar(carRepository.getById(rentalDto.getCarId()));
        rental.setUser(userRepository.getById(rentalDto.getUserId()));
        rental.setRentalTime(LocalDateTime.now());

        return rentalRepository.save(rental);
    }


}
