package com.demo.productservice.service;

import com.demo.productservice.dtos.UserDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticateUserImpl implements AuthenticateUser {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean authenticate(String username, String password) {
        String url = "http://USERSERVICE/users/validate";

        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        userDto.setPassword(password);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<UserDto> entity = new HttpEntity<>(userDto, headers);

        try {
            // Send the POST request with RestTemplate
            ResponseEntity<Boolean> response = restTemplate.postForEntity(url, entity, Boolean.class);

            // Return the response body, which contains the authentication status (true/false)
            return response.getBody();
        } catch (HttpClientErrorException e) {
            // Handle errors (e.g., 4xx or 5xx responses)
            System.out.println("Error occurred: " + e.getMessage());
            return false;
        }
    }
}
