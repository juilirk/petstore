package com.itvedant.petstore.entities;

import org.hibernate.validator.constraints.Length;

import com.itvedant.petstore.validators.PhoneNumber;
import com.itvedant.petstore.validators.VerifyPassword;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@VerifyPassword(field = "password" , matchingField = "confirmPassword")
public class User {
    private Integer id;

    @NotNull
    @Length(min = 3)
    private String firstName;

    @NotNull
    @Length(min = 4)
    private String lastName;

    @NotNull
    @Email
    private String email;

    @NotNull
    @PhoneNumber
    private String phone;

    private String password;
    private String confirmPassword;
}
