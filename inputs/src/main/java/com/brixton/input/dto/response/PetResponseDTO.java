package com.brixton.input.dto.response;

import com.brixton.input.dto.request.CategoryRequestDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetResponseDTO {

    int id;
    String name;
    String birthdate;
    CategoryRequestDTO category;
    String status;
    String createdAt;
    String updatedAt;

}
