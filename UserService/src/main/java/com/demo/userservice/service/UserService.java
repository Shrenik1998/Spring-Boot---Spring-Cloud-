package com.demo.userservice.service;

import com.demo.userservice.entity.User;

public interface UserService {
    public boolean ValidateUser(String username, String password);
}
