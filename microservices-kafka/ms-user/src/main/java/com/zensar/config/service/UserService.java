package com.zensar.config.service;

import com.zensar.config.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();
}
