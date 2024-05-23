package com.brixton.input.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PetGenericRequestDTO {

    int id;
    String name;
    String brithdate;
    CategoryRequestDTO category;
    String status;
    int age;
    String color;

}
