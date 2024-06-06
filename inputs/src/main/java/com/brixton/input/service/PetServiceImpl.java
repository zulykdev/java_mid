package com.brixton.input.service;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.model.Pet;
import com.brixton.input.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class PetServiceImpl implements  PetService{

    private static final String USER_APP = "BRIXTON";

    Map<String, PetGenericRequestDTO> petInputs = new HashMap<>();
    Map<String, PetResponseDTO> petOutputs = new HashMap<>();


    Map<Integer, Pet> pets = new HashMap<>();

    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public PetServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        objectMapper.registerModule(module);
    }

    @Override
    public Object savePet(PetGenericRequestDTO petForSave) {
        //Ingreso un DTO --- PetGenericRequestDTO
        //Convertir el PetGenericRequestDTO en Pet
        //Conversion de un DTO a una clase de Dominio y viceversa
        // 1. Utilizar un ObjectMapper (una libreria Jackson)
        // 2. MapStruct (Libreria en desarrollo vigente)
        // 3. Copia de valores uno a uno
        try {
            String source = objectMapper.writeValueAsString(petForSave);
            Pet pet = objectMapper.readValue(source, Pet.class);
            pet.setCreatedAt(LocalDateTime.now());
            pet.setCreatedBy(USER_APP);
            pets.put(pet.getId(), pet);

            String sourceOutput = objectMapper.writeValueAsString(pet);
            PetResponseDTO output = objectMapper.readValue(sourceOutput, PetResponseDTO.class);
            return output;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object updatePet(PetGenericRequestDTO petForUpdate) {
        return null;
    }

    @Override
    public List<Object> getPets() {
        return null;
    }

    @Override
    public Object deletePet(int idPet) {
        return null;
    }
}
