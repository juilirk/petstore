package com.itvedant.petstore.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

//this annotation is applied only on fields
@Target(ElementType.FIELD)
//this annotation is applied at the runtime
@Retention(RetentionPolicy.RUNTIME)
//here we are associating the annotation with the
//isValid method
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface PhoneNumber {
    String message() default "Invalid Phone Number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
