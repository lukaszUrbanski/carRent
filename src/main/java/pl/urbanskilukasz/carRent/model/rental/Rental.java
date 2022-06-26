package pl.urbanskilukasz.carRent.model.rental;

import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.urbanskilukasz.carRent.model.car.Car;
import pl.urbanskilukasz.carRent.model.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime rentalTime;





}
