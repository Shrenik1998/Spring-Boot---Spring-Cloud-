package com.demo.userservice.controller;

import com.demo.userservice.dtos.UserDto;
import com.demo.userservice.entity.User;
import com.demo.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validateUser(@RequestBody UserDto userDto) {
        boolean authenticate = userService.ValidateUser(userDto.getUsername(),userDto.getPassword());
        if(authenticate) {
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);
    }
}
