package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return new PetResponseDTO();
    }


    @PostMapping("/pet")
    public void createPet(PetGenericRequestDTO petForCreate){
        log.info("Valores de Pet recibidos: {}", petForCreate);
        log.info("fin de mis operaciones");
    }

}
