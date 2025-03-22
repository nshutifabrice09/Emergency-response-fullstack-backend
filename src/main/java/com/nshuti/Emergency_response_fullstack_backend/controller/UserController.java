package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.exception.UserNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.model.User;
import com.nshuti.Emergency_response_fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/list/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/find/user/{userId}")
    User getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }

    @PutMapping("/edit/user/{userId}")
    User updateUser(@RequestBody User newUser, @PathVariable Long userId) {
        return userRepository.findById(userId)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setPhoneNumber(newUser.getPhoneNumber());
                    user.setRole(newUser.getRole());
                    user.setLatitude(newUser.getLatitude());
                    user.setLongitude(newUser.getLongitude());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(userId));
    }

    @DeleteMapping("/delete/users/{userId}")
    String deleteUser (@PathVariable Long userId){
        if(!userRepository.existsById(userId)){
            throw new UserNotFoundException(userId);
        }
        userRepository.deleteById(userId);
        return "User with id "+userId+" has been deleted successfully";
    }

}
