package com.itvedant.petstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.itvedant.petstore.entities.User;
import com.itvedant.petstore.entities.UserProjection;

//If we want to apply a projection for all the
//default request to the users api

@RepositoryRestResource(excerptProjection = UserProjection.class)
public interface UserRepository 
    extends CrudRepository<User, Integer>{
    
}
