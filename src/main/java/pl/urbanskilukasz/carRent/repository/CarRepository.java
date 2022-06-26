package pl.urbanskilukasz.carRent.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.urbanskilukasz.carRent.model.car.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

    @Query(value = "SELECT * FROM CAR",
    nativeQuery = true)
    List<Car> findAllCar(Pageable page);

    List<Car> findByVehicleBrand(String vehicleBrand);
}
