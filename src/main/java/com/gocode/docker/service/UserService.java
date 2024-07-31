package com.gocode.docker.service;



import com.gocode.docker.entity.User;

import java.util.List;

public interface UserService {
    void registerUser(User user);

    boolean loginUser(User user);

    List<User> getAllUsers();
}
