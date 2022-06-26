package pl.urbanskilukasz.carRent.mapper;

import org.springframework.data.domain.Page;
import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.dto.CarDto;

import java.util.List;
import java.util.stream.Collectors;


public class CarDtoMapper {
    private static final Long EMPTY_ID = null;

    public static Car mapToCar(CarDto dto) {
        return new Car(
                EMPTY_ID,
                dto.getVehicleBrand(),
                dto.getModel(),
                dto.getYearOfProduction()
        );
    }

    public static List<CarDto> mapToCarDtoList(List<Car> returnCars) {
        return returnCars.stream()
                .map(car -> mapToCarDto(car))
                .collect(Collectors.toList());

    }

   public static CarDto mapToCarDto(Car car) {
        return CarDto.builder()
                .id(car.getId())
                .vehicleBrand(car.getVehicleBrand())
                .model(car.getModel())
                .yearOfProduction(car.getYearOfProduction())
                .build();
    }
}
