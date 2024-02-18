package com.itvedant.petstore.entities;

public class Product {
    private Integer id;
    private String name;
    private Double Price;
    private String description;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
}
