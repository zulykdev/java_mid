package com.brixton.input.service;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.model.Pet;
import com.brixton.input.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class PetServiceImpl implements PetService{

    private static final String USER_APP = "BRIXTON";

    Map<String, PetGenericRequestDTO> petInputs = new HashMap<>();
    Map<String, PetResponseDTO> petOutputs = new HashMap<>();


    Map<Integer, Pet> pets = new HashMap<>();

    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public PetServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(value.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });

        //module.addSerializer(LocalDateTimeSerializer);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
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
            String jsonInput = objectMapper.writeValueAsString(petForSave);

            Pet pet = objectMapper.readValue(jsonInput, Pet.class);
            pet.setCreatedAt(LocalDateTime.now());
            pet.setCreatedBy(USER_APP);
            pets.put(pet.getId(), pet);

            String jsonOutput = objectMapper.writeValueAsString(pet);
            PetResponseDTO output = objectMapper.readValue(jsonOutput, PetResponseDTO.class);
            return output;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object updatePet(int idPet, PetGenericRequestDTO petForUpdate) {
        try {
            String jsonInput = objectMapper.writeValueAsString(petForUpdate);
            Pet petTemporal = objectMapper.readValue(jsonInput, Pet.class);

            Pet original = pets.get(idPet);
            if (original != null) {
                original.setName(petTemporal.getName());
                original.setStatus(petTemporal.getStatus());
                original.setCategory(petTemporal.getCategory());
                original.setBirthdate(petTemporal.getBirthdate());
                original.setUpdatedAt(LocalDateTime.now());
                original.setUpdatedBy(USER_APP);
                String jsonOutput = objectMapper.writeValueAsString(original);
                PetResponseDTO output = objectMapper.readValue(jsonOutput, PetResponseDTO.class);
                return output;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object> getPets() {
        List<Object> petFounds = new ArrayList<>();
        for(Pet pet : pets.values()) {
            try {
                String jsonOutput = objectMapper.writeValueAsString(pet);
                PetResponseDTO output = objectMapper.readValue(jsonOutput, PetResponseDTO.class);
                petFounds.add(output);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return petFounds;
    }

    @Override
    public Object getPet(int idPet) {
        Pet petFound = pets.get(idPet);
        try {
            String jsonOutput = objectMapper.writeValueAsString(petFound);
            PetResponseDTO output = objectMapper.readValue(jsonOutput, PetResponseDTO.class);
            return output;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deletePet(int idPet) {
        Pet petToRemove = pets.remove(idPet);
        return (petToRemove == null ? false : true);
    }
}
