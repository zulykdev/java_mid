package com.brixton.input.service;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;

import java.util.List;

public interface PetService {

    Object savePet(PetGenericRequestDTO petForSave);

    Object updatePet(int idPet, PetGenericRequestDTO petForUpdate);

    List<Object> getPets();

    Object getPet(int idPet);

    boolean deletePet(int idPet);

}
