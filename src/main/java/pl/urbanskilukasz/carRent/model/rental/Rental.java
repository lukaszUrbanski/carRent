package pl.urbanskilukasz.carRent.model.rental;

import lombok.NoArgsConstructor;
import pl.urbanskilukasz.carRent.model.car.Car;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
    private LocalDateTime rentalTime;





}
