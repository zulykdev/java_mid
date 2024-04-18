package com.brixton.javamid.herencia;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        log.info("PERSONA 1 antes de colocar datos"+ persona1);
        persona1.setNombre("ISA");
        persona1.setApellido("N");
        LocalDate fechaNacimientoDePersona1 = LocalDate.now(); //17/04/2024 22:50
        //
        DocumentoIdentidad dniPersona1 = new DocumentoIdentidad();
        dniPersona1.setNumero("70245555");
        dniPersona1.setTipo("DNI");
        //

        persona1.setFechaNacimiento(fechaNacimientoDePersona1);
        persona1.setDocumentoIdentidad(dniPersona1);



        log.info("PERSONA 1"+ persona1);

    }
}
