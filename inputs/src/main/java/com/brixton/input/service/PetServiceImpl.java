package com.brixton.input.service;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.model.Category;
import com.brixton.input.model.Pet;
import com.brixton.input.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class PetServiceImpl implements  PetService{

    Map<String, PetGenericRequestDTO> petInputs = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public PetServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        objectMapper.registerModule(module);
    }

    @Override
    public Object savePet(PetGenericRequestDTO petForSave) {
        log.info("LLEGUE A ISAIIMPL");
        //Ingreso un DTO --- PetGenericRequestDTO
        //Convertir el PetGenericRequestDTO en Pet
        //Conversion de un DTO a una clase de Dominio y viceversa
        // 1. Utilizar un ObjectMapper (una libreria Jackson)
        // 2. MapStruct (Libreria en desarrollo vigente)
        // 3. Copia de valores uno a uno
        try {
            String source = objectMapper.writeValueAsString(petForSave);
            Pet pet = objectMapper.readValue(source, Pet.class);
            log.info(pet.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }





        //Al devolver la informacion PetResponseDTO
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
