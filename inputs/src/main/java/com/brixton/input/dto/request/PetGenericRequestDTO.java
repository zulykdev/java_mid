package com.brixton.input.dto.request;

import lombok.Getter;

@Getter
public class PetGenericRequestDTO {

    int id;
    String name;
    String birthdate;
    CategoryRequestDTO category;
    String status;
    int age;
    String color;

}
