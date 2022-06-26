package pl.urbanskilukasz.carRent.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.urbanskilukasz.carRent.mapper.CarDtoMapper;
import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.dto.CarDto;
import pl.urbanskilukasz.carRent.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    private final int PAGE_SIZE = 10;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarDto returnCar(long id) {
        return CarDtoMapper.mapToCarDto(carRepository.findById(id).orElseThrow());

    }

    public List<Car> returnCars(int page) {
        return carRepository.findAllCar(PageRequest.of(page, PAGE_SIZE));
    }

    public List<Car> returnCarsByVehicleBrand(String vehicleBrand) {
        return carRepository.findByVehicleBrand(vehicleBrand);
    }

    public Car createCar(CarDto carDto) {
        return carRepository.save(CarDtoMapper.mapToCar(carDto));
    }


    public Car updateCar(CarDto carDto, Long id) {
        Car car = CarDtoMapper.mapToCar(carDto);
        car.setId(id);
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
