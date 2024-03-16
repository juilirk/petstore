package com.itvedant.petstore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.petstore.entities.Address;

public interface AddressRepository extends
    CrudRepository<Address, Integer> {
    
}
