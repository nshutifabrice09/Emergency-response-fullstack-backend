package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long userId);
    User updateUser(Long userId, User user);
    void removeById(Long userId);

    <E> void saveUser(String username, String password, Set<E> role_user);
}
