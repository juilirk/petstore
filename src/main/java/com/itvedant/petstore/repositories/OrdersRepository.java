package com.itvedant.petstore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.petstore.entities.Orders;

public interface OrdersRepository 
    extends CrudRepository<Orders, Integer>{
    
}
