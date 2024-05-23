package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@Slf4j
public class PetController {

    /**
     * Devuelve le objeto Pet creado.
     * @return
     */
    @GetMapping("/pet")
    public PetResponseDTO getPets(){
        log.info("se llamó a getPets ");
        PetResponseDTO EntityResponse;
        return new PetResponseDTO();
    }


    @PostMapping("/pet")
    public void createPet(@RequestBody PetGenericRequestDTO petForCreate){
        log.info("Valores de Pet recibidos: {}", petForCreate);
        log.info("fin de mis operaciones");
    }

}

//endpoints: http(s)://brixton.com/_____
//GET  | endpoints: http(s)://brixton.com/pet | No necesita parametros
//POST | endpoints: http(s)://brixton.com/pet | Necesita info similar a PetGenericRequestDTO.

