package com.demo.userservice.service;

import com.demo.userservice.entity.User;
import com.demo.userservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean ValidateUser(String username, String password) {
        User user = userRepo.getUserByUserName(username);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(password)) {
            return false;
        }
        return true;
    }
}
