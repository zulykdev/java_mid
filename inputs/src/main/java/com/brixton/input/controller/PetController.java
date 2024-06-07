package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.service.PetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/pet")
@Slf4j
public class PetController{

    @Autowired
    private PetService petService;


    /**
     * endpoint: PUT | /{idPet}
     * Actualizar la informacion de un Pet
     * @return 200 + objeto actualizado
     *          404 Si no se pudo actualizar
     */
    @PutMapping("/{idPet}")
    public ResponseEntity<Object> updatePet(@PathVariable int idPet, @RequestBody PetGenericRequestDTO petForUpdate) {
        /**
         * Proceso de eliminar mascota
         * 1. Buscar el Pet utilizando el Id ingresado
         * 2. En caso exista: Acualizar la información en el objeto encontrado
         * 3. En caso no exista: devolver 404
         */
        Object petUpdated = petService.updatePet(idPet, petForUpdate);
        if (petUpdated != null) {
            return ResponseEntity.ok(petUpdated);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }


    /**
     * endpoint: DELETE | /{idPet}
     * Elimina un Pet
     * @return  204 si se elimino con exito
     *          404 si no se pudo eliminar -no se encontro el pet, -identificador malformado-
     */
    @DeleteMapping("/{idPet}")
    public ResponseEntity deletePet(@PathVariable int idPet){
        /**
         * Proceso de eliminar mascota
         * 1. Buscar el Pet utilizando el Id ingresado
         * 2. En caso exista: debe eliminarse y devolver 204.
         * 3. En caso no exista: devolver 404
         */
        boolean successfull = petService.deletePet(idPet);
        if (successfull) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }

    /**
     * endpoint: GET | /
     * Obtiene la lista de pets registrados.
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<List<Object>> getPets(){
        return ResponseEntity.ok(petService.getPets());
    }

    /**
     * endpoint: GET | /{idPet}
     * Obtiene la mascota encontrada, sino devuelve 404 (Not Found)
     * @param idPet
     * @return
     */
    @GetMapping("/{idPet}")
    public ResponseEntity<Object> getPet(@PathVariable int idPet){
        Object petFound = petService.getPet(idPet);
        if (petFound != null) {
            return ResponseEntity.ok(petFound);
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }


    /**
     * endpoint: POST | /
     * Registra Pet
     * @param input Contiene la informacion del Pet
     * @return El Pet creado + fecha creacion (createdAt)
     */
    @PostMapping("/")
    public ResponseEntity<Object> createPet(@RequestBody PetGenericRequestDTO input){
        return ResponseEntity.ok(petService.savePet(input));
    }

}

//endpoints: http(s)://brixton.com/_____
//GET  | endpoints: http(s)://brixton.com/pet | No necesita parametros
//POST | endpoints: http(s)://brixton.com/pet | Necesita info similar a PetGenericRequestDTO.

