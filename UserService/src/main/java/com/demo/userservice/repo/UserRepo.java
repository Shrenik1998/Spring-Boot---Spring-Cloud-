package com.demo.userservice.repo;

import com.demo.userservice.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    List<User> users = new ArrayList<>();

    public UserRepo() {
        User user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("1234");
        users.add(user);
    }

    public void addUser(User user) {
        user.setId(users.size() + 1);
        users.add(user);
    }

    public User getUserByUserName(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
