package pl.urbanskilukasz.carRent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CarDto {
    String vehicleBrand;
    String model;
    int yearOfProduction;
}
