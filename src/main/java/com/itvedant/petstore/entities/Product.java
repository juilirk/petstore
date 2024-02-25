package com.itvedant.petstore.entities;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
public class Product {
    private Integer id;

    @NotNull(message = "name cannot be null")
    @NotBlank(message = "name cannot be blank")
    private String name;

    @NotNull(message = "price cennot be null")
    @Min(value = 50, message = "price should be more than or equal to 50")
    @Max(value = 10000, message = "price should be less than or equal to 10000")
    private Double Price;

    @NotNull(message = "description cannot be null")
    @Length(min = 50, max = 300, message = "description should be of 50 - 300")
    private String description;
    
    @NotNull
    @NotEmpty
    private List<String> category;

    //@Past
    @PastOrPresent
    //@Future
    //@FutureOrPresent
    private LocalDate manufacturingDate;
}
