package pl.urbanskilukasz.carRent.model;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String vehicleBrand;
    String model;
    int yearOfProduction;
}
