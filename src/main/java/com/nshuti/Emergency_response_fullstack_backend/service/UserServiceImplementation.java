package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImplementation implements UserService{
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }

    @Override
    public void removeById(Long userId) {

    }

    @Override
    public <E> void saveUser(String username, String password, Set<E> role_user) {

    }
}
