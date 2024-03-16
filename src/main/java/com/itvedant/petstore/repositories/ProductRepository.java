package com.itvedant.petstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import com.itvedant.petstore.entities.Product;

import jakarta.annotation.security.RolesAllowed;

public interface ProductRepository 
    extends JpaRepository<Product, Integer>{
    //this method will create a select query
    //in which a where clause will be added to 
    //create the condition on name column
    @PreAuthorize("hasRole('HR')")
    List<Product> findByName(String name);

    @RolesAllowed("IT")
    @RestResource(path = "pricegreater")
    List<Product> findByPriceGreaterThan(Double input);

    @Secured("ROLE_HR")
    @RestResource(path = "priceless")
    List<Product> findByPriceLessThan(Double value);
}
