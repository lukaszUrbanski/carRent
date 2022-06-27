package pl.urbanskilukasz.carRent.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanskilukasz.carRent.mapper.UserDtoMapper;
import pl.urbanskilukasz.carRent.model.dto.UserDto;
import pl.urbanskilukasz.carRent.model.user.User;
import pl.urbanskilukasz.carRent.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getSingleUser(Long id) {
        return userRepository.getById(id);
    }

    public User createUser(UserDto userDto) {
        User user = UserDtoMapper.mapToUSer(userDto);

        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
