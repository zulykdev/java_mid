package com.brixton.input.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PetGenericRequestDTO {

    int id;
    String name;
    String birthdate;
    CategoryRequestDTO category;
    String status;
    @JsonIgnore
    int age;
    @JsonIgnore
    String color;

}
