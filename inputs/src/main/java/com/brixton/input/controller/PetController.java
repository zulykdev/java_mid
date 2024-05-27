package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/pet")
@Slf4j
public class PetController{

    Map<String, PetGenericRequestDTO> petInputs = new HashMap<>();
    Map<String, PetResponseDTO> petOutputs = new HashMap<>();

    /**
     * endpoint: PUT | /{idPet}
     * Actualizar la informacion de un Pet
     * @return 200 + objeto actualizado
     *          404 Si no se pudo actualizar
     */
    @PutMapping("/{idPet}")
    public ResponseEntity<PetResponseDTO> updatePet(@PathVariable int idPet, @RequestBody PetGenericRequestDTO petAActualizar) {
        /**
         * Proceso de eliminar mascota
         * 1. Buscar el Pet utilizando el Id ingresado
         * 2. En caso exista: Acualizar la información en el objeto encontrado
         * 3. En caso no exista: devolver 404
         */
        PetResponseDTO petTemporal = petOutputs.get(String.valueOf(idPet)); //Paso 1.
        if (petTemporal != null) { //En caso Exista
            petTemporal.setBirthdate(petAActualizar.getBrithdate());
            // petTemporal.setId(); //No debe hacerse porque se altera el identificador
            petTemporal.setName(petAActualizar.getName());
            petTemporal.setCategory(petAActualizar.getCategory());
            //petTemporal.setCreatedAt();//No debe hacerse porque se altera la fecha de creacion
            petTemporal.setStatus(petAActualizar.getStatus());
            petTemporal.setUpdatedAt(LocalDateTime.now().toString());
            return ResponseEntity.ok(petTemporal);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
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
        PetResponseDTO petTemporal = petOutputs.get(String.valueOf(idPet)); //Paso 1.
        if (petTemporal != null) {
            petOutputs.remove(String.valueOf(idPet));
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }

    /**
     * endpoint: GET | /
     * Obtiene la lista de pets registrados.
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<List<PetResponseDTO>> getPets(){
        /**
         * Proceso de Obtener mascotas
         * 1. Convertir el Mapa de petOutputs a una Lista
         * 2. Devolver la lista
         */
        List<PetResponseDTO> petResponseTemps = new ArrayList<>();
        petResponseTemps.addAll(petOutputs.values());

        //return ResponseEntity.ok(new ArrayList<>(petOutputs.values()));
        return ResponseEntity.ok(petResponseTemps);
    }

    /**
     * endpoint: GET | /{idPet}
     * Obtiene la mascota encontrada, sino devuelve 404 (Not Found)
     * @param idPet
     * @return
     */
    @GetMapping("/{idPet}")
    public ResponseEntity<PetResponseDTO> getPets(@PathVariable int idPet){
        /**
         * Proceso de Obtener 1 mascotas
         * 1. Buscar el ID en el Map
         * 2. En caso exista: Devolver la informacion del Paso 1
         * 3. En caso no exista: Mensaje indicando que no se encontró
         */
        PetResponseDTO petTemporal = petOutputs.get(String.valueOf(idPet)); //Paso 1.
        if (petTemporal != null) {
            return ResponseEntity.ok(petTemporal); //Paso 2.
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
    public ResponseEntity<PetResponseDTO> createPet(@RequestBody PetGenericRequestDTO input){
        /**
         * Proceso de Registro De Mascotas:
         * 1. Almacena el valor de entrada en una coleccion, petInputs
         * 2. Crea un objeto de tipo PetResponseDTO, con el objetivo de colocar el valor de fecha de creacion
         *    Es decir, createAt.
         * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, petOutputs
         * 4. Devuelvo el objeto creado (paso 2)
         */
        petInputs.put(String.valueOf(input.getId()), input);
        //Almacena la informacion para ser devuelta -response-
        PetResponseDTO ptr = new PetResponseDTO();
        ptr.setId(input.getId());
        ptr.setName(input.getName());
        ptr.setCategory(input.getCategory());
        ptr.setStatus(input.getStatus());
        ptr.setCreatedAt(LocalDate.now().toString());
        ptr.setBirthdate(input.getBrithdate());
        petOutputs.put(String.valueOf(input.getId()), ptr);
        //return ResponseEntity.ok(ptr);
        //return new ResponseEntity<>(HttpStatusCode.valueOf(204));
        return ResponseEntity.ok(ptr);
    }

}

//endpoints: http(s)://brixton.com/_____
//GET  | endpoints: http(s)://brixton.com/pet | No necesita parametros
//POST | endpoints: http(s)://brixton.com/pet | Necesita info similar a PetGenericRequestDTO.

