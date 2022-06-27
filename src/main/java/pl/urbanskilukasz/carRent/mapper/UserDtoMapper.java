package pl.urbanskilukasz.carRent.mapper;

import pl.urbanskilukasz.carRent.model.dto.UserDto;
import pl.urbanskilukasz.carRent.model.user.User;

public class UserDtoMapper {
    public static User mapToUSer(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setTelNumber(userDto.getTelNumber());
        user.setDateOfBirth(userDto.getDateOfBirth());
        return user;
    }
}
