package com.itvedant.petstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.petstore.entities.RegisteredUser;

public interface RegisteredUserRepository
    extends JpaRepository<RegisteredUser, Integer>{
    
    //we will have to create a custom query method
    //to find the user by email which we are using
    RegisteredUser findByEmail(String email);
}
