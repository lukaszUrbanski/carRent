package pl.urbanskilukasz.carRent.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class CarDto {
    Long id;
    String vehicleBrand;
    String model;
    int yearOfProduction;
}
