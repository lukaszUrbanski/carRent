package pl.urbanskilukasz.carRent.service;

import org.springframework.stereotype.Service;
import pl.urbanskilukasz.carRent.mapper.CarMapper;
import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.car.CarDto;
import pl.urbanskilukasz.carRent.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private static final Long EMPTY_ID = null;
    private final CarRepository carRepository;
    private final CarMapper carMapper = new CarMapper();

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarDto returnCar(long id) {
        return carMapper.mapToDto(carRepository.findById(id).orElseThrow());

    }

    public List<CarDto> returnCars() {

        return carRepository.findAll().stream()
                .map(car -> carMapper.mapToDto(car))
                .collect(Collectors.toList());
    }

    public List<Car> returnCarsByVehicleBrand(String vehicleBrand) {
        return carRepository.findByVehicleBrand(vehicleBrand);
    }

    public Car createCar(CarDto carDto) {
        return carRepository.save(carMapper.mapToCar(carDto));
    }


    public Car updateCar(CarDto carDto, Long id) {
        Car car = carMapper.mapToCar(carDto);
        car.setId(id);
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
