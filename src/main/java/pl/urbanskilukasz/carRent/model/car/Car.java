package pl.urbanskilukasz.carRent.model.car;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    public Car(Long id, String vehicleBrand, String model, int yearOfProduction) {
        this.id = id;
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String vehicleBrand;
    String model;
    Integer yearOfProduction;
    Long millage;
    String registration;
    BodyType bodyType;
    Integer dorAmount;

}
