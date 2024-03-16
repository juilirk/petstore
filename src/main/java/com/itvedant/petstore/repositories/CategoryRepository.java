package com.itvedant.petstore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.petstore.entities.Category;

public interface CategoryRepository
    extends CrudRepository<Category, Integer> {
    
}
