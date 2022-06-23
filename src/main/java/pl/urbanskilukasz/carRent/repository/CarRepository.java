package pl.urbanskilukasz.carRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanskilukasz.carRent.model.car.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByVehicleBrand(String vehicleBrand);

}
