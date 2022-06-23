package pl.urbanskilukasz.carRent.mapper;

import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.car.CarDto;


public class CarMapper {
    private static final Long EMPTY_ID = null;

    public Car mapToCar(CarDto dto) {
        return new Car(
                EMPTY_ID,
                dto.getVehicleBrand(),
                dto.getModel(),
                dto.getYearOfProduction()
        );
    }

    public CarDto mapToDto(Car car) {
        return new CarDto(
                car.getVehicleBrand(),
                car.getModel(),
                car.getYearOfProduction()
        );
    }
}
