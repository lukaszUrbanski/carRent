package pl.urbanskilukasz.carRent.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanskilukasz.carRent.model.Car;
import pl.urbanskilukasz.carRent.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car returnCar(long id) {
        return carRepository.findById(id).orElseThrow();

    }

    public List<Car> returnCars() {
        return carRepository.findAll();
    }

    public List<Car> returnCarsByVehicleBrand(String vehicleBrand) {
        return carRepository.findByVehicleBrand(vehicleBrand);
    }
}
