package com.itvedant.petstore.services;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.petstore.entities.User;
import com.itvedant.petstore.repositories.UserRepository;

@Service
public class UserService {
    //private Map<Integer, User> users = new HashMap<>();

    //private AtomicInteger atomic = new AtomicInteger(0);

    @Autowired
    private UserRepository userRepository;
    
    //Create
    public User addUser(User newUser){
        return this.userRepository.save(newUser);
    }

    //Read - All
    public Iterable<User> getAll(){
        return this.userRepository.findAll();
    }

    //Read - One
    public User getUser(Integer id){
        return this.userRepository.findById(id).orElse(null);
    }

    //Delete
    public String deleteUser(Integer id){
        this.userRepository.deleteById(id);
        return "User Deleted";
    }

    //update
    public User updateUser(Integer id, User updateUser){
        updateUser.setId(id);
        return this.userRepository.save(updateUser);
    }
}
