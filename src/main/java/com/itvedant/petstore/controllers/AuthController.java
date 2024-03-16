package com.itvedant.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.petstore.entities.RegisteredUser;
import com.itvedant.petstore.services.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService service;
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisteredUser user){
        return ResponseEntity.ok(this.service.register(user));
    }
}
