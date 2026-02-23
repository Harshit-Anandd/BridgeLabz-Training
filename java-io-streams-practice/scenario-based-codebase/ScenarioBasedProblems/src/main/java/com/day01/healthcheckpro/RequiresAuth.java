package com.day01.healthcheckpro;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequiresAuth {
    String role() default "USER";
}