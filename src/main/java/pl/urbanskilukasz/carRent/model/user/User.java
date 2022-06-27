package pl.urbanskilukasz.carRent.model.user;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.urbanskilukasz.carRent.model.rental.Rental;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String telNumber;
    private LocalDate dateOfBirth;
    private String driverLicenceNumber;
    private boolean isActive;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Rental> rentalHistory;

}
