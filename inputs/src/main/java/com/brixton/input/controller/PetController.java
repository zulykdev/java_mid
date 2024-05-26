package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class PetController {

    Map<String, PetGenericRequestDTO> pets = new HashMap<>();

    /**
     * Ejercicio: Devolver la informacion de getPets, con el tipo de dato PetResponseDTO
     @GetMapping("/pet")
     public ResponseEntity<List<PetResponseDTO>> getPets(){
     log.info("Se devuelve los pets registrados -getPets");
     return ResponseEntity.ok(______________);
     }
     * */

    /**
     * Devuelve le objeto Pet creado.
     * @return
     */
    @GetMapping("/pet")
    public ResponseEntity<List<PetGenericRequestDTO>> getPets(){
        log.info("Se devuelve los pets registrados -getPets");
        return ResponseEntity.ok(new ArrayList<>(pets.values()));
    }


    @PostMapping("/pet")
    public ResponseEntity<PetResponseDTO> createPet(@RequestBody PetGenericRequestDTO input){
        log.info("Ingreso al metodo createPet");
        log.info("Valores de Pet recibidos: {}", input);
        /**
         * Para almacenar la list
         */
        pets.put(String.valueOf(input.getId()), input);
        System.out.println("Mascotas registradas: " + pets.size());

        //Almacena la informacion para ser devuelta -response-
        PetResponseDTO ptr = new PetResponseDTO();
        ptr.setId(input.getId());
        ptr.setName(input.getName());
        ptr.setCategory(input.getCategory());
        ptr.setStatus(input.getStatus());
        ptr.setCreatedAt(LocalDate.now().toString());

        //Devuelve la informacion
        return ResponseEntity.ok(ptr);
    }

}

//endpoints: http(s)://brixton.com/_____
//GET  | endpoints: http(s)://brixton.com/pet | No necesita parametros
//POST | endpoints: http(s)://brixton.com/pet | Necesita info similar a PetGenericRequestDTO.

