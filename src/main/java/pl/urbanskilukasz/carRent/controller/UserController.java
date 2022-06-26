package pl.urbanskilukasz.carRent.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.urbanskilukasz.carRent.model.user.User;
import pl.urbanskilukasz.carRent.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getSingleUser(@PathVariable Long id){
        return userService.getSingleUser(id);
    }

    @PostMapping("")
    public User createUser (@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("")
        public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
