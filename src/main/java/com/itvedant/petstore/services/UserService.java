package com.itvedant.petstore.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.itvedant.petstore.entities.User;

@Service
public class UserService {
    private Map<Integer, User> users = new HashMap<>();

    private AtomicInteger atomic = new AtomicInteger(0);

    //Create
    public User addUser(User newUser){
        newUser.setId(atomic.incrementAndGet());
        users.put(newUser.getId(), newUser);
        return newUser;
    }

    //Read - All
    public List<User> getAll(){
        return new ArrayList<User>(users.values());
    }

    //Read - One
    public User getUser(Integer id){
        return users.get(id);
    }

    //Delete
    public String deleteUser(Integer id){
        users.remove(id);
        return "User Deleted";
    }

    //update
    public User updateUser(Integer id, User updatedUser){
        updatedUser.setId(id);
        users.put(id, updatedUser);
        return updatedUser;
    }
}
