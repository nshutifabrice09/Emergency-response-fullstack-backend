package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.User;
import com.nshuti.Emergency_response_fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setName(user.getName());
            existUser.setEmail(user.getEmail());
            existUser.setPassword(user.getPassword());
            existUser.setPhoneNumber(user.getPhoneNumber());
            existUser.setRole(user.getRole());
            return userRepository.save(existUser);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        userRepository.deleteById(id);

    }
}
