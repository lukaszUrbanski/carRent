package pl.urbanskilukasz.carRent.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String telNumber;
    private LocalDate dateOfBirth;
}
