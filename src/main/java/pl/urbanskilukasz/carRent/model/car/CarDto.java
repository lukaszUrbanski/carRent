package pl.urbanskilukasz.carRent.model.car;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CarDto {
    String vehicleBrand;
    String model;
    int yearOfProduction;
}
