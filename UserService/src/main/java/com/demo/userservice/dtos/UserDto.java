package com.demo.userservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    private int id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
